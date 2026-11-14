package irvine.math.cr.functions;

import java.util.ArrayList;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Euler products of rational polynomials.
 * @author Sean A. Irvine
 */
public final class ProductEuler {

  private ProductEuler() {
  }

  /**
   * Compute the Euler product of a rational polynomial:
   * product over primes p >= a of f(p^(-s)).
   *
   * @param f polynomial with rational coefficients and constant term 1
   * @param s exponent
   * @param a smallest prime to include
   * @return the Euler product
   */
  public static CR productEuler(final Polynomial<Q> f, final CR s, final int a) {
    if (!Q.ONE.equals(f.coeff(0))) {
      throw new IllegalArgumentException("Polynomial must have constant term 1");
    }
    if (a < 2) {
      throw new IllegalArgumentException("Lower prime bound must be at least 2");
    }

    // Compute the coefficients of log(f(x)).
    final int degree = f.degree();
    final List<Q> c = new ArrayList<>();
    c.add(Q.ZERO);

    for (int k = 1; ; ++k) {
      Q sum = Q.ZERO;
      for (int j = 1; j <= Math.min(k, degree); ++j) {
        sum = sum.add(f.coeff(j).multiply(j).multiply(c.get(k - j)));
      }
      final Q ck = sum.divide(k);
      c.add(ck);

      if (k > 1 && ck.isZero()) {
        // This is not a valid stopping condition in general; see note below.
        break;
      }
    }

    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        // Extra guard bits for the accumulation of terms.
        final int wp = precision - 16;

        // Directly evaluate the small-prime part.
        final int b = Math.max(32, -precision * 2 + 32);
        CR product = CR.ONE;
        final List<Integer> primes = primesBelow(b);

        for (final int p : primes) {
          if (p >= a) {
            product = product.multiply(PolynomialUtils.eval(f, CR.valueOf(p).pow(s.negate())));
          }
        }

        // Logarithmic tail, using the prime zeta function.
        CR logTail = CR.ZERO;
        for (int k = 1; k < c.size(); ++k) {
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

        return product.multiply(logTail.exp()).getApprox(precision);
      }
    };
  }

  /**
   * Prime zeta function P(s) = sum_p p^(-s), via Möbius inversion.
   */
  private static CR primeZeta(final CR s) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        CR sum = CR.ZERO;

        for (int m = 1; ; ++m) {
          final int mu = mobius(m);
          if (mu != 0) {
            final CR term = CrFunctions.ZETA.cr(s.multiply(m)).log()
              .divide(m);
            final CR contribution = mu == 1 ? term : term.negate();

            if (contribution.getApprox(precision - 12).signum() == 0) {
              break;
            }
            sum = sum.add(contribution);
          }
        }
        return sum.getApprox(precision - 4);
      }
    };
  }

  private static int mobius(final int n) {
    int m = n;
    int sign = 1;
    for (int p = 2; p * p <= m; ++p) {
      if (m % p == 0) {
        m /= p;
        if (m % p == 0) {
          return 0;
        }
        sign = -sign;
      }
    }
    if (m > 1) {
      sign = -sign;
    }
    return sign;
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
