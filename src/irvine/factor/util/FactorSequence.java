package irvine.factor.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import irvine.math.z.Z;

/**
 * Provides an object useful for representing factorizations or partial
 * factorizations of large integers. Each number in the factorization
 * can have the state UNKNOWN, COMPOSITE, PRIME, or PROB_PRIME. The
 * value -1 is given special treatment, so that when its exponent is
 * even it is silently suppressed.
 *
 * @author Sean A. Irvine
 */
public final class FactorSequence {

  /** Number status is unknown */
  public static final int UNKNOWN = 0;
  /** Number is definitely composite */
  public static final int COMPOSITE = 1;
  /** Number is proven prime */
  public static final int PRIME = 2;
  /** Number is probable prime */
  public static final int PROB_PRIME = 3;
  /** Positive identification. */
  public static final int YES = 1;
  /** Negative identification. */
  public static final int NO = 2;

  /** Used for special handling of -1. */
  private static final Z NEG_ONE = Z.NEG_ONE;

  /**
   * Convenience method to get a string representation of a factorization.
   * @param fs factorization
   * @return string representation
   */
  public static String toString(final FactorSequence fs) {
    final StringBuilder sb = new StringBuilder();
    for (final Z n : fs.toZArray()) {
      if (sb.length() > 0) {
        sb.append('.');
      }
      final int status = fs.getStatus(n);
      final boolean p = status == PRIME || status == PROB_PRIME;
      if (!p) {
        sb.append('(');
      }
      sb.append(n);
      final int exp = fs.getExponent(n);
      if (exp > 1) {
        sb.append('^').append(exp);
      }
      if (!p) {
        sb.append(')');
      }
    }
    return sb.toString();
  }

  /**
   * Hold the status and exponent information for a factor.
   */
  private static class Factor {
    Factor(final int status, final int exponent) {
      mStatus = status;
      mExponent = exponent;
    }
    int mStatus;
    int mExponent;
  }

  /** Default constructor. */
  public FactorSequence() {
  }

  /**
   * Convenience constructor for a single value with unknown status.
   * @param n number with unknown status
   */
  public FactorSequence(final long n) {
    add(n);
  }

  /**
   * Convenience constructor for a single value with unknown status.
   * @param n number with unknown status
   */
  public FactorSequence(final Z n) {
    add(n);
  }

  /** Stores the factors we know about */
  private final Map<Z, Factor> mFactors = new HashMap<>();


  /**
   * Add the integer n with the specified status, and increment
   * its exponent by the specified amount.
   *
   * @param n integer to add
   * @param status status to use
   * @param exponent exponent for n
   */
  public void add(final Z n, final int status, final int exponent) {
    if (exponent == 0) {
      return;
    }
    final Factor f = mFactors.get(n);
    if (f == null) {
      mFactors.put(n, new Factor(status, exponent));
    } else {
      f.mExponent += exponent;
      if (status == PRIME) {
        f.mStatus = PRIME;
      } else if (status == PROB_PRIME && f.mStatus != PRIME) {
        f.mStatus = PROB_PRIME;
      } else if (status == COMPOSITE && f.mStatus == UNKNOWN) {
        f.mStatus = COMPOSITE;
      }
    }

    // special handling for -1
    if (n.equals(NEG_ONE)) {
      final int exp = getExponent(NEG_ONE);
      remove(NEG_ONE);
      if ((exp & 1) == 1) {
        mFactors.put(n, new Factor(PRIME, 1));
      }
    }
  }

  /**
   * Add integer n with the specified status.
   *
   * @param n integer to add
   * @param status status to use
   */
  public void add(final Z n, final int status) {
    add(n, status, 1);
  }

  /**
   * Add the specified integer with UNKNOWN status.
   *
   * @param n integer to add
   */
  public final void add(final Z n) {
    add(n, UNKNOWN, 1);
  }

