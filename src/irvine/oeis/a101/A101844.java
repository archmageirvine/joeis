package irvine.oeis.a101;
// Generated by gen_seq4.pl pfprime 0 350 10 -71 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A101844 Indices of primes in sequence defined by A(0) = 31, A(n) = 10*A(n-1) + 71 for n &gt; 0.
 * @author Georg Fischer
 */
public class A101844 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A101844() {
    super(1, 0, 350, 10, -71, 9);
  }
}
