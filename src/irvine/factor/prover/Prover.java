package irvine.factor.prover;

import irvine.math.z.Z;

/**
 * Defines methods which can be used to prove primality.
 * @author Sean A. Irvine
 */
public interface Prover {

  /**
   * Test if the given number is prime.
   * @param n value to test
   * @return status indicating result of test
   */
  PrimeStatus isPrime(long n);

  /**
   * Test if the given number is prime.
   * @param n value to test
   * @return status indicating result of test
   */
  PrimeStatus isPrime(Z n);

  /**
   * Set whether or not to produce extra messages detailing progress
   * as the proof proceeds.  Such messages should only be
   * produced on standard error.
   *
   * @param verbose true for verbose output
   */
  void setVerbose(boolean verbose);


  /**
   * Test if verbose output is currently turned on.
   * @return true if verbose mode is active
   */
  boolean isVerbose();

  /**
   * Print an informational message to standard error if output is verbose.
   * @param message message to print
   */
  void message(final String message);
}
