package irvine.oeis.a056;
// Generated by gen_seq4.pl pfprime 0 130 10 -31 9 at 2020-06-26 14:13
// DO NOT EDIT here!

import irvine.oeis.prime.PowerFactorPrimeSequence;


/**
 * A056245 Indices of primes in sequence defined by A(0) = 11, A(n) = 10*A(n-1) + 31 for n &gt; 0.
 * @author Georg Fischer
 */
public class A056245 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A056245() {
    super(1, 0, 130, 10, -31, 9);
  }
}
