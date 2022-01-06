package irvine.oeis.a032;

import irvine.oeis.prime.PrimeSubsequence;

/**
 * A032625 Primes that are concatenations of n with n + 2.
 * @author Sean A. Irvine
 */
public class A032625 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A032625() {
    super(new A032607());
  }
}
