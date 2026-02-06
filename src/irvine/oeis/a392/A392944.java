package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392944 a(n) is the number of cubic polynomials with coefficients in {-n, ..., n}, positive leading coefficient, and having three rational roots.
 * @author Sean A. Irvine
 */
public class A392944 extends Sequence1 {

  private long mN = 0;
  private long mCount = 0;

  private static boolean eval(final long a, final long b, final long c, final long d, final long p, final long q) {
    // Evaluate f(p/q) * q^3 to avoid fractions
    return a * p * p * p + b * p * p * q + c * p * q * q + d * q * q * q == 0;
  }

  private static boolean isQuadraticRational(final long a, final long b, final long c, final long p, final long q) {
    final long bigA = a * q;
    final long bigB = b * q + a * p;
    final long bigC = c * q + b * p + a * p * p / q;
    final long disc = bigB * bigB - 4 * bigA * bigC;
    return disc >= 0 && Predicates.SQUARE.is(disc);
  }

  private boolean is(final long a, final long b, final long c, final long d) {
    // Zero root case
    if (d == 0) {
      // x*(a x^2 + b x + c)
      final long disc = b * b - 4 * a * c;
      return disc >= 0 && Predicates.SQUARE.is(disc);
    }

    // Rational Root Theorem: p | d, q | a
    for (final Z pp : Jaguar.factor(Math.abs(d)).divisors()) {
      final long p = pp.longValue();
      for (final Z qq : Jaguar.factor(a).divisors()) {
        final long q = qq.longValue();
        // test +- p/q
        if (eval(a, b, c, d, p, q) && isQuadraticRational(a, b, c, p, q)) {
          return true;
        }
        if (eval(a, b, c, d, -p, q) && isQuadraticRational(a, b, c, -p, q)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    // a = mN
    for (long b = -mN; b <= mN; ++b) {
      for (long c = -mN; c <= mN; ++c) {
        for (long d = -mN; d <= mN; ++d) {
          if (is(mN, b, c, d)) {
            ++mCount;
          }
        }
      }
    }

    // |b| = mN, a <= mN-1
    for (long a = 1; a < mN; ++a) {
      for (long c = -mN; c <= mN; ++c) {
        for (long d = -mN; d <= mN; ++d) {
          if (is(a, mN, c, d)) {
            ++mCount;
          }
          if (is(a, -mN, c, d)) {
            ++mCount;
          }
        }
      }
    }

    // |c| = mN, a <= mN-1, |b| <= mN-1
    for (long a = 1; a < mN; ++a) {
      for (long b = -(mN - 1); b <= (mN - 1); ++b) {
        for (long d = -mN; d <= mN; ++d) {
          if (is(a, b, mN, d)) {
            ++mCount;
          }
          if (is(a, b, -mN, d)) {
            ++mCount;
          }
        }
      }
    }

    // |d| = mN, others strictly inside
    for (long a = 1; a < mN; ++a) {
      for (long b = -(mN - 1); b <= (mN - 1); ++b) {
        for (long c = -(mN - 1); c <= (mN - 1); ++c) {
          if (is(a, b, c, mN)) {
            ++mCount;
          }
          if (is(a, b, c, -mN)) {
            ++mCount;
          }
        }
      }
    }
    return Z.valueOf(mCount);
  }
}

