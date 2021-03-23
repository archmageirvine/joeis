package irvine.oeis.a045;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A045866 Theta series of quadratic form with Gram matrix [ 2, 1, 0, 1; 1, 8, 1, -3; 0, 1, 10, 2; 1, -3, 2, 12 ].
 * @author Georg Fischer
 */
public class A045866 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A045866() {
    super(new long[][] {
      {2,  1,  0,  1},
      {1,  8,  1, -3},
      {0,  1, 10,  2},
      {1, -3,  2, 12}
    }, 2);
  }
}
