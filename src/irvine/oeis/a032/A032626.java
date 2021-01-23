package irvine.oeis.a032;

import irvine.oeis.PrimeSubsequence;

/**
 * A032626 Primes that are concatenations of n with n + 3.
 * @author Sean A. Irvine
 */
public class A032626 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A032626() {
    super(new A032608());
  }
}
