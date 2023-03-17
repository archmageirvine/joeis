package irvine.math.z;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.IntegerUtils;

/**
 * Routines relating to the Euler totient function.
 * @author Sean A. Irvine
 */
public class Euler {

  private static final int TABLE_BITS = 16;
  private static final int TABLE_LIMIT = 1 << TABLE_BITS;
  private static final Euler FIXED_TABLE = new Euler(TABLE_LIMIT);
  private static final Fast PRIME = new Fast();

  /**
   * Compute the Euler phi function of an isolated integer.
   * @param n number to compute phi of
   * @return Euler totient value
   * @exception UnsupportedOperationException if the computation fails.
   * @exception IllegalArgumentException if <code>n</code> in less than 1.
   * @exception NullPointerException if <code>n</code> is null.
   */
  public static Z phi(final Z n) {
    if (n.signum() < 1) {
      throw new IllegalArgumentException();
    }
    if (n.isProbablePrime()) {
      return n.subtract(Z.ONE);
    }
    if (n.bitLength() < Long.SIZE) {
      return phi(n.longValue());
    }
    return Jaguar.factor(n).phi();
  }

  /**
   * Compute the Euler phi function of an isolated integer.
   * @param n number to compute phi of
   * @return Euler totient value
   * @exception UnsupportedOperationException if the computation fails.
   * @exception IllegalArgumentException if <code>n</code> in less than 1.
   */
  public static long phiAsLong(final long n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    if (n <= TABLE_LIMIT) {
      return FIXED_TABLE.phi((int) n);
    }
    // Handle powers of 2
    if ((n & -n) == n) {
      return n / 2;
    }
    // Handle even part
    long m = n;
    long two = 1;
    while ((m & 1) == 0) {
      two <<= 1;
      m >>>= 1;
    }
    if (two > 1) {
      two >>>= 1;
    }
    // Handle 3
    long three = 1;
    while (m % 3 == 0) {
      three *= 3;
      m /= 3;
    }
    if (three > 1) {
      three /= 3;
      three <<= 1;
    }
    // Handle 5
    long five = 1;
    while (m % 5 == 0) {
      five *= 5;
      m /= 5;
    }
    if (five > 1) {
      five /= 5;
      five <<= 2;
    }
    final long phi = two * three * five;
    if (PRIME.isPrime(n)) {
      // Handle prime
      return (m - 1) * phi;
    } else if (m <= TABLE_LIMIT) {
      return FIXED_TABLE.phi((int) m) * phi;
    }
    // It's generally better to look up the entire factorization, hence using n rather than m here.
    return Jaguar.factor(n).phi().longValueExact();
  }

  /**
   * Compute the Euler phi function of an isolated integer.
   * @param n number to compute phi of
   * @return Euler totient value
   * @exception UnsupportedOperationException if the computation fails.
   * @exception IllegalArgumentException if <code>n</code> in less than 1.
   */
  public static Z phi(final long n) {
    return Z.valueOf(phiAsLong(n));
  }

  private final int[] mPhi;

  /**
   * Precompute Euler phi function for all values up to the limit.  This will
   * use extreme memory for large limits. For isolated values use the static
   * method or <code>LongUtils.phi()</code>.
   * @param limit largest value
   */
  public Euler(final int limit) {
    final int[] unfactored = new int[limit + 1];
    final int[] phi = new int[unfactored.length];
    Arrays.fill(phi, 1);
    for (int k = 0; k < unfactored.length; ++k) {
      unfactored[k] = k;
    }
    int p;
    for (p = 2; p <= IntegerUtils.sqrt(unfactored.length); ++p) {
      if (unfactored[p] != 1) {
        for (int k = p; k < unfactored.length; k += p) {
          unfactored[k] /= p;
          phi[k] *= p - 1;
          while (unfactored[k] % p == 0) {
            unfactored[k] /= p;
            phi[k] *= p;
          }
        }
      }
    }
    // Handle remaining large prime factors
    while (p < unfactored.length) {
      if (unfactored[p] != 1) {
        phi[p] *= unfactored[p] - 1;
      }
      ++p;
    }
    mPhi = phi;
  }

  /**
   * Return the totient of <code>n</code> assuming in range.
   * @param n index
   * @return Euler totient value
   */
  public int phi(final int n) {
    return mPhi[n];
  }

  /**
   * Find solutions to the equation <code>phi(n) = m</code>.
   * @param m euler value
   * @return set of solutions
   */
  public static TreeSet<Z> inversePhi(final Z m) {
    return new InverseEuler().inversePhi(m);
  }
}

