package com.ocr.anthony;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("choix Menu");
        System.out.println("1 - Poulet");
        System.out.println("2 - Boeuf");
        System.out.println("3 - Vegetarien");
        System.out.println("Que souhaitez vous comme menu ?");
    }


    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        if (nbMenu == 1) {

            System.out.println("Vous avez choisi comme menu : poulet");

        } else if (nbMenu == 2) {

            System.out.println("Vous avez choisi comme menu : boeuf");

        } else if (nbMenu == 3) {

            System.out.println("Vous avez choisi comme menu : végétarien");

        } else {

            System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");

        }

    }
}