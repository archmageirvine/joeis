package irvine.factor.prime;

import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * Provides default implementations of some prime functions.
 *
 * @author Sean A. Irvine
 */
public abstract class AbstractPrime implements Prime {

  /** the largest long value which is a prime */
  public static final long MAX_LONG_PRIME = 9223372036854775783L;

  /** largest number we can square within a long */
  public static final long SQRT_MAX_VALUE = LongUtils.sqrt(Long.MAX_VALUE);

  @Override
  public long nextPrime(long n) {
    if (n < 2L) {
      return 2L;
    }
    // make sure the answer is going to fit in a long value
    if (++n >= MAX_LONG_PRIME) {
      return 0L;
    }
    n |= 1; // make n odd
    while (n < SQRT_MAX_VALUE) {
      if (isPrime(n)) {
        return n;
      }
      n += 2;
    }
    // overflow to Z nextPrime method
    return nextPrime(Z.valueOf(n - 1)).longValue();
  }

  @Override
  public Z nextPrime(Z n) {
    if (n.compareTo(Z.TWO) < 0) {
      return Z.TWO;
    }
    n = n.add(Z.ONE).setBit(0); // make n odd
    while (true) {
      if (isPrime(n)) {
        return n;
      }
      n = n.add(Z.TWO);
    }
  }

  @Override
  public long prevPrime(long n) {
    if (n <= 2L) {
      return 0L;
    }
    if (n == 3L) {
      return 2L;
    }
    n |= 1L; // make sure integer is odd (and >= 5)
    while (true) {
      n -= 2L;
      if (isPrime(n)) {
        return n;
      }
    }
  }

  @Override
  public Z prevPrime(Z n) {
    if (n.compareTo(Z.TWO) < 0) {
      return Z.ZERO;
    }
    if (n.equals(Z.THREE)) {
      return Z.TWO;
    }
    n = n.setBit(0); // make sure integer is odd (and >= 5)
    while (true) {
      n = n.subtract(Z.TWO);
      if (isPrime(n)) {
        return n;
      }
    }
  }

  @Override
  public boolean isPrime(final long n) {
    return isPrime(Z.valueOf(n));
  }
}
