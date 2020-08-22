package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029719 Theta series of odd 8-dimensional 5-modular lattice O(5).
 * @author Sean A. Irvine
 */
public class A029719 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029719() {
    super(new long[][]{
      {3, 0, 0, 0, -1, 1, 1, 1},
      {0, 3, 0, 0, 1, -1, 1, 1},
      {0, 0, 3, 0, 1, 1, -1, 1},
      {0, 0, 0, 3, 1, 1, 1, -1},
      {-1, 1, 1, 1, 3, 0, 0, 0},
      {1, -1, 1, 1, 0, 3, 0, 0},
      {1, 1, -1, 1, 0, 0, 3, 0},
      {1, 1, 1, -1, 0, 0, 0, 3}
    });
  }
}
