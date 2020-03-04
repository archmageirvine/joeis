package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029721 Theta series of 6-dimensional extremal 5-modular lattice <code>Q6(4)^{+2}</code>.
 * @author Sean A. Irvine
 */
public class A029721 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029721() {
    super(new long[][]{
      {3, -1, -1, 1, 1, 0},
      {-1, 3, -1, -1, 0, 1},
      {-1, -1, 3, 0, -1, -1},
      {1, -1, 0, 3, -1, 1},
      {1, 0, -1, -1, 3, -1},
      {0, 1, -1, 1, -1, 3}
    });
  }
}
