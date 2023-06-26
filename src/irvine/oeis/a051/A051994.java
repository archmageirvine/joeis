package irvine.oeis.a051;
// manually finifull at 2021-09-21 20:24

import irvine.oeis.FiniteSequence;

/**
 * A051994 Consider real quadratic fields of ERD-type with class groups of exponent 2 and discriminants of the form D = r^2*k^2+2k, k odd; sequence gives values of r.
 * @author Georg Fischer
 */
public class A051994 extends FiniteSequence {

  /** Construct the sequence. */
  public A051994() {
    super(1, FINITE, 6, 7, 8, 3, 10, 11, 11, 4, 12, 14, 3, 5, 16, 17, 6, 6, 4, 20, 4, 7, 7, 3, 
        22, 23, 8, 5, 25, 25, 5, 26, 4, 28, 4, 29, 6, 30, 32, 11, 7, 36, 12, 13, 3, 8, 14, 
        44, 3, 9, 16, 7, 7, 17, 17, 4, 18, 5, 19, 4, 61, 62, 3, 2, 5, 26, 27, 17, 20, 6, 16, 
        39, 28, 146, 30, 23, 61, 22);
  }
}