  /**
   * Add the integer n with the specified status, and increment
   * its exponent by the specified amount.
   *
   * @param n integer to add
   * @param status status to use
   * @param exponent exponent for n
   */
  public void add(final long n, final int status, final int exponent) {
    add(Z.valueOf(n), status, exponent);
  }

  /**
   * Add integer n with the specified status.
   *
   * @param n integer to add
   * @param status status to use
   */
  public void add(final long n, final int status) {
    add(n, status, 1);
  }

  /**
   * Add the specified integer with UNKNOWN status.
   *
   * @param n integer to add
   */
  public void add(final long n) {
    add(n, UNKNOWN, 1);
  }

  /**
   * Remove the specified factor.
   *
   * @param n factor to remove
   */
  public void remove(final Z n) {
    mFactors.remove(n);
  }

  /**
   * Get the exponent associated with the specified factor.
   * If the factor is not present then return 0.
   *
   * @param n factor to get exponent for
   * @return exponent
   */
  public int getExponent(final Z n) {
    final Factor f = mFactors.get(n);
    if (f == null) {
      return 0;
    }
    return f.mExponent;
  }

  /**
   * Get the status associated with the specified factor.
   * If the factor is not present then return UNKNOWN.
   *
   * @param n factor to get status for
   * @return status
   */
  public int getStatus(final Z n) {
    final Factor f = mFactors.get(n);
    if (f == null) {
      return UNKNOWN;
    }
    return f.mStatus;
  }

  /**
   * Test if every number in this factor sequence is a prime or probable
   * prime. Thus, this method can be used to check for a complete factorization.
   *
   * @return true if the factorization is complete
   */
  public boolean isComplete() {
    // Factorization of 1 is complete
    if (mFactors.size() == 1 && mFactors.containsKey(Z.ONE)) {
      return true;
    }
    for (final Factor f : mFactors.values()) {
      if (f.mStatus != PRIME && f.mStatus != PROB_PRIME) {
        return false;
      }
    }
    return true;
  }

  /**
   * Return the number of distinct factors in this factor sequence.
   * @return count of distinct factors
   */
  public int omega() {
    return mFactors.size();
  }

  /**
   * If the factorization is complete return big omega for the number.
   * Otherwise returns the negative of the lower bound on big omega.
   * @return big omega
   */
  public long bigOmegaBound() {
    boolean isLowerBound = false;
    long bigOmega = 0;
    for (final Factor f : mFactors.values()) {
      if (f.mStatus == PRIME || f.mStatus == PROB_PRIME) {
        bigOmega += f.mExponent;
      } else if (f.mStatus == COMPOSITE) {
        bigOmega += 2;
        isLowerBound = true;
      } else {
        ++bigOmega;
        isLowerBound = true;
      }
    }
    return isLowerBound ? -bigOmega : bigOmega;
  }

  /**
   * Return the sum of the exponents.
   * @return big omega
   * @exception UnsupportedOperationException if factor sequence is not completely
   * resolved to primes and probable primes.
   */
  public long bigOmega() {
    long bigOmega = 0;
    for (final Factor f : mFactors.values()) {
      if (f.mStatus != PRIME && f.mStatus != PROB_PRIME) {
        throw new UnsupportedOperationException();
      }
      bigOmega += f.mExponent;
    }
    return bigOmega;
  }

  /**
   * The value of Liouville's function for the number represented by this sequence.
   * @return lambda
   */
  public int lambda() {
    return (bigOmega() & 1) == 0 ? 1 : -1;
  }

  /**
   * Return all the integers in this FactorSequence. Sorted into ascending order.
   *
   * @return array of integers
   */
  public Z[] toZArray() {
    final Set<Z> s = mFactors.keySet();
    final Z[] r = s.toArray(new Z[s.size()]);
    Arrays.sort(r);
    return r;
  }

