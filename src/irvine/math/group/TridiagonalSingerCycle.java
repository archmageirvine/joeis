package irvine.math.group;

import java.util.function.Function;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Singer-cycle test for the tridiagonal matrix with unit bands and last diagonal entry 2.
 * @author Gregory Morse
 */
public final class TridiagonalSingerCycle {

  private static final Fast PRIME = new Fast();

  private TridiagonalSingerCycle() { }

  private static boolean isOne(final int q, final int r, final Z exponent) {
    // Work modulo w^r-1. In characteristic q, raising to the q-th
    // power permutes coefficients; multiplication by 1-w-w^-1
    // only uses the two adjacent coefficients.
    int[] a = new int[r];
    int[] b = new int[r];
    a[0] = 1;
    final String digits = exponent.toString(q);
    for (int j = 0; j < digits.length(); ++j) {
      int index = 0;
      for (int k = 0; k < r; ++k) {
        b[index] = a[k];
        index += q;
        if (index >= r) {
          index -= r;
        }
      }
      int[] t = a;
      a = b;
      b = t;
      for (int i = '0'; i < digits.charAt(j); ++i) {
        for (int k = 0; k < r; ++k) {
          b[k] = (a[k] + 2 * q - a[k == 0 ? r - 1 : k - 1] - a[k + 1 == r ? 0 : k + 1]) % q;
        }
        t = a;
        a = b;
        b = t;
      }
    }
    // Frobenius and inversion cover all nontrivial r-th roots.
    // Equality at one root is thus equality modulo 1+w+...+w^(r-1).
    if ((a[0] + q - a[1]) % q != 1) {
      return false;
    }
    for (int k = 2; k < r; ++k) {
      if (a[k] != a[1]) {
        return false;
      }
    }
    return true;
  }

  static boolean hasFullOrder(final int q, final int m, final Function<Z, FactorSequence> factor) {
    if (m == 1) {
      return q == 3;
    }
    if (q == 3 && (m & 1) == 0) {
      // The determinant is 1 for even m, so the norm of a root
      // cannot generate the multiplicative group of GF(3).
      return false;
    }
    final int r = Math.addExact(Math.multiplyExact(2, m), 1);
    // The tridiagonal determinant recurrence gives roots
    // 1-w-w^-1 for inverse pairs of nontrivial r-th roots of unity.
    // Irreducibility requires prime r and transitivity on those pairs.
    if (!PRIME.isPrime(r)) {
      return false;
    }
    long x = q;
    for (int k = 1; k < m; ++k) {
      if (x == 1 || x == r - 1) {
        return false;
      }
      x = x * q % r;
    }
    final Z base = Z.valueOf(q);
    final Z order = base.pow(m).subtract(1);
    Z remaining = order;
    // A small prime divisor is often enough to disprove primitivity.
    for (long p = 2; p <= 1000; p = PRIME.nextPrime(p)) {
      if (remaining.mod(p) == 0) {
        if (isOne(q, r, order.divide(p))) {
          return false;
        }
        do {
          remaining = remaining.divide(p);
        } while (remaining.mod(p) == 0);
      }
    }
    for (int d = 1; d <= m; ++d) {
      if (m % d == 0) {
        // Factor the cyclotomic parts separately. Earlier factors have
        // already been tried and removed from the entire group order.
        final Z part = remaining.gcd(base.pow(d).subtract(1));
        if (!part.isOne()) {
          for (final Z p : factor.apply(part).toZArray()) {
            if (isOne(q, r, order.divide(p))) {
              return false;
            }
            do {
              remaining = remaining.divide(p);
            } while (remaining.mod(p).isZero());
          }
        }
      }
    }
    return true;
  }

  /**
   * Test whether the specified matrix generates a Singer cycle.
   * @param q field order (2 or 3)
   * @param m positive dimension
   * @return true if its order is q^m-1
   */
  public static boolean hasFullOrder(final int q, final int m) {
    return hasFullOrder(q, m, Jaguar::factor);
  }
}
