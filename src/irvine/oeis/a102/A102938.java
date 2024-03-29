package irvine.oeis.a102;
// Generated by gen_seq4.pl prisub at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A102938 Numbers k such that 10^k + 5*R_k + 4 is prime, where R_k = 11...1 is the repunit (A002275) of length k.
 * @author Georg Fischer
 */
public class A102938 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A102938() {
    super("[[-31],[10],[-1]]", "[5, 19]", 0);
    next();
  }
}
