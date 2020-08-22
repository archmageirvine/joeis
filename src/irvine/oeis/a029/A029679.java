package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029679 Theta series of quadratic form with Gram matrix [ 2, 0, 0; 0, 2, 1; 0, 1, 4 ].
 * @author Sean A. Irvine
 */
public class A029679 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029679() {
    super(new long[][] {{2, 0, 0}, {0, 2, 1}, {0, 1, 4}}, 2);
  }
}
