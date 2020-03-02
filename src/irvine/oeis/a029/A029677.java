package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029677 Theta series of quadratic form with Gram matrix <code>[ 4, 1, 0; 1, 4, 2; 0, 2, 6 ]</code>.
 * @author Sean A. Irvine
 */
public class A029677 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029677() {
    super(new long[][] {{4, 1, 0}, {1, 4, 2}, {0, 2, 6}}, 2);
  }
}