  /**
   * Return an array containing all possible products of the entries
   * in this factor sequence.  If the factor sequence only contains
   * primes, then this is equivalent to listing all the divisors of
   * the number formed by the product of all the values in the factor
   * sequence.  There is no guarantee on the order in which the divisors
   * will be presented.
   *
   * @param completeCheck only produce divisors if factorization in
   * complete. In rare cases it might be useful to skip this test.
   * @return array of divisors
   * @exception ArithmeticException if the number of divisors exceeds
   * 2^31.
   * @exception UnsupportedOperationException if the number is not
   * completely factored and <code>completeCheck</code> is true.
   */
  public Z[] divisors(final boolean completeCheck) {
    if (completeCheck && !isComplete()) {
      throw new UnsupportedOperationException();
    }
    final Z[] p = toZArray();
    if (p.length == 0) {
      // Number was 1
      return new Z[] {Z.ONE};
    }
    final int[] limits = new int[p.length];
    for (int k = 0; k < p.length; ++k) {
      limits[k] = getExponent(p[k]);
    }
    final long divCount = internalSigma0();
    if (divCount > Integer.MAX_VALUE) {
      throw new ArithmeticException("Too many divisors " + divCount);
    }
    final Z[] d = new Z[(int) divCount];
    d[0] = Z.ONE;
    // special cases for a small number of distinct factors, these
    // are not strictly necessary but are faster than the general
    // solution.
    if (p.length < 3) {
      if (p.length == 1) {
        Z m = Z.ONE;
        final Z pp = p[0];
        final int lim = getExponent(pp);
        for (int i = 1; i <= lim; ++i) {
          m = m.multiply(pp);
          d[i] = m;
        }
      } else {
        assert p.length == 2;
        final int lim1 = limits[1] + 1;
        final int lim0 = limits[0] * lim1;
        final Z p0 = p[0];
        final Z p1 = p[1];
        for (int i = 0; i <= lim0; i += lim1) {
          if (i > 0) {
            d[i] = d[i - lim1].multiply(p0);
          }
          for (int j = 1; j < lim1; ++j) {
            final int cell = i + j;
            d[cell] = d[cell - 1].multiply(p1);
          }
        }
      }
      return d;
    }

    // general solution
    final int[] e = new int[p.length];
    for (int k = 1; k < d.length; ++k) {
      // bump counters, j will never underflow because we have
      // just checked the termination condition above.
      int j = p.length - 1;
      while (++e[j] > limits[j]) {
        e[j--] = 0;
      }
      // compute product
      Z m = Z.ONE;
      for (int i = 0; i < p.length; ++i) {
        if (e[i] != 0) {
          m = m.multiply(p[i].pow(e[i]));
        }
      }
      d[k] = m;
    }
    return d;
  }

  /**
   * Return an array containing all possible products of the entries
   * in this factor sequence.  If the factor sequence only contains
   * primes, then this is equivalent to listing all the divisors of
   * the number formed by the product of all the values in the factor
   * sequence.  There is no guarantee on the order in which the divisors
   * will be presented.
   *
   * @return array of divisors
   * @exception ArithmeticException if the number of divisors exceeds
   * 2^31.
   */
  public Z[] divisors() {
    return divisors(true);
  }

  /**
   * Return the divisors sorted in numerical order.
   * @return divisors
   */
  public Z[] divisorsSorted() {
    final Z[] d = divisors();
    Arrays.sort(d);
    return d;
  }

  /**
   * Return the sum of the divisors.
   *
   * @return sum of the divisors
   * @exception UnsupportedOperationException if factor sequence is not completely
   * resolved to primes and probable primes.
   */
  public Z sigma() {
    if (!isComplete()) {
      throw new UnsupportedOperationException();
    }
    Z prod = Z.ONE;
    for (final Map.Entry<Z, Factor> f : mFactors.entrySet()) {
      final Z p = f.getKey();
      if (!p.equals(Z.ONE)) {
        prod = prod.multiply(p.pow(f.getValue().mExponent + 1).subtract(1)).divide(p.subtract(1));
      }
    }
    return prod;
  }

