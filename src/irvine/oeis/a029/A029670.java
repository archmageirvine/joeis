package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029670 Theta series of quadratic form with Gram matrix [ 2, 1, 0; 1, 3, 1; 0, 1, 3 ].
 * @author Sean A. Irvine
 */
public class A029670 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029670() {
    super(new long[][] {{2, 1, 0}, {1, 3, 1}, {0, 1, 3}});
  }
}
