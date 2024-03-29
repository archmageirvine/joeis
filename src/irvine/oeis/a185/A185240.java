package irvine.oeis.a185;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A185240 Numbers k such that (35^k + 1)/36 is prime.
 * @author Georg Fischer
 */
public class A185240 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A185240() {
    super("[[-34],[35],[-1]]", "[2, 36]", 0, primeDivTest(36));
  }
}
