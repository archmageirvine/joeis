
package irvine.math.cr.functions;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * The Riemann zeta function for real arguments.
 * Uses the Euler-Maclaurin summation formula.
 * @author Sean A. Irvine
 */
public class Zeta extends CrFunction1 {

  private static final Map<Integer, CR> COEFFICIENTS = new ConcurrentHashMap<>();

  private static CR coefficient(final int j) {
    return COEFFICIENTS.computeIfAbsent(j, k -> CR.valueOf(Functions.BERNOULLI.q(k)).divide(Functions.FACTORIAL.z(k)));
  }

  /**
   * Compute the rising factorial x(x+1)...(x+n-1).
   * @param x argument
   * @param n number of factors
   * @return rising factorial
   */
  private static CR risingFactorial(final CR x, final int n) {
    CR res = CR.ONE;
    for (int k = 0; k < n; ++k) {
      res = res.multiply(x.add(k));
    }
    return res;
  }

  /**
   * Absolute value of the next Euler-Maclaurin correction,
   * which bounds the remainder after the preceding corrections.
   * @param x argument
   * @param n summation cutoff
   * @param m correction index
   * @return remainder bound
   */
  private static CR remainderBound(final CR x, final int n, final int m) {
    final int j = 2 * m;
    final CR coeff = coefficient(j);
    final CR rising = risingFactorial(x, j - 1);
    final CR exponent = CR.ONE.subtract(x).subtract(j);
    return coeff.multiply(rising).abs().multiply(CR.valueOf(n).pow(exponent));
  }

  /**
   * Euler-Maclaurin approximation to zeta(x).
   * @param x argument
   * @param n summation cutoff
   * @param m number of Bernoulli corrections
   * @return approximation
   */
  private static CR evaluate(final CR x, final int n, final int m) {
    final CR cn = CR.valueOf(n);

    // Initial finite sum
    CR sum = CR.ZERO;
    final CR minusX = x.negate();
    for (int k = 1; k < n; ++k) {
      sum = sum.add(CR.valueOf(k).pow(minusX));
    }

    // Integral contribution
    sum = sum.add(cn.pow(CR.ONE.subtract(x)).divide(x.subtract(CR.ONE)));

    // Half endpoint contribution
    sum = sum.add(cn.pow(x.negate()).shiftRight(1));

    // Bernoulli corrections
    CR rising = x;
    for (int r = 1; r < m; ++r) {
      final int j = 2 * r;
      if (r > 1) {
        rising = rising.multiply(x.add(j - 3)).multiply(x.add(j - 2));
      }
      final CR coeff = coefficient(j);
      final CR exponent = CR.ONE.subtract(x).subtract(j);
      sum = sum.add(coeff.multiply(rising).multiply(cn.pow(exponent)));
    }
    return sum;
  }

  @Override
  public CR cr(final CR x) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        if (x == CR.ONE) {
          throw new ArithmeticException("Zeta has a pole at 1");
        }
        // Estimate the magnitude of x, with a little safety margin.
        final Z xa = x.getApprox(-8).abs().shiftRight(8);
        if (xa.bitLength() > 20) {
          throw new ArithmeticException("Zeta argument too large");
        }
        final int ax = xa.intValue() + 2;
        // Select initial truncation parameters.
        final int bits = Math.max(32, -precision + 32);
        int m = Math.max(8, (bits + 1) / 2 + ax / 2 + 8);
        int n = 4 * m + ax + 32;
        // Increase the truncation parameters until the rigorous
        // Euler-Maclaurin remainder bound is sufficiently small.
        while (remainderBound(x, n, m).getApprox(precision - 6).signum() != 0) {
          m += Math.max(8, m / 2);
          n = 4 * m + ax + 32;
        }
        // We use corrections through m-1; the m-th correction
        // bounds the omitted remainder.
        return evaluate(x, n, m).getApprox(precision - 2).shiftRight(2);
      }
    };
  }

  @Override
  public CR cr(final long z) {
    // Use the previous integer version where appropriate
    return z >= 0 ? irvine.math.cr.Zeta.zeta(z) : cr(CR.valueOf(z));
  }
}
