package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391108 allocated for Lorenzo Sauras Altuzarra.
 * @author Sean A. Irvine
 */
public class A391108 extends Sequence1 {

  private long mN = 0;
  private long mCount = 0;

  private static long eval(final long a, final long b, final long c, final long d, final long x) {
    return ((a * x + b) * x + c) * x + d;
  }

  private static boolean checkAfterRoot(final long a, final long b, final long c, final long r) {
    // Divide (a x^3 + b x^2 + c x + d) by (x - r) and test remaining quadratic
    return quadraticHasTwoIntegerRoots(a, b + a * r, c + b * r + a * r * r);
  }

  private static boolean quadraticHasTwoIntegerRoots(final long a, final long b, final long c) {
    // Discriminant
    final long disc = b * b - 4 * a * c;
    if (disc < 0 || !Predicates.SQUARE.is(disc)) {
      return false;
    }
    final long s = Functions.SQRT.l(disc);
    final long denom = 2 * a;
    // Check divisibility for both roots
    return (-b + s) % denom == 0 && (-b - s) % denom == 0;
  }

  private boolean is(final long a, final long b, final long c, final long d) {
    // Quick necessary conditions from Viete
    if (b % a != 0 || c % a != 0 || d % a != 0) {
      return false;
    }
    // Constant zero: x = 0 is a root
    if (d == 0) {
      // Factor out x
      // a*x^3 + b*x^2 + c x = x*(a*x^2 + b*x + c)
      return quadraticHasTwoIntegerRoots(a, b, c);
    }
    // Try all integer divisors of d
    for (final Z rr : Jaguar.factor(Math.abs(d)).divisors()) {
      final long r = rr.longValue();
      if (eval(a, b, c, d, r) == 0) {
        if (checkAfterRoot(a, b, c, r)) {
          return true;
        }
      }
      if (r != 0 && eval(a, b, c, d, -r) == 0) {
        if (checkAfterRoot(a, b, c, -r)) {
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

