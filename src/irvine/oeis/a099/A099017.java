package irvine.oeis.a099;
// Generated by gen_seq4.pl prisub at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A099017 Numbers k such that 4*10^k + 6*R_k + 1 is prime, where R_k = 11...1 is the repunit (A002275) of length k.
 * @author Georg Fischer
 */
public class A099017 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A099017() {
    super("[[-3],[10],[-1]]", "[5, 47]", 0);
  }
}
