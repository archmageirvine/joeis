package irvine.math.cr;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * Polynomial with integer coefficients.
 * @author Sean A. Irvine
 */
public class ZPolynomialFunction extends UnaryCRFunction {

  private final Polynomial<Z> mPoly;

  /**
   * Construct a new polynomial function.
   * @param poly polynomial.
   */
  public ZPolynomialFunction(final Polynomial<Z> poly) {
    mPoly = poly;
  }

  @Override
  public CR execute(final CR x) {
    // Evaluation of polynomial at x
    CR sum = CR.valueOf(mPoly.coeff(0));
    for (int k = 1; k <= mPoly.degree(); ++k) {
      final Z c = mPoly.coeff(k);
      if (!c.isZero()) {
        sum = sum.add(ComputableReals.SINGLETON.pow(x, k).multiply(c));
      }
    }
    return sum;
  }
}
