package irvine.oeis.a259;
// Generated by gen_seq4.pl prisub at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A259139 Numbers k such that 8*R_k + 9*10^k + 1 is prime, where R_k = 11...11 is the repunit (A002275) of length k.
 * @author Georg Fischer
 */
public class A259139 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A259139() {
    super("[[-1],[10],[-1]]", "[10, 99]", 0);
  }
}
