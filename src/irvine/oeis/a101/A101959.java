package irvine.oeis.a101;
// Generated by gen_seq4.pl pfprime 2 220 10 23 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A101959 Indices of primes in sequence defined by A(0) = 27, A(n) = 10*A(n-1) - 23 for n &gt; 0.
 * @author Georg Fischer
 */
public class A101959 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A101959() {
    super(1, 2, 220, 10, 23, 9);
  }
}
