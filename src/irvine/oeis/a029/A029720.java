package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029720 Theta series of 8-dimensional strongly 6-modular lattice O(6) with minimal norm 3.
 * @author Sean A. Irvine
 */
public class A029720 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029720() {
    super(new long[][]{
      {3, 1, 0, -1, 0, 1, 0, 0},
      {1, 3, 0, 0, -1, 0, -1, 0},
      {0, 0, 3, -1, 0, -1, 0, 1},
      {-1, 0, -1, 3, 0, 0, -1, 0},
      {0, -1, 0, 0, 3, 1, 0, 1},
      {1, 0, -1, 0, 1, 3, 0, 0},
      {0, -1, 0, -1, 0, 0, 3, -1},
      {0, 0, 1, 0, 1, 0, -1, 3}
    });
  }
}
