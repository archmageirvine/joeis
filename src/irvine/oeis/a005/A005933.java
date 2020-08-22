package irvine.oeis.a005;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A005933 Theta series of laminated lattice LAMBDA_9.
 * @author Sean A. Irvine
 */
public class A005933 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A005933() {
    super(new long[][] {
      {4, -2, 0, 0, 0, 0, 0, 0, 0},
      {-2, 4, -2, 2, 0, 0, 0, 0, 0},
      {0, -2, 4, 0, 0, 2, 0, 0, 0},
      {0, 2, 0, 4, 2, 2, 0, 0, 0},
      {0, 0, 0, 2, 4, 2, 0, 0, 2},
      {0, 0, 2, 2, 2, 4, 2, 2, 1},
      {0, 0, 0, 0, 0, 2, 4, 2, 0},
      {0, 0, 0, 0, 0, 2, 2, 4, 0},
      {0, 0, 0, 0, 2, 1, 0, 0, 4},
    });
  }
}
