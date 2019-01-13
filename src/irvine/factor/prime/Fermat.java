package irvine.factor.prime;

import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * Implements the Fermat primality test. The test works in the following way:
 * choose an integer a, test if a divides the given number n, if it does then
 * we are finished. Otherwise compute <code>a^(n-1)(mod n)</code>. If this is not 1 then
 * n is definitely composite, other n may be prime. By performing several
 * iterations of the test each with a different value for a, confidence in the
 * primality of n can be increased.<p>
 *
 * Note there is a class of numbers called Carmichael numbers which fail
 * this tests for all choices of a.
 *
 * @author Sean A. Irvine
 */
public class Fermat extends AbstractPrime {

  // default number of iterations if not otherwise specified
  private int mCount = 32;

  /**
   * Construct a new Fermat primality tester with the default number of
   * iterations.
   *
   */
  public Fermat() { }

  /**
   * Construct a Fermat primality test with the specified number of iterations.
   *
   * @param count number of iterations
   */
  public Fermat(final int count) {
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

    // perform at most mCount iterations of the Fermat test
    final long power = n & ~1L;
    long base = 2L;
    for (int count = 0; count < mCount; ++count) {
      if (LongUtils.modPow(base, power, n) != 1L) {
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

    // perform at most mCount iterations of the Fermat test
    final Z power = n.clearBit(0);
    Z base = Z.TWO;
    for (int count = 0; count < mCount; ++count) {
      if (!base.modPow(power, n).equals(Z.ONE)) {
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
