package irvine.oeis.a101;
// Generated by gen_seq4.pl pfprime 0 270 10 -63 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A101973 Indices of primes in sequence defined by A(0) = 23, A(n) = 10*A(n-1) + 63 for n &gt; 0.
 * @author Georg Fischer
 */
public class A101973 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A101973() {
    super(1, 0, 270, 10, -63, 9);
  }
}
