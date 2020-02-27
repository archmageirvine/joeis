package irvine.oeis.a015;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A015233 Theta series of lattice <code>Kappa_9</code>.
 * @author Sean A. Irvine
 */
public class A015233 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A015233() {
    super(new long[][]{
      {4, -2, 0, 0, 0, 0, 0, 0, 0},
      {-2, 4, -2, 2, 0, 0, 0, 0, 0},
      {0, -2, 4, 0, 0, 2, 0, 2, 2},
      {0, 2, 0, 4, 2, 2, 0, 2, 1},
      {0, 0, 0, 2, 4, 2, 2, 1, 1},
      {0, 0, 2, 2, 2, 4, 1, 2, 2},
      {0, 0, 0, 0, 2, 1, 4, 1, 2},
      {0, 0, 2, 2, 1, 2, 1, 4, 2},
      {0, 0, 2, 1, 1, 2, 2, 2, 4},
    }, 2);
  }
}
