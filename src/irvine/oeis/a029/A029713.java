package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029713 Theta series of 6-dimensional 8-modular lattice of minimal norm 4.
 * @author Sean A. Irvine
 */
public class A029713 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029713() {
    super(new long[][]{
      {4, 1, -1, -1, 1, -1},
      {1, 4, 0, 1, 2, 1},
      {-1, 0, 4, -1, 2, -1},
      {-1, 1, -1, 4, -1, 0},
      {1, 2, 2, -1, 4, -1},
      {-1, 1, -1, 0, -1, 4}
    }, 2);
  }
}
