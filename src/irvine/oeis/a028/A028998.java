package irvine.oeis.a028;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A028998 Theta series of quadratic form with Gram matrix [ 4, 2, 2, 1; 2, 4, 1, 2; 2, 1, 6, 3; 1, 2, 3, 6 ].
 * @author Sean A. Irvine
 */
public class A028998 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A028998() {
    super(new long[][] {
      {4, 2, 2, 1},
      {2, 4, 1, 2},
      {2, 1, 6, 3},
      {1, 2, 3, 6}
    }, 2);
  }
}
