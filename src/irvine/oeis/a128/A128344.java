package irvine.oeis.a128;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128344 Numbers k such that (7^k - 5^k)/2 is prime.
 * @author Georg Fischer
 */
public class A128344 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128344() {
    super("[[0],[-35],[12],[-1]]", "[0, 2]", 0, primeDivTest(2));
  }
}
