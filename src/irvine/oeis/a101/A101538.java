package irvine.oeis.a101;
// Generated by gen_seq4.pl pfprime 1 620 10 -53 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A101538 Indices of primes in sequence defined by A(0) = 63, A(n) = 10*A(n-1) + 53 for n &gt; 0.
 * @author Georg Fischer
 */
public class A101538 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A101538() {
    super(1, 1, 620, 10, -53, 9);
  }
}
