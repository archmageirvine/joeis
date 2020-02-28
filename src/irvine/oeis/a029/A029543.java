package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029543 Theta series of 6-dimensional lattice of det 8.
 * @author Sean A. Irvine
 */
public class A029543 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029543() {
    super(new long[][]{
      {2, 0, -1, 0, 0, 0},
      {0, 2, 1, 0, 0, 0},
      {-1, 1, 2, 1, 0, 0},
      {0, 0, 1, 2, 1, 0},
      {0, 0, 0, 1, 2, 1},
      {0, 0, 0, 0, 1, 3}
    });
  }
}
