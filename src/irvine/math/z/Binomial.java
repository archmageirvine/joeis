package irvine.math.z;

import irvine.math.LongUtils;
import irvine.math.factorial.MemoryFactorial;

/**
 * Compute binomial coefficients.
 * @author Sean A. Irvine
 */
public final class Binomial {

  private Binomial() {
  }

  /**
   * Compute binomial coefficients.
   *
   * @param n upper index (may be negative)
   * @param m lower index
   * @return binomial coefficient
   */
  public static Z binomial(final long n, long m) {
    if (n >= 0 && (m < 0 || m > n)) {
      return Z.ZERO;
    }
    Z r = Z.ONE;
    if (n < 0) {
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
   *
   * @param n upper index
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
   * Catalan numbers.
   *
   * @param n index
   * @return Catalan number
   */
  public static Z catalan(final long n) {
    return binomial(2 * n, n).divide(n + 1);
  }

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();

  /**
   * Compute a multinomial coefficient.
   *
   * @param top top index
   * @param bottom bottom indices
   * @return coefficient
   */
  public static Z multinomial(final int top, final int... bottom) {
    // Naive implementation
    if (bottom.length == 0) {
      return Z.ONE; // special case
    }
    Z m = FACTORIAL.factorial(top);
    for (final int b : bottom) {
      m = m.divide(FACTORIAL.factorial(b));
    }
    return m;
  }

  /**
   * The Gaussian binomial of <code>m</code> and <code>r</code> for <code>q</code>.
   *
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

  private static long factorialExponent(long n, final long p) {
    long ex = 0;
    do {
      n /= p;
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
   * Compute binomial coefficients.
   *
   * @param n upper index (may be negative)
   * @param m lower index
   * @param p modulus
   * @return binomial coefficient
   */
  public static long binomial(final long n, final long m, final long p) {
    if (m < 0 || n < m) {
      return 0;
    }
    if (m == 0 || m == n) {
      return 1;
    }
    // Check whether binomial(n,k) is divisible by p
    if (factorialExponent(n, p) > factorialExponent(m, p) + factorialExponent(n - m, p)) {
      return 0;
    }
    return binomial1(n, m, p);
  }
}
