package irvine.oeis.a032;

import irvine.oeis.PrimeSubsequence;

/**
 * A032625 Primes that are concatenations of n with <code>n + 2</code>.
 * @author Sean A. Irvine
 */
public class A032625 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A032625() {
    super(new A032607());
  }
}
