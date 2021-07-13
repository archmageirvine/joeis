package irvine.oeis;

import irvine.math.cr.CR;
import irvine.math.cr.ZPolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * Construct the decimal expansion of the root of a polynomial.
 * @author Sean A. Irvine
 */
public class PolynomialRootExpansionSequence extends DecimalExpansionSequence {

  /**
   * Construct the decimal expansion of the root of a polynomial. The polynomial must
   * be monotonically increasing or decreasing in <code>[lo,hi]</code>
   * @param poly the polynomial
   * @param lo lower bound
   * @param hi upper bound
   */
  protected PolynomialRootExpansionSequence(final Polynomial<Z> poly, final CR lo, final CR hi) {
    super(new ZPolynomial(poly).inverseMonotone(lo, hi).execute(CR.ZERO));
  }
}

