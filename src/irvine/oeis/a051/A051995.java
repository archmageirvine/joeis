package irvine.oeis.a051;
// manually finifull at 2021-09-21 20:24

import irvine.oeis.FiniteSequence;

/**
 * A051995 Consider real quadratic fields of ERD-type with class groups of exponent 2 and discriminants of the form D = r^2*k^2+4k, k odd; sequence gives values of r.
 * @author Georg Fischer
 */
public class A051995 extends FiniteSequence {

  /** Construct the sequence. */
  public A051995() {
    super(9, 1, 3, 1, 1, 1, 19, 7, 23, 25, 5, 9, 1, 31, 1, 7, 7, 1, 3, 1, 13, 41, 43, 3, 15, 15, 9, 3, 
        7, 1, 49, 17, 1, 53, 11, 11, 19, 59, 3, 1, 13, 4, 1, 23, 5, 15, 7, 11, 27, 5, 5, 1, 3, 1, 7, 1, 19, 
        3, 101, 7, 3, 3, 11, 25, 127, 43, 7, 27, 13, 29, 3, 31, 3, 1, 25, 59, 179, 9, 7, 47, 13);
  }
}
