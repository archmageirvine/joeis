package irvine.oeis.a056;
// Generated by gen_seq4.pl pfprime 3 690 10 3 9 at 2019-07-30 14:36
// DO NOT EDIT here!

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A056260 Indices of primes in sequence defined by A(0) = 77, A(n) = 10*A(n-1) - 3 for n &gt; 0. Numbers n such that (690*10^n + 3)/9 is prime.
 * @author Georg Fischer
 */
public class A056260 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A056260() {
    super(1, 3, 690, 10, 3, 9);
  }
}
