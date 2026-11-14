package irvine.math.cr.functions;

import java.util.ArrayList;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * Euler products of rational functions with rational coefficients.
 * @author Sean A. Irvine
 */
public final class ProductEuler {

  // todo this is far too slow and also seems incorrect

  private ProductEuler() {
  }

  /**
   * Compute the product over primes p >= a of
   * numerator(p^-s) / denominator(p^-s).
   * Both polynomials must have constant coefficient 1.
   * @param numerator numerator polynomial
   * @param denominator denominator polynomial
   * @return the Euler product
   */
  public static CR productEuler(final Polynomial<Q> numerator,
                                final Polynomial<Q> denominator) {
    return productEuler(numerator, denominator, CR.ONE, 2);
  }

  /**
   * Compute the product over primes p >= a of
   * numerator(p^-s) / denominator(p^-s).
   *
   * Both polynomials must have constant coefficient 1.
   *
   * @param numerator numerator polynomial
   * @param denominator denominator polynomial
   * @param s exponent
   * @param a smallest prime to include
   * @return the Euler product
   */
  public static CR productEuler(final Polynomial<Q> numerator,
                                final Polynomial<Q> denominator,
                                final CR s, final int a) {
    if (!Q.ONE.equals(numerator.coeff(0)) || !Q.ONE.equals(denominator.coeff(0))) {
      throw new IllegalArgumentException("Both polynomials must have constant term 1");
    }
    if (a < 2) {
      throw new IllegalArgumentException("Lower prime bound must be at least 2");
    }

    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        StringUtils.message("precision = " + precision);
        final int bits = Math.max(32, -precision + 32);
        final int cutoff = Math.max(32, 2 * bits);

        // Generate logarithmic coefficients of log(numerator/denominator).
        final int kMax = Math.max(32, bits);
        final List<Q> c = logCoefficients(numerator, kMax);
        final List<Q> d = logCoefficients(denominator, kMax);
        for (int k = 0; k <= kMax; ++k) {
          c.set(k, c.get(k).subtract(d.get(k)));
        }

        // Generate primes below the cutoff.
        final List<Integer> primes = primesBelow(cutoff);

        // Direct product for the small primes.
        CR product = CR.ONE;
        for (final int p : primes) {
          if (p >= a) {
            final CR t = CR.valueOf(p).pow(s.negate());
            product = product.multiply(PolynomialUtils.eval(numerator, t))
              .divide(PolynomialUtils.eval(denominator, t));
          }
        }

        StringUtils.message("Doing tail with kMax=" + kMax);

        // Prime-zeta tail.
        CR logTail = CR.ZERO;
        for (int k = 1; k <= kMax; ++k) {
          if (!c.get(k).isZero()) {
            final CR q = s.multiply(k);
            CR tail = primeZeta(q);
            for (final int p : primes) {
              if (p >= a) {
                tail = tail.subtract(CR.valueOf(p).pow(q.negate()));
              }
            }
            logTail = logTail.add(CR.valueOf(c.get(k)).multiply(tail));
          }
        }

        StringUtils.message("Computing result");
        StringUtils.message("logTail=" + logTail);

        return product.multiply(logTail.exp()).getApprox(precision);
      }
    };
  }

  /**
   * Coefficients of log(f(x)), where f(0)=1.
   */
  private static List<Q> logCoefficients(final Polynomial<Q> f, final int n) {
    final List<Q> c = new ArrayList<>();
    c.add(Q.ZERO);
    for (int k = 1; k <= n; ++k) {
      Q sum = f.coeff(k).multiply(k);
      for (int j = 1; j < k; ++j) {
        sum = sum.subtract(c.get(j).multiply(j).multiply(f.coeff(k - j)));
      }
      c.add(sum.divide(k));
    }
    System.out.println("logCoefficients(" + f + "," + c + ")=" + c);
    return c;
  }

  private static CR zetaEta(final CR s, final int precision) {
    final int n = -precision + 20;
    final CR[] diff = new CR[n];

    for (int j = 0; j < n; ++j) {
      diff[j] = CR.valueOf(j + 1).pow(s.negate());
    }

    CR eta = CR.ZERO;
    CR weight = CR.ONE.divide(CR.valueOf(2));

    for (int k = 0; k < n; ++k) {
      eta = eta.add(diff[0].multiply(weight));
      weight = weight.divide(2);

      // In-place forward differences.
      for (int j = 0; j < n - k - 1; ++j) {
        diff[j] = diff[j].subtract(diff[j + 1]);
      }
    }

    return eta.divide(CR.ONE.subtract(
      CR.valueOf(2).pow(CR.ONE.subtract(s))));
  }

  /**
   * Prime zeta function P(s) = sum_p p^(-s), via Möbius inversion.
   */
  private static CR primeZeta(final CR s) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        StringUtils.message("Starting primeZeta(" + s + ") precision = " + precision);
        CR sum = CR.ZERO;
        for (int m = 1; ; ++m) {
          final int mu = Functions.MOBIUS.i(m);
          if (mu != 0) {
            final CR ms = s.multiply(m);
            final CR term = zetaEta(ms, precision - 10).log().divide(m);
            //final CR term = CrFunctions.ZETA.cr(s.multiply(m)).log().divide(m);
            final CR contribution = mu > 0 ? term : term.negate();
            if (contribution.getApprox(precision - 12).signum() == 0) {
              break;
            }
            sum = sum.add(contribution);
          }
        }
        StringUtils.message("Finished primeZeta(" + s + ") computed to precision = " + precision);
        return sum.getApprox(precision - 4);
      }
    };
  }

  private static List<Integer> primesBelow(final int n) {
    final boolean[] composite = new boolean[n];
    final List<Integer> primes = new ArrayList<>();
    for (int p = 2; p < n; ++p) {
      if (!composite[p]) {
        primes.add(p);
        if ((long) p * p < n) {
          for (int j = p * p; j < n; j += p) {
            composite[j] = true;
          }
        }
      }
    }
    return primes;
  }
}

