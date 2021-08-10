package irvine.oeis.a050;

import irvine.oeis.PrimeSubsequence;

/**
 * A050207 Primes of the form p + (smallest prime &gt;= p+1) + (smallest prime &gt;= p+3) where p is a prime.
 * @author Sean A. Irvine
 */
public class A050207 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050207() {
    super(new A050200());
  }
}
