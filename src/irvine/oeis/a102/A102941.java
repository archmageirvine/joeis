package irvine.oeis.a102;
// Generated by gen_seq4.pl prisub at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A102941 Numbers k such that 10^k + 6*R_k + 3 is prime, where R_k = 11...1 is the repunit (A002275) of length k.
 * @author Georg Fischer
 */
public class A102941 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A102941() {
    super("[[-21],[10],[-1]]", "[4, 19]", 0);
  }
}
