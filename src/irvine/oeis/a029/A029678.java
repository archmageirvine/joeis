package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029678 Theta series of quadratic form with Gram matrix [ 3, 1, -1; 1, 4, 1; -1, 1, 3 ].
 * @author Sean A. Irvine
 */
public class A029678 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029678() {
    super(new long[][] {{3, 1, -1}, {1, 4, 1}, {-1, 1, 3}});
  }
}
