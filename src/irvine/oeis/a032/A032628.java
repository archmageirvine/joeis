package irvine.oeis.a032;

import irvine.oeis.prime.PrimeSubsequence;

/**
 * A032628 Primes that are concatenations of n with n + 5.
 * @author Sean A. Irvine
 */
public class A032628 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A032628() {
    super(new A032610());
  }
}