  private long internalSigma0() {
    // Skips check for complete factorization, useful for forcing some calculations
    long prod = 1;
    for (final Factor f : mFactors.values()) {
      prod *= 1L + f.mExponent;
    }
    return prod;
  }

  /**
   * Return the number of divisors.
   * @return number of divisors
   * @exception UnsupportedOperationException if factor sequence is not completely
   * resolved to primes and probable primes.
   */
  public long sigma0() {
    if (!isComplete()) {
      throw new UnsupportedOperationException(toString());
    }
    return internalSigma0();
  }

  /**
   * Return the sum of the divisors squared.
   *
   * @param degree exponent of each divisor
   * @return sum of the divisors to the specified degree
   * @exception UnsupportedOperationException if factor sequence is not completely
   * resolved to primes and probable primes.
   */
  public Z sigma(final int degree) {
    if (degree == 0) {
      return Z.valueOf(sigma0());
    }
    if (degree == 1) {
      return sigma();
    }
    if (!isComplete()) {
      throw new UnsupportedOperationException();
    }
    Z prod = Z.ONE;
    for (final Map.Entry<Z, Factor> f : mFactors.entrySet()) {
      final Z p = f.getKey();
      prod = prod.multiply(p.pow((f.getValue().mExponent + 1) * degree).subtract(1)).divide(p.pow(degree).subtract(1));
    }
    return prod;
  }

  /**
   * Return the sum of the divisors squared.
   *
   * @return sum of the divisors squared
   * @exception UnsupportedOperationException if factor sequence is not completely
   * resolved to primes and probable primes.
   */
  public Z sigma2() {
    return sigma(2);
  }

  /**
   * Merge the contents of another factor sequence into this sequence.
   *
   * @param fs a <code>FactorSequence</code> value
   */
  public void merge(final FactorSequence fs) {
    if (fs != null) {
      for (final Z n : fs.toZArray()) {
        add(n, fs.getStatus(n), fs.getExponent(n));
      }
    }
  }

  /**
   * Return the Euler phi.
   *
   * @return Euler phi function
   * @exception UnsupportedOperationException if factor sequence is not completely
   * resolved to primes and probable primes.
   */
  public Z phi() {
    if (!isComplete()) {
      throw new UnsupportedOperationException();
    }
    Z phi = Z.ONE; // trivial divisor
    for (final Map.Entry<Z, Factor> e : mFactors.entrySet()) {
      final Z p = e.getKey();
      phi = phi.multiply(p.subtract(Z.ONE)).multiply(p.pow(e.getValue().mExponent - 1));
    }
    return phi;
  }

  /**
   * Return a string representation of this factor sequence.
   *
   * @return string version of factor sequence
   */
  public String toString() {
    final Z[] f = toZArray();
    Arrays.sort(f);
    if (f.length == 0) {
      return "";
    }
    final StringBuilder b = new StringBuilder();
    for (final Z aF : f) {
      final int exponent = getExponent(aF);
      final String expstring = exponent == 1 ? "" : "^" + exponent;
      switch (getStatus(aF)) {
        case UNKNOWN:
          b.append(aF).append(expstring).append('\n');
          break;
        case COMPOSITE:
          b.append('[').append(aF).append(expstring).append("]\n");
          break;
        case PRIME:
          b.append('<').append(aF).append(expstring).append(">\n");
          break;
        case PROB_PRIME:
          b.append('<').append(aF).append(expstring).append(">#\n");
          break;
        default:
          throw new IllegalArgumentException("Impossible status field.");
      }
    }
    return b.toString();
  }

