package irvine.oeis.a100;
// Generated by gen_seq4.pl pfprime 2 810 10 9 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A100997 Indices of primes in sequence defined by A(0) = 91, A(m) = 10*A(m-1) - 9 for m &gt; 0.
 * @author Georg Fischer
 */
public class A100997 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A100997() {
    super(1, 2, 810, 10, 9, 9);
  }
}
