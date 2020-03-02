package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029586 Theta series of <code>6-dimensional 11-modular</code> even lattice of minimal norm 4.
 * @author Sean A. Irvine
 */
public class A029586 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029586() {
    super(new long[][] {
      {4, 1, -1, -1, -1, 1},
      {1, 4, 1, 1, -1, 1},
      {-1, 1, 4, 1, 1, 1},
      {-1, 1, 1, 4, -1, -1},
      {-1, -1, 1, -1, 4, 1},
      {1, 1, 1, -1, 1, 4}
    }, 2);
  }
}
