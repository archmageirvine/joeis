package irvine.oeis.a101;
// Generated by gen_seq4.pl pfprime 0 450 10 -27 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A101740 Indices of primes in sequence defined by A(0) = 47, A(n) = 10*A(n-1) + 27 for n &gt; 0.
 * @author Georg Fischer
 */
public class A101740 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A101740() {
    super(1, 0, 450, 10, -27, 9);
  }
}
