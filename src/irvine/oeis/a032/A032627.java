package irvine.oeis.a032;

import irvine.oeis.prime.PrimeSubsequence;

/**
 * A032627 Primes that are concatenations of n with n + 4.
 * @author Sean A. Irvine
 */
public class A032627 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A032627() {
    super(new A032609());
  }
}
