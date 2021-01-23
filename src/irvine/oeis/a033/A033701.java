package irvine.oeis.a033;

import irvine.math.LongUtils;
import irvine.oeis.GramMatrixThetaSeries;

/**
 * A033701 Theta series of lattice A_2 tensor D_3 (dimension 6, det. 432, min. norm 4).
 * @author Sean A. Irvine
 */
public class A033701 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A033701() {
    super(LongUtils.kroneckerProduct(
      new long[][] {{2, -1}, {-1, 2}},
      new long[][] {{2, 0, 1}, {0, 2, -1}, {1, -1, 2}}
    ), 2);
  }
}
