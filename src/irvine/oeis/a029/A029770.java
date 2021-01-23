package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029770 Theta series of 10-dimensional lattice (C6 X SU(4,2)):C2 with minimal norm 4.
 * @author Sean A. Irvine
 */
public class A029770 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029770() {
    super(new long[][]{
      {4, 1, 1, -2, 1, -2, -2, -2, 2, -2},
      {1, 4, 0, -1, 2, 1, 0, 0, 2, -2},
      {1, 0, 4, 1, 2, -2, 1, 1, 2, 1},
      {-2, -1, 1, 4, -1, 1, 2, 1, -1, 2},
      {1, 2, 2, -1, 4, -1, 1, 1, 2, 0},
      {-2, 1, -2, 1, -1, 4, 0, 1, -1, 0},
      {-2, 0, 1, 2, 1, 0, 4, 2, -1, 1},
      {-2, 0, 1, 1, 1, 1, 2, 4, -1, 2},
      {2, 2, 2, -1, 2, -1, -1, -1, 4, -1},
      {-2, -2, 1, 2, 0, 0, 1, 2, -1, 4}
    }, 2);
  }
}
