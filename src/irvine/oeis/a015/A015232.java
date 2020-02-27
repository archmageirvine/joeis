package irvine.oeis.a015;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A015232 Theta series of lattice <code>Kappa_10</code>.
 * @author Sean A. Irvine
 */
public class A015232 extends GramMatrixThetaSeries {

  // Very slow

  /** Construct the sequence. */
  public A015232() {
    super(new long[][]{
      {4, -2, 0, 0, 0, 0, 0, 0, 0, 0},
      {-2, 4, -2, 2, 0, 0, 0, 0, 0, 0},
      {0, -2, 4, 0, 0, 2, 0, 2, 2, 1},
      {0, 2, 0, 4, 2, 2, 0, 2, 1, 1},
      {0, 0, 0, 2, 4, 2, 2, 1, 1, 1},
      {0, 0, 2, 2, 2, 4, 1, 2, 2, 2},
      {0, 0, 0, 0, 2, 1, 4, 1, 2, -1},
      {0, 0, 2, 2, 1, 2, 1, 4, 2, 1},
      {0, 0, 2, 1, 1, 2, 2, 2, 4, 1},
      {0, 0, 1, 1, 1, 2, -1, 1, 1, 4}
    }, 2);
  }
}
