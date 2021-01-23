package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029594 Theta series of quadratic form with Gram matrix [ 1, 0, 0; 0, 2, 0; 0, 0, 3 ].
 * @author Sean A. Irvine
 */
public class A029594 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029594() {
    super(new long[][] {{1, 0, 0}, {0, 2, 0}, {0, 0, 3}});
  }
}
