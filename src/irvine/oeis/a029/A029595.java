package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029595 Theta series of quadratic form (or lattice) with Gram matrix [ 1, 0, 0; 0, 2, 1; 0, 1, 3 ].
 * @author Sean A. Irvine
 */
public class A029595 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029595() {
    super(new long[][] {{1, 0, 0}, {0, 2, 1}, {0, 1, 3}});
  }
}
