package irvine.oeis.a051;
// manually finifull at 2021-09-21 20:24

import irvine.oeis.FiniteSequence;

/**
 * A051997 Consider real quadratic fields of ERD-type with class groups of exponent 2 and discriminants of the form D = r^2*k^2+2k, k odd; sequence gives values of k.
 * @author Georg Fischer
 */

public class A051997 extends FiniteSequence {

  /** Construct the sequence. */
  public A051997() {
    super(-1, 1, 1, 3, 1, -1, 1, -3, 1, -1, -5, 3, 1, -1, -3, 3, -5, 1, 5, -3, 3, 7, -1, -1, -3, -5, -1, 1, 5, 1, -7, -1, 
        7, 1, -5, 1, -1, 3, 5, 1, 3, -3, 13, 5, 3, 1, -15, -5, 3, -7, 7, -3, 3, 13, -3, -11, 3, -15, 1, -1, -21, -33, 15, 
        3, -3, -5, 5, -17, 7, 3, 5, 1, -5, 7, 3, -13);
  }
}
