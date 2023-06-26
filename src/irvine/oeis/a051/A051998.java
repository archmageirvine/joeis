package irvine.oeis.a051;
// manually finifull at 2021-09-21 20:24

import irvine.oeis.FiniteSequence;

/**
 * A051998 Consider real quadratic fields of ERD-type with class groups of exponent 2 and discriminants of the form D = r^2*k^2+4k, k odd; sequence gives values of k.
 * @author Georg Fischer
 */
public class A051998 extends FiniteSequence {

  /** Construct the sequence. */
  public A051998() {
    super(1, FINITE, 1, -15, -5, -17, -19, -21, 1, -3, 1, 1, 5, 3, -33, 1, -35, -5, 5, -39, -13, -41, 3, 1, 1, -15, 
        -3, 3, 5, 15, -7, -51, 1, 3, -55, 1, -5, 5, -3, 1, -21, -65, 5, 13, -69, 3, -15, 5, -11, 7, 3, -17, 17, 
        -89, 29, -91, 13, -95, -5, 33, 1, -15, 35, 39, 11, 5, 1, 3, 19, 5, -11, 5, -51, 5, 53, -165, -7, -3, 1, 21, -29, -5, 21);
  }
}
