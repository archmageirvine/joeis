package irvine.oeis.a051;
// manually finifull at 2021-09-21 20:24

import irvine.oeis.FiniteSequence;

/**
 * A051993 Consider real quadratic fields of ERD-type with class groups of exponent 2 and discriminants of the form D = r^2*k^2+k, k odd; sequence gives values of r.
 * @author Georg Fischer
 */
public class A051993 extends FiniteSequence {

  /** Construct the sequence. */
  public A051993() {
    super(1, FINITE, 3, 4, 5, 1, 6, 2, 1, 8, 3, 2, 2, 1, 11, 12, 13, 1, 14, 2, 1, 5, 3, 16, 17, 6, 19, 4, 1, 22, 22, 23, 2, 2, 
        10, 2, 1, 31, 34, 34, 2, 1, 5, 7, 36, 37, 2, 1, 13, 8, 8, 1, 14, 9, 2, 46, 47, 16, 3, 4, 56, 3, 2, 58, 20, 12, 
        2, 3, 2, 23, 10, 2, 24, 73, 5, 4, 2, 16, 2, 4, 8, 8, 19, 98, 20, 2, 2, 4, 24, 11, 122, 4, 4, 142, 26, 68, 242, 278, 22, 32);
  }
}
