package irvine.oeis.a015;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A015235 Theta series of lattice Kappa_8.
 * @author Sean A. Irvine
 */
public class A015235 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A015235() {
    super(new long[][]{
      {4, -2, 0, 0, 0, 0, 0, 0},
      {-2, 4, -2, 2, 0, 0, 0, 0},
      {0, -2, 4, 0, 0, 2, 0, 2},
      {0, 2, 0, 4, 2, 2, 0, 2},
      {0, 0, 0, 2, 4, 2, 2, 1},
      {0, 0, 2, 2, 2, 4, 1, 2},
      {0, 0, 0, 0, 2, 1, 4, 1},
      {0, 0, 2, 2, 1, 2, 1, 4}
    }, 2);
  }
}
