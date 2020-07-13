package irvine.oeis.a033;

import irvine.math.LongUtils;
import irvine.oeis.GramMatrixThetaSeries;

/**
 * A033701 Theta series of lattice <code>A_2</code> tensor <code>D_3</code> (dimension 6, det. 432, min. norm <code>4)</code>.
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
