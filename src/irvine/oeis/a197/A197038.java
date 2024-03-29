package irvine.oeis.a197;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A197038 Numbers k such that (2^k + 3^k)/97 is prime.
 * @author Georg Fischer
 */
public class A197038 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A197038() {
    super("[[0],[-6],[5],[-1]]", "[2, 5]", 0, primeDivTest(97));
  }
}
