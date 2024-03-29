package irvine.oeis.a307;
// Generated by gen_seq4.pl holos at 2024-02-09 22:47

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A307529 G.f. A(x) satisfies: A(x) = (1 - x^2*A(x)^2)/(1 - x^2*A(x)^2 - x^3*A(x)^3).
 * G.f.A(x) satisfies -A+(-A^2*x^2+1)/(-A^3*x^3-A^2*x^2+1)=0
 * @author Georg Fischer
 */
public class A307529 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307529() {
    super(0, "[[0], [3655680, -2018560, 415360, -37760, 1280], [-27457920, 16294080, -3617600, 356160, -13120], [57208320, -38310144, 9627392, -1075776, 45088], [-39696000, 32684480, -10003456, 1350400, -67904], [10126080, -9076288, 2918560, -392816, 18056], [2818560, -4864732, 2910068, -738452, 68188], [1551360, -1840676, 699446, -73546, -4964], [-253320, 486196, -302720, 78212, -8368], [0, 45172, -81466, 43148, -6854], [0, 5290, -2645, -5290, 2645]]", "1, 0, 0, 1, 0, 1, 4, 1, 10, 23, 18", 0, 0);
  }
}
