package irvine.oeis.a187;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A187819 Numbers k such that (9^k + 8^k)/17 is prime.
 * @author Georg Fischer
 */
public class A187819 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A187819() {
    super("[[0],[-72],[17],[-1]]", "[2, 17]", 0, primeDivTest(17));
  }

}
