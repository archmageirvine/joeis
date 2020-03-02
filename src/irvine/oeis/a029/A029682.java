package irvine.oeis.a029;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A029682 Theta series of quadratic form with Gram matrix <code>[ 2, 1, 0; 1, 2, 1; 0, 1, 4 ]</code>.
 * @author Sean A. Irvine
 */
public class A029682 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A029682() {
    super(new long[][] {{2, 1, 0}, {1, 2, 1}, {0, 1, 4}}, 2);
  }
}
