package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029676 Theta series of quadratic form with Gram matrix [ 3, 1, 0; 1, 3, 1; 0, 1, 4 ].
 * @author Sean A. Irvine
 */
public class A029676 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029676() {
    super(new long[][] {{3, 1, 0}, {1, 3, 1}, {0, 1, 4}});
  }
}
