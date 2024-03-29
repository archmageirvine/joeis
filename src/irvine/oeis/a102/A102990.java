package irvine.oeis.a102;
// Generated by gen_seq4.pl prisub at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A102990 Numbers n such that 4*10^n + 3*R_n + 6 is prime, where R_n = 11...1 is the repunit (A002275) of length n.
 * @author Georg Fischer
 */
public class A102990 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A102990() {
    super("[[-51],[10],[-1]]", "[10, 49]", 0);
  }
}
