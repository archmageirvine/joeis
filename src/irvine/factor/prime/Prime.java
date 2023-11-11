package irvine.factor.prime;

import irvine.math.z.Z;

/**
 * Defines methods which can be used to step through a sequences of primes
 * in increasing or decreasing sequence and to test specific numbers for
 * primality.
 *
 * @author Sean A. Irvine
 */
public interface Prime {

  /**
   * Test if the given number is prime. Implementations may vary whether the
   * test is provable or probabilistic but every implementation
   * should indicate which type of test is performed.
   *
   * @param n value to test
   * @return true if n is a (probable) prime, false if n is a (probable) composite
   */
  boolean isPrime(long n);

  /**
   * Test if the given number is prime. Implementations may vary whether the
   * test is provable or probabilistic but every implementation
   * should indicate which type of test is performed. The implementation can
   * throw an ArithmeticException if it cannot determine the primality of the
   * number.
   *
   * @param n value to test
   * @return true if n is a (probable) prime, false if n is a (probable) composite
   * @exception ArithmeticException if primality status cannot be determined
   */
  boolean isPrime(Z n);

  /**
   * Return the smallest positive prime larger than n (that is, if n is already prime
   * then the next prime after n is returned). If for any reason such a number
   * cannot be returned (e.g. because of overflow) then zero is returned. This
   * function may be implemented probabilistically.
   *
   * @param n number
   * @return the smallest prime larger than n
   */
  long nextPrime(long n);

  /**
   * Return the smallest positive prime larger than n (that is, if n is already prime
   * then the next prime after n is returned). If for any reason such a number
   * cannot be returned (e.g. because of overflow) then zero is returned. This
   * function may be implemented probabilistically.
   *
   * @param n number
   * @return the smallest prime larger than n
   */
  Z nextPrime(Z n);

  /**
   * Return the largest positive prime smaller than n (that is, if n is already prime
   * then the prime prior to n is returned). If for any reason such a number
   * cannot be returned (e.g. because of underflow) then zero is returned. This
   * function may be implemented probabilistically.
   *
   * @param n number
   * @return the largest prime smaller than n
   */
  long prevPrime(long n);

  /**
   * Return the largest positive prime smaller than n (that is, if n is already prime
   * then the prime prior to n is returned). If for any reason such a number
   * cannot be returned (e.g. because of underflow) then zero is returned. This
   * function may be implemented probabilistically.
   *
   * @param n number
   * @return the largest prime smaller than n
   */
  Z prevPrime(Z n);

}
