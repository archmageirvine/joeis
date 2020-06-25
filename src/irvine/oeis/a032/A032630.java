package irvine.oeis.a032;

import irvine.oeis.PrimeSubsequence;

/**
 * A032630 Primes that are concatenations of n with <code>n + 7</code>.
 * @author Sean A. Irvine
 */
public class A032630 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A032630() {
    super(new A032612());
  }
}
