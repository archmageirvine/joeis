package irvine.oeis.a032;

import irvine.oeis.prime.PrimeSubsequence;

/**
 * A032631 Primes that are concatenations of n with n + 8.
 * @author Sean A. Irvine
 */
public class A032631 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A032631() {
    super(new A032613());
  }
}
