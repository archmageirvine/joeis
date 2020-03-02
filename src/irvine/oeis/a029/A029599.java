package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029599 Theta series of quadratic form with Gram matrix <code>[ 4, 1, 0; 1, 2, 1; 0, 1, 6 ]</code>.
 * @author Sean A. Irvine
 */
public class A029599 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029599() {
    super(new long[][] {{4, 1, 0}, {1, 2, 1}, {0, 1, 6}}, 2);
  }
}
