package irvine.oeis.a015;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A015236 Theta series of lattice Kappa_7.
 * @author Sean A. Irvine
 */
public class A015236 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A015236() {
    super(new long[][]{
      {4, -2, 0, 0, 0, 0, 0},
      {-2, 4, -2, 2, 0, 0, 0},
      {0, -2, 4, 0, 0, 2, 0},
      {0, 2, 0, 4, 2, 2, 0},
      {0, 0, 0, 2, 4, 2, 2},
      {0, 0, 2, 2, 2, 4, 1},
      {0, 0, 0, 0, 2, 1, 4}
    }, 2);
  }
}
