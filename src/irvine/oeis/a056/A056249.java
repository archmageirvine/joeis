package irvine.oeis.a056;
// Generated by gen_seq4.pl pfprime 0 170 10 -71 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A056249 Indices of primes in sequence defined by A(0) = 11, A(n) = 10*A(n-1) + 71 for n &gt; 0.
 * @author Georg Fischer
 */
public class A056249 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A056249() {
    super(1, 0, 170, 10, -71, 9);
  }
}
