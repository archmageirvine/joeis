package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029593 Theta series of quadratic form with Gram matrix <code>[ 1, 0, 0; 0, 3, 1; 0, 1, 4 ]</code>.
 * @author Sean A. Irvine
 */
public class A029593 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029593() {
    super(new long[][] {{1, 0, 0}, {0, 3, 1}, {0, 1, 4}});
  }
}
