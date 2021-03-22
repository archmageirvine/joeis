package irvine.oeis.a045;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A045867 Theta series of quadratic form with Gram matrix [ 4, 1, 2, 1; 1, 4, 1, 0; 2, 1, 6, -2; 1, 0, -2, 20 ].
 * @author Georg Fischer
 */
public class A045867 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A045867() {
    super(new long[][] {
      {4,  1,  2,  1},
      {1,  4,  1,  0},
      {2,  1,  6, -2},
      {1,  0, -2, 20}
    }, 2);
  }
}