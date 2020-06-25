package irvine.oeis.a032;

import irvine.oeis.PrimeSubsequence;

/**
 * A032631 Primes that are concatenations of n with <code>n + 8</code>.
 * @author Sean A. Irvine
 */
public class A032631 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A032631() {
    super(new A032613());
  }
}
