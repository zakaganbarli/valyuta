import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valyuta daxil edin");
        String valyuta = scanner.nextLine().toLowerCase();
        System.out.println("Hedef valyutani daxil edin");
        String hedefValyuta = scanner.nextLine().toLowerCase();
        System.out.println("Deyeri daxil edin");
        double deyer = scanner.nextDouble();

        switch (valyuta) {
            case "usd":
                switch (hedefValyuta) {
                    case "usd":
                        System.out.println("Netice: " + (deyer * 1));
                        break;
                    case "azn":
                        System.out.println("Netice: " + (deyer * 1.70));
                        break;
                    case "euro":
                        System.out.println("Netice: " + (deyer * 0.92));
                        break;
                }
                break;
            case "azn":
                switch (hedefValyuta) {
                    case "usd":
                        System.out.println("Netice: " + (deyer * 0.59));
                        break;
                    case "azn":
                        System.out.println("Netice: " + (deyer * 1));
                        break;
                    case "euro":
                        System.out.println("Netice: " + (deyer * 0.54));
                        break;
                }
                break;
            case "euro":
                switch (hedefValyuta) {
                    case "usd":
                        System.out.println("Netice: " + (deyer * 1.09));
                        break;
                    case "azn":
                        System.out.println("Netice: " + (deyer * 1.85));
                        break;
                    case "euro":
                        System.out.println("Netice: " + (deyer * 1));
                        break;
                }
                break;
        }
    }
}

