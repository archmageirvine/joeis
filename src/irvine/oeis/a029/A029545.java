package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029545 Theta series of <code>10-dimensional 2-modular</code> lattice of minimal norm 2.
 * @author Sean A. Irvine
 */
public class A029545 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029545() {
    super(new long[][] {
      {2, 1, 1, 1, 1, -1, 1, 0, -1, 0},
      {1, 2, 1, 1, 1, 0, 0, 1, 0, -1},
      {1, 1, 2, 1, 1, -1, 1, 0, -1, 0},
      {1, 1, 1, 2, 1, -1, 1, 0, -1, 0},
      {1, 1, 1, 1, 2, -1, 1, 1, -1, -1},
      {-1, 0, -1, -1, -1, 3, -1, 0, 1, 0},
      {1, 0, 1, 1, 1, -1, 3, 0, -1, 0},
      {0, 1, 0, 0, 1, 0, 0, 3, 0, -1},
      {-1, 0, -1, -1, -1, 1, -1, 0, 3, 0},
      {0, -1, 0, 0, -1, 0, 0, -1, 0, 3}
    });
  }
}