  /**
   * Determine if this factor sequence represents a semiprime. That is, a product
   * of two primes.  It returns YES for a semiprime, NO for non-semiprime,
   * and UNKNOWN if the determination cannot be made.
   *
   * @return semiprime status
   */
  public int isSemiprime() {
    if (mFactors.size() > 2) {
      return NO;
    }
    int e = 0;
    int pcount = 0;
    int ccount = 0;
    for (final Factor f : mFactors.values()) {
      e += f.mExponent;
      if (f.mStatus == PRIME || f.mStatus == PROB_PRIME) {
        ++pcount;
      } else if (f.mStatus == COMPOSITE) {
        ++ccount;
      }
    }
    if (e > 2 || ccount > 1) {
      return NO;
    }
    if (mFactors.size() == 2) {
      if (pcount == 2) {
        return YES;
      }
      if (ccount > 0) {
        return NO;
      }
      for (final Map.Entry<Z, Factor> en : mFactors.entrySet()) {
        if (en.getValue().mStatus == UNKNOWN && !en.getKey().isProbablePrime()) {
          return NO;
        }
      }
      return UNKNOWN; // e.g. UNKNOWN, UNKNOWN or PRIME, UNKNOWN
    }
    assert mFactors.size() < 2;
    if (pcount == 1) {
      return e == 2 ? YES : NO;
    }
    return UNKNOWN;
  }

  /**
   * Return the maximum exponent of any number in this factor sequence.
   *
   * @return maximum exponent
   */
  public int maxExponent() {
    int max = 0;
    for (final Factor f : mFactors.values()) {
      if (f.mExponent > max) {
        max = f.mExponent;
      }
    }
    return max;
  }

  /**
   * Return the sum of the unitary divisors in this factor sequence.
   * @return sum of unitary divisors
   */
  public Z unitaryDivisorSum() {
    if (!isComplete()) {
      throw new UnsupportedOperationException();
    }
    // Construct a nasty factor sequence where we claim all the unitary
    // prime powers in fs are actually prime.  This isn't true of course
    // but makes the sigma function do the right thing for computing the
    // sum of all unitary divisors.
    final FactorSequence flatten = new FactorSequence();
    Z t = Z.ONE;
    for (final Z p : mFactors.keySet()) {
      final int e = getExponent(p);
      final Z unitary = p.pow(e);
      flatten.add(unitary, FactorSequence.PRIME);
      t = t.multiply(unitary);
    }
    return flatten.sigma().subtract(t);
  }

  /**
   * Return the sum of the unitary divisors in this factor sequence.
   * @return sum of unitary divisors
   */
  public Z unitarySigma() {
    if (!isComplete()) {
      throw new UnsupportedOperationException();
    }
    // Construct a nasty factor sequence where we claim all the unitary
    // prime powers in fs are actually prime.  This isn't true of course
    // but makes the sigma function do the right thing for computing the
    // sum of all unitary divisors.
    final FactorSequence flatten = new FactorSequence();
    for (final Z p : mFactors.keySet()) {
      final int e = getExponent(p);
      final Z unitary = p.pow(e);
      flatten.add(unitary, FactorSequence.PRIME);
    }
    return flatten.sigma();
  }

  /**
   * Return the number of the unitary divisors in this factor sequence.
   * @return number of unitary divisors
   */
  public long unitarySigma0() {
    if (!isComplete()) {
      throw new UnsupportedOperationException();
    }
    final FactorSequence flatten = new FactorSequence();
    for (final Z p : mFactors.keySet()) {
      final int e = getExponent(p);
      final Z unitary = p.pow(e);
      flatten.add(unitary, FactorSequence.PRIME);
    }
    return flatten.sigma0();
  }

  /**
   * Raise the factor sequence to a given power
   * @param power the power
   * @return this factor sequence for chaining
   */
  public FactorSequence pow(final int power) {
    for (final Factor f : mFactors.values()) {
      f.mExponent *= power;
    }
    return this;
  }

  /**
   * Square the factor sequence and return it for chaining.
   * @return this factor sequence for chaining
   */
  public FactorSequence square() {
    return pow(2);
  }

  /**
   * Test if the number represented by this sequence is square free.
   * @return true iff the number is square free
   */
  public boolean isSquareFree() {
    if (!isComplete()) {
      throw new UnsupportedOperationException();
    }
    for (final Factor f : mFactors.values()) {
      if (f.mExponent > 1) {
        return false;
      }
    }
    return true;
  }
}
