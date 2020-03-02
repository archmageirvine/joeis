package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029680 Theta series of quadratic form with Gram matrix <code>[ 4, 2, 2; 2, 4, 1; 2, 1, 6 ]</code>.
 * @author Sean A. Irvine
 */
public class A029680 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029680() {
    super(new long[][] {{4, 2, 2}, {2, 4, 1}, {2, 1, 6}}, 2);
  }
}
