package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029681 Theta series of quadratic form with Gram matrix <code>[ 2, 1, 0; 1, 2, 1; 0, 1, 3 ]</code>.
 * @author Sean A. Irvine
 */
public class A029681 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029681() {
    super(new long[][] {{2, 1, 0}, {1, 2, 1}, {0, 1, 3}});
  }
}
