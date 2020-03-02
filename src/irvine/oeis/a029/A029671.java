package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029671 Theta series of quadratic form with Gram matrix <code>[ 2, 1, 0; 1, 4, 1; 0, 1, 4 ]</code>.
 * @author Sean A. Irvine
 */
public class A029671 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029671() {
    super(new long[][] {{2, 1, 0}, {1, 4, 1}, {0, 1, 4}}, 2);
  }
}
