package irvine.oeis.a101;
// Generated by gen_seq4.pl pfprime 0 460 10 17 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A101570 Indices of primes in sequence defined by A(0) = 53, A(n) = 10*A(n-1) - 17 for n &gt; 0.
 * @author Georg Fischer
 */
public class A101570 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A101570() {
    super(1, 0, 460, 10, 17, 9);
  }
}
