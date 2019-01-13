package irvine.factor.prime;

import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * Implements the Miller primality test. By performing several
 * iterations of the test each with a different value for a, confidence in the
 * primality of n can be increased.
 *
 * @author Sean A. Irvine
 */
public class Miller extends AbstractPrime {

  // default number of iterations if not otherwise specified
  private int mCount = 16;

  /**
   * Construct a new Miller primality tester with the default number of
   * iterations.
   *
   */
  public Miller() { }

  /**
   * Construct a Miller primality test with the specified number of iterations.
   *
   * @param count number of iterations
   */
  public Miller(final int count) {
    mCount = count;
  }

  /**
   * Test if the given number is prime. If the return value is false then the
   * number is definitely composite. If the return value is true then the number
   * is a probable prime.
   *
   * @param n value to test
   * @return true if n is a (probable) prime, false if n is composite
   */
  @Override
  public boolean isPrime(final long n) {
    // handle even cases
    if (n < 2L) {
      return false;
    }
    if (n == 2L) {
      return true;
    }
    if ((n & 1L) == 0L) {
      return false;
    }
    // once we get here then we know n is odd

    // if argument is large, switch to Z code
    if (n > SQRT_MAX_VALUE) {
      return isPrime(Z.valueOf(n));
    }

    // perform at most mCount iterations of the Miller test
    // Huh? shouldn't the base change here?
    final long base = 2L;
    final long m = n - 1;
    long power = m;
    int t = 0;
    do {
      t += 1;
      power >>>= 1;
    } while ((power & 1) == 0);

    for (int count = 0; count < mCount; ++count) {
      long q = LongUtils.modPow(base, power, n);
      // note that n-1 = -1 (mod n)
      if (q == 1) {
        continue;
      }
      for (int j = 0; j < t && q != m; ++j) {
        q = (q * q) % n;
      }
      if (q != m) {
        return false;
      }
    }
    return true;
  }

  /**
   * Test if the given number is prime. If the return value is false then the
   * number is definitely composite. If the return value is true then the number
   * is a probable prime.
   *
   * @param n value to test
   * @return true if n is a (probable) prime, false if n is composite
   */
  @Override
  public boolean isPrime(final Z n) {

    // handle even numbers
    if (n.compareTo(Z.TWO) < 0) {
      return false;
    }
    if (n.equals(Z.TWO)) {
      return true;
    }
    if (!n.testBit(0)) {
      return false;
    }
    // once we get here then we know n is odd

    // perform at most mCount iterations of the Miller test
    final Z m = n.clearBit(0);
    final int t = m.getLowestSetBit();
    final Z power = m.shiftRight(t);
    final Z base = Z.TWO;
    for (int count = 0; count < mCount; ++count) {
      Z q = base.modPow(power, n);
      // note that n-1 = -1 (mod n)
      if (q.equals(Z.ONE)) {
        continue;
      }
      for (int j = 0; j < t && !q.equals(m); ++j) {
        q = q.multiply(q);
        q = q.mod(n);
      }
      if (!q.equals(m)) {
        return false;
      }
    }
    return true;
  }

}
