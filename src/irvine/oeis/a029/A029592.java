package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029592 Theta series of 6-dimensional 11-modular odd lattice of minimal norm 4.
 * @author Sean A. Irvine
 */
public class A029592 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029592() {
    super(new long[][] {
      {4, 0, 0, -2, -1, 2},
      {0, 4, 0, -1, 2, 2},
      {0, 0, 4, -2, 2, -1},
      {-2, -1, -2, 5, -1, -1},
      {-1, 2, 2, -1, 5, 0},
      {2, 2, -1, -1, 0, 5}
    });
  }
}
