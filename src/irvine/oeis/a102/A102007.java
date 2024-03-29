package irvine.oeis.a102;
// Generated by gen_seq4.pl pfprime 0 90 10 63 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A102007 Indices of primes in sequence defined by A(0) = 17, A(n) = 10*A(n-1) - 63 for n &gt; 0.
 * @author Georg Fischer
 */
public class A102007 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A102007() {
    super(1, 0, 90, 10, 63, 9);
  }
}
