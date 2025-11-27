package irvine.math.z;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.q.Q;

/**
 * Compute binomial coefficients.
 * @author Sean A. Irvine
 */
public final class Binomial {

  private Binomial() {
  }

  /**
   * Compute binomial coefficients.
   * @param n upper index (can be negative)
   * @param m lower index
   * @return binomial coefficient
   */
  public static Z binomial(final long n, long m) {
    if (n >= 0 && (m < 0 || m > n)) {
      return Z.ZERO;
    }
    Z r = Z.ONE;
    if (n < 0) {
      if (m > n && m < 0) {
        return Z.ZERO;
      }
      for (long k = n - m + 1; k <= n; ++k) {
        r = r.multiply(k);
      }
      for (long k = 2; k <= m; ++k) {
        r = r.divide(k);
      }
    } else {
      if (m < n / 2) {
        m = n - m;
      }
      for (long k = m + 1; k <= n; ++k) {
        r = r.multiply(k);
      }
      m = n - m;
      while (m > 1) {
        r = r.divide(m);
        --m;
      }
    }
    return r;
  }

  /**
   * Compute binomial coefficients of non-negative values.
   * @param n upper index (can be negative)
   * @param m lower index
   * @return binomial coefficient
   */
  public static Z binomial(final Z n, Z m) {
    if (n.signum() >= 0 && (m.signum() < 0 || m.compareTo(n) > 0)) {
      return Z.ZERO;
    }
    Z r = Z.ONE;
    if (n.signum() < 0) {
      for (Z k = n.subtract(m).add(1); k.compareTo(n) <= 0; k = k.add(1)) {
        r = r.multiply(k);
      }
      for (Z k = Z.TWO; k.compareTo(m) <= 0; k = k.add(1)) {
        r = r.divide(k);
      }
    } else {
      if (m.compareTo(n.divide2()) < 0) {
        m = n.subtract(m);
      }
      for (Z k = m.add(1); k.compareTo(n) <= 0; k = k.add(1)) {
        r = r.multiply(k);
      }
      m = n.subtract(m);
      while (!m.isZero()) {
        r = r.divide(m);
        m = m.subtract(Z.ONE);
      }
    }
    return r;
  }

  /**
   * Compute binomial coefficients with fractional first parameter.
   * @param n upper index
   * @param m lower index
   * @return binomial coefficient
   */
  public static Q binomial(final Q n, final Z m) {
    return binomial(n, m.intValueExact());
  }

  /**
   * Compute binomial coefficients with fractional first parameter.
   * @param n upper index
   * @param m lower index
   * @return binomial coefficient
   */
  public static Q binomial(final Q n, final int m) {
    Q prod = Q.ONE;
    for (int j = 0; j < m; ++j) {
      prod = prod.multiply(n.subtract(j)).divide(j + 1);
    }
    return prod;
  }

  /**
   * Compute binomial coefficients of non-negative values.
   * @param n upper index
   * @param m lower index
   * @return binomial coefficient
   */
  public static Z binomial(final Z n, final long m) {
    return binomial(n, Z.valueOf(m));
  }

  /**
   * Compute binomial coefficients of non-negative values.
   * @param n upper index
   * @param m lower index
   * @return binomial coefficient
   */
  public static Z binomial(final long n, final Z m) {
    return binomial(Z.valueOf(n), m);
  }

  /**
   * Compute a multinomial coefficient.
   * @param top top index
   * @param bottom bottom indices
   * @return coefficient
   */
  public static Z multinomial(final int top, final int... bottom) {
    // Naive implementation
    if (bottom.length == 0) {
      return Z.ONE; // special case
    }
    Z m = Functions.FACTORIAL.z(top);
    for (final int b : bottom) {
      m = m.divide(Functions.FACTORIAL.z(b));
    }
    return m;
  }

  /**
   * The Gaussian binomial of <code>m</code> and <code>r</code> for <code>q</code>.
   * @param m upper parameter
   * @param r lower parameter
   * @param q base
   * @return Gaussian binomial
   */
  public static Z gaussianBinomial(final int m, final int r, final int q) {
    if (r > m) {
      return Z.ZERO;
    }
    Z t = q == 2 ? Z.ONE.shiftLeft(m - r + 1) : Z.valueOf(q).pow(m - r + 1);
    Z b = Z.ONE;
    for (int k = 0; k < r; k++) {
      b = b.multiply(Z.ONE.subtract(t));
      t = t.multiply(q);
    }
    t = Z.valueOf(q);
    for (int k = 0; k < r; k++) {
      b = b.divide(Z.ONE.subtract(t));
      t = t.multiply(q);
    }
    return b;
  }

