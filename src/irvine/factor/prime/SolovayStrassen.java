package irvine.factor.prime;

import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * Implements the Solovay-Strassen primality test. The test works in the following way:
 * choose an integer a, test if it divides the given number n, if it does then
 * we are finished. Otherwise compute <code>t=a^((n-1)/2)(mod n).</code> If this is not equal
 * to plus or minus one then n is definitely composite. Next compute the
 * Jacobi symbol of a and n. If the Jacobi symbol is not equal to t then n
 * is composite. Otherwise n may be prime. By performing several
 * iterations of the test each with a different value for a, confidence in the
 * primality of n can be increased.
 *
 * @author Sean A. Irvine
 */
public class SolovayStrassen extends AbstractPrime {

  // default number of iterations if not otherwise specified
  private int mCount = 32;

  /**
   * Construct a new SolovayStrassen primality tester with the default number of
   * iterations.
   *
   */
  public SolovayStrassen() { }

  /**
   * Construct a SolovayStrassen primality test with the specified number of iterations.
   *
   * @param count number of iterations
   */
  public SolovayStrassen(final int count) {
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
    // Handle even cases
    if (n <= 2 || (n & 1L) == 0L) {
      return n == 2;
    }
    // If argument is large, switch to Z code
    if (n > SQRT_MAX_VALUE) {
      return isPrime(Z.valueOf(n));
    }
    // Perform at most mCount iterations of the Solovay-Strassen test
    final long power = n >>> 1; // equivalent to (n-1)/2 since n is odd
    long base = 2;
    final long minusone = n & ~1L;
    for (int count = 0; count < mCount; ++count) {
      long t = LongUtils.modPow(base, power, n);
      // note that n-1 = -1 (mod n)
      if (t != 1L) {
        if (t != minusone) {
          return false;
        }
        t = -1L;
      }
      if (LongUtils.jacobi(base, n) != t) {
        return false;
      }
      if (n == ++base) {
        return true;
      }
      if (n % base == 0L) {
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
    if (n.compareTo(Z.TWO) <= 0) {
      return n.equals(Z.TWO);
    }
    if (!n.testBit(0)) {
      return false;
    }
    // once we get here then we know n is odd

    // perform at most mCount iterations of the SolovayStrassen test
    final Z power = n.divide2();
    Z base = Z.TWO;
    final Z minusone = n.clearBit(0);
    for (int count = 0; count < mCount; ++count) {
      Z tt = base.modPow(power, n);
      // note that n-1 = -1 (mod n)
      if (!tt.equals(Z.ONE)) {
        if (!tt.equals(minusone)) {
          return false;
        }
        tt = Z.NEG_ONE;
      }
      final long t = tt.longValue();
      if (base.jacobi(n) != t) {
        return false;
      }
      base = base.add(Z.ONE);
      if (base.equals(n)) {
        return true;
      }
      if (n.mod(base).equals(Z.ZERO)) {
        return false;
      }
    }
    return true;
  }

}
