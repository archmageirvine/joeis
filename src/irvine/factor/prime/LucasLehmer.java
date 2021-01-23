package irvine.factor.prime;

import irvine.math.z.Z;

/**
 * Implements the Lucas-Lehmer primality test for Mersenne numbers,
 * that is numbers of the form 2^n-1. Note in binary such numbers
 * contain no zero bits.
 *
 * @author Sean A. Irvine
 */
public class LucasLehmer extends AbstractPrime {

  /** Used to test the exponent. */
  private static final Feral FERAL = new Feral();

  /**
   * Test if the given number is prime. If the return value is false then the
   * number is definitely composite. If the return value is true then the number
   * is a definitely prime. If the test cannot be applied to the supplied
   * number then an ArithmeticException is thrown.
   *
   * @param n value to test
   * @return true if n is prime, false if n is composite
   * @exception ArithmeticException if test cannot be applied to <code>n</code>
   */
  @Override
  public boolean isPrime(final Z n) {

    // test n has form form 2^p-1
    final int p = n.bitCount();
    if (p != n.bitLength() || n.compareTo(Z.THREE) < 0) {
      throw new ArithmeticException("Supplied integer does not have form 2^n-1, n > 2");
    }

    // test p is prime
    if (!FERAL.isPrime(p)) {
      return false;
    }

    // apply Lucas-Lehmer method
    Z s = Z.FOUR;
    for (int i = 2; i < p; ++i) {
      s = s.modPow(Z.TWO, n).subtract(Z.TWO);
    }
    return s.isZero();
  }
}