  private static long factorialExponent(long n, final long m) {
    long ex = 0;
    do {
      n /= m;
      ex += n;
    } while (n > 0);
    return ex;
  }

  private static long binomial2(long n, long m, final long p) {
    assert 0 <= m && m <= Math.min(n, p - 1) && p > 1; // p prime
    n %= p;
    if (n < m) {
      return 0;
    }
    if (m == 0 || m == n) {
      return 1;
    }
    // Now 0 < m < n, save a bit of work if m > n/2
    if (m > n / 2) {
      m = n - m;
    }
    // Calculate numerator and denominator modulo p
    long num = n, den = 1;
    for (n = n - 1; m > 1; --n, --m) {
      num = (num * n) % p;
      den = (den * m) % p;
    }
    return (num * LongUtils.modInverse(den, p)) % p;
  }

  private static long binomial1(final long n, final long m, final long p) {
    assert 0 <= m && m <= n && p > 1; // p prime
    if (m < p) {
      return binomial2(n, m, p);
    }
    return binomial2(n % p, m % p, p) * binomial1(n / p, m / p, p) % p;
  }

  /**
   * Compute binomial coefficients modulo a number.
   * @param n upper index (can be negative)
   * @param m lower index
   * @param mod modulus
   * @return binomial coefficient
   */
  public static long binomial(final long n, final long m, final long mod) {
    if (m < 0 || n < m || mod == 1) {
      return 0;
    }
    if (m == 0 || m == n) {
      return 1;
    }
    if (Predicates.PRIME.is(mod)) {
      // Check whether binomial(n,k) is divisible by mod
      if (factorialExponent(n, mod) > factorialExponent(m, mod) + factorialExponent(n - m, mod)) {
        return 0;
      }
      return binomial1(n, m, mod);
    }
    long res = 1;
    final long nm = n - m;
    for (long p = 2; p <= n; p = Functions.NEXT_PRIME.l(p)) {
      for (long pow = p; pow <= n; pow *= p) {
        final long cnt = n / pow - m / pow - nm / pow;
        for (long j = 0; j < cnt; ++j) {
          res *= p;
          res %= mod;
        }
      }
    }
    return res;
  }

  /**
   * Compute a binomial coefficient modulo a number
   * @param n upper index
   * @param m lower index
   * @param mod modulus
   * @return coefficient
   */
  public static Z binomial(final Z n, final Z m, final Z mod) {
    if (m.signum() < 0 || n.compareTo(m) < 0 || mod.isOne()) {
      return Z.ZERO;
    }
    if (m.isZero() || m.equals(n)) {
      return Z.ONE;
    }
    if (n.bitLength() < Long.SIZE && m.bitLength() < Long.SIZE && mod.bitLength() < Integer.SIZE) {
      // Drop to primitives for the calculation
      return Z.valueOf(binomial(n.longValue(), m.longValue(), mod.longValue()));
    }
    // Note the following could be made better for prime mod
    // Note other approaches factor modulus and compute over prime powers using CRT to put back together
    Z res = Z.ONE;
    final Z nm = n.subtract(m);
    for (Z p = Z.TWO; p.compareTo(n) <= 0; p = Functions.NEXT_PRIME.z(p)) {
      for (Z pow = p; pow.compareTo(n) <= 0; pow = pow.multiply(p)) {
        final Z cnt = n.divide(pow).subtract(m.divide(pow)).subtract(nm.divide(pow));
        for (Z j = Z.ZERO; j.compareTo(cnt) < 0; j = j.add(1)) {
          res = res.modMultiply(p, mod);
        }
      }
    }
    return res;
  }

  /**
   * Compute a binomial coefficient modulo a number
   * @param n upper index
   * @param m lower index
   * @param mod modulus
   * @return coefficient
   */
  public static Z binomial(final long n, final long m, final Z mod) {
    if (mod.bitLength() < Integer.SIZE) {
      return Z.valueOf(binomial(n, m, mod.longValue()));
    } else {
      return binomial(Z.valueOf(n), Z.valueOf(m), mod);
    }
  }

  /**
   * Compute a binomial coefficient modulo a number
   * @param n upper index
   * @param m lower index
   * @param mod modulus
   * @return coefficient
   */
  public static Z binomial(final Z n, final long m, final Z mod) {
    if (n.bitLength() < Long.SIZE && mod.bitLength() < Integer.SIZE) {
      return Z.valueOf(binomial(n.longValue(), m, mod.longValue()));
    } else {
      return binomial(n, Z.valueOf(m), mod);
    }
  }
}
