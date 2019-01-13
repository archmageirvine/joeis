package irvine.math.cr;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * Polynomial with integer coefficients.
 * @author Sean A. Irvine
 */
public class ZPolynomial extends UnaryCRFunction {

  // Using the inverseMonotone method on this class it is possible to find roots of polynomials

  private final Polynomial<Z> mPoly;

  /**
   * Construct a new polynomial function.
   * @param poly polynomial.
   */
  public ZPolynomial(final Polynomial<Z> poly) {
    mPoly = poly;
  }

  @Override
  public CR execute(final CR x) {
    // Evaluation of polynomial at x
    CR sum = CR.valueOf(mPoly.coeff(0));
    for (int k = 1; k <= mPoly.degree(); ++k) {
      final Z c = mPoly.coeff(k);
      if (!Z.ZERO.equals(c)) {
        sum = sum.add(ComputableReals.SINGLETON.pow(x, k).multiply(CR.valueOf(c)));
      }
    }
    return sum;
  }
}
