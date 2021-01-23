package irvine.oeis.a033;

import irvine.math.LongUtils;
import irvine.oeis.GramMatrixThetaSeries;

/**
 * A033694 Theta series of lattice D3 tensor D3* (dimension 9, det. 262144, min. norm 6).
 * @author Sean A. Irvine
 */
public class A033694 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A033694() {
    super(LongUtils.kroneckerProduct(
      new long[][] {{3, -1, -1}, {-1, 3, -1}, {-1, -1, 3}},
      new long[][] {{2, 0, 1}, {0, 2, -1}, {1, -1, 2}}
    ), 2);
  }
}
