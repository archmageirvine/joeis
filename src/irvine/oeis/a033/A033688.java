package irvine.oeis.a033;

import irvine.math.LongUtils;
import irvine.oeis.GramMatrixThetaSeries;

/**
 * A033688 Theta series of tensor cube of <code>A_2</code> lattice (dimension 8, det <code>3^12)</code>.
 * @author Sean A. Irvine
 */
public class A033688 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A033688() {
    super(LongUtils.kroneckerProduct(new long[][] {{2, -1}, {-1, 2}}, LongUtils.kroneckerSquare(new long[][] {{2, -1}, {-1, 2}})), 2);
  }
}
