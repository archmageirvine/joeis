package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029673 Theta series of quadratic form with Gram matrix [ 2, 0, 1; 0, 4, 2; 1, 2, 4 ].
 * @author Sean A. Irvine
 */
public class A029673 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029673() {
    super(new long[][] {{2, 0, 1}, {0, 4, 2}, {1, 2, 4}}, 2);
  }
}
