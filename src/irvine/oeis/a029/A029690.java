package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029690 Theta series of 6-dimensional lattice <code>P6.4 = A6,2</code>.
 * @author Sean A. Irvine
 */
public class A029690 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029690() {
    super(new long[][] {
      {4, 1, 2, 2, 2, 2},
      {1, 4, 2, 2, 2, 2},
      {2, 2, 4, 1, 1, 2},
      {2, 2, 1, 4, 1, 2},
      {2, 2, 1, 1, 4, 2},
      {2, 2, 2, 2, 2, 4}
    }, 2);
  }
}
