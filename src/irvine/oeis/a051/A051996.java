package irvine.oeis.a051;
// manually finifull at 2021-09-21 20:24

import irvine.oeis.FiniteSequence;

/**
 * A051996 Consider real quadratic fields of ERD-type with class groups of exponent 2 and discriminants of the form D = r^2*k^2+k, k odd; sequence gives values of k.
 * @author Georg Fischer
 */

public class A051996 extends FiniteSequence {

  /** Construct the sequence. */
  public A051996() {
    super(1, -1, 1, 5, -1, 3, -7, 1, -3, -5, 5, -11, 1, -1, 1, 13, -1, 7, -15, -3, 5, -1, 1, 3, 
        1, -5, 21, -1, 1, 1, -13, -15, 3, 15, -31, 1, -1, 1, 17, -35, -7, 5, -1, 1, 19, -39, -3, -5, 
        5, 41, 3, 5, -23, 1, 1, -3, 17, 13, -1, -19, -29, 1, -3, 5, -31, 21, 33, -3, -7, 35, 3, 
        1, -15, -19, -39, 5, 41, -21, -11, 11, 5, 1, 5, -55, 55, 29, 5, -11, 1, -35, 35, 1, -7, -3, 1, 1, -15, 21);
  }
}
