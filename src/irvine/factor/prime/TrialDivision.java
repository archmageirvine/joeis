package irvine.factor.prime;

import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * Test if a number if prime using trial division. Special checks are made to
 * deal with the even numbers. The proposed number is then divided by 3, 5,
 * 7, and so on up to the square root of n. If any of these numbers is found
 * to divide n, then obviously n is composite. Works on numbers with up to
 * and including 63 bits. This is really here for demonstration only, there
 * are better ways to do this.
 *
 * @author Sean A. Irvine
 */
public class TrialDivision implements Prime {

  // the largest long value which is a prime
  private static final long MAX_LONG_PRIME = 9223372036854775783L;

  /**
   * Test if the given number is prime using trial division.
   * @param n value to test
   * @return true if n is prime, false if n is composite
   */
  @Override
  public boolean isPrime(final long n) {

    if (n < 2L) {
      return false;
    }
    if (n == 2L) {
      return true;
    }
    if ((n & 1L) == 0L) {
      return false;
    }

    // n is odd
    long f = 3L;
    final long limit = LongUtils.sqrt(n);
    while (f <= limit) {
      if (n % f == 0L) {
        return false;
      }
      f += 2L;
    }
    return true;
  }

  /**
   * Test if the given number is prime using trial division. If the number has
   * more than 63 bits then the no attempt is made and an ArithmeticException
   * is thrown.
   *
   * @param n value to test
   * @return true if n is a prime, false if n is a composite
   * @exception ArithmeticException if number is longer than 63 bits
   */
  @Override
  public boolean isPrime(final Z n) {
    return isPrime(n.longValueExact());
  }

  @Override
  public long nextPrime(long n) {

    if (n < 2L) {
      return 2L;
    }

    // make sure the answer is going to fit in a long value
    if (++n >= MAX_LONG_PRIME) {
      return 0L;
    }
    n |= 1L; // make n odd

    // we know this loop will succeed because n < MAX_LONG_PRIME
    while (true) {
      if (isPrime(n)) {
        return n;
      }
      n += 2L;
    }
  }

  @Override
  public Z nextPrime(final Z n) {
    return Z.valueOf(nextPrime(n.longValueExact()));
  }

  @Override
  public long prevPrime(long n) {
    if (n <= 2L) {
      return 0L;
    }
    if (n == 3L) {
      return 2L;
    }
    n |= 1L; // make n odd
    n -= 2L;

    // we know this loop will succeed because n > 3
    while (true) {
      if (isPrime(n)) {
        return n;
      }
      n -= 2L;
    }
  }

  @Override
  public Z prevPrime(final Z n) {
    return Z.valueOf(prevPrime(n.longValueExact()));
  }
}
