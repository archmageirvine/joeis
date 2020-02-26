package irvine.oeis.a028;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A028976 Theta series of <code>8-d 5-modular</code> lattice <code>Q_8(1)</code> with det 625 and minimal norm 4.
 * @author Sean A. Irvine
 */
public class A028976 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A028976() {
    super(new long[][] {
      {4, -2, 1, 1, -1, -2, 0, 2},
      {-2, 4, -1, 0, -1, 1, 1, -1},
      {1, -1, 4, -1, 1, -2, -2, 0},
      {1, 0, -1, 4, 1, 1, 2, 1},
      {-1, -1, 1, 1, 4, 1, -1, -2},
      {-2, 1, -2, 1, 1, 4, 2, 0},
      {0, 1, -2, 2, -1, 2, 4, 1},
      {2, -1, 0, 1, -2, 0, 1, 4}}, 2);
  }
}
