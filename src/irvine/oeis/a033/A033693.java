package irvine.oeis.a033;

import irvine.math.LongUtils;
import irvine.oeis.GramMatrixThetaSeries;

/**
 * A033693 Theta series of lattice <code>D3</code> tensor <code>D3</code> (dimension 9, det. 4096, min. norm <code>4)</code>.
 * @author Sean A. Irvine
 */
public class A033693 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A033693() {
    super(LongUtils.kroneckerSquare(new long[][] {{2, 0, 1}, {0, 2, -1}, {1, -1, 2}}), 2);
  }
}
