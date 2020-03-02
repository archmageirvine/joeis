package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029695 Theta series of 6-dimensional perfect lattice <code>P6.6 = A6,1</code>.
 * @author Sean A. Irvine
 */
public class A029695 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029695() {
    super(new long[][] {
      {4, 1, 2, 2, 2, 2},
      {1, 4, 2, 2, 2, 2},
      {2, 2, 4, 1, 2, 2},
      {2, 2, 1, 4, 2, 2},
      {2, 2, 2, 2, 4, 1},
      {2, 2, 2, 2, 1, 4},
    }, 2);
  }
}
