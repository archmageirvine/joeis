package irvine.oeis.a023;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A023921 Theta series of <code>A*_9</code> lattice.
 * @author Sean A. Irvine
 */
public class A023921 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A023921() {
    super(new long[][]{
      {9, -1, -1, -1, -1, -1, -1, -1, -1},
      {-1, 9, -1, -1, -1, -1, -1, -1, -1},
      {-1, -1, 9, -1, -1, -1, -1, -1, -1},
      {-1, -1, -1, 9, -1, -1, -1, -1, -1},
      {-1, -1, -1, -1, 9, -1, -1, -1, -1},
      {-1, -1, -1, -1, -1, 9, -1, -1, -1},
      {-1, -1, -1, -1, -1, -1, 9, -1, -1},
      {-1, -1, -1, -1, -1, -1, -1, 9, -1},
      {-1, -1, -1, -1, -1, -1, -1, -1, 9}
    });
  }
}
