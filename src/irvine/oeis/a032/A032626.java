package irvine.oeis.a032;

import irvine.oeis.PrimeSubsequence;

/**
 * A032626 Primes that are concatenations of n with <code>n + 3</code>.
 * @author Sean A. Irvine
 */
public class A032626 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A032626() {
    super(new A032608());
  }
}
