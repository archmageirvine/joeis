package irvine.oeis.a211;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A211409 Numbers n such that (9^n + 4^n)/13 is prime.
 * @author Georg Fischer
 */
public class A211409 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A211409() {
    super("[[0],[-36],[13],[-1]]", "[2, 13]", 0, primeDivTest(13));
  }
}
