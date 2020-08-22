package irvine.oeis.a032;

import irvine.oeis.PrimeSubsequence;

/**
 * A032632 Primes that are decimal concatenations of n with n + 9.
 * @author Sean A. Irvine
 */
public class A032632 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A032632() {
    super(new A032614());
  }
}
