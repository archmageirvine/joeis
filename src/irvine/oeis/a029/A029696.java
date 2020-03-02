package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029696 Theta series of 7-dimensional lattice <code>Kappa_7*</code>.
 * @author Sean A. Irvine
 */
public class A029696 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029696() {
    super(new long[][] {
      {19, 26, 15, -18, 14, -4, -6},
      {26, 52, 30, -36, 28, -8, -12},
      {15, 30, 27, -18, 18, -12, -6},
      {-18, -36, -18, 36, -24, 0, 12},
      {14, 28, 18, -24, 28, -8, -12},
      {-4, -8, -12, 0, -8, 16, 0},
      {-6, -12, -6, 12, -12, 0, 12}
    });
  }
}
