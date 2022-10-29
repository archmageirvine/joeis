package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128341 Numbers k such that (12^k + 5^k)/17 is prime.
 * @author Georg Fischer
 */
public class A128341 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128341() {
    super("[[0],[-60],[17],[-1]]", "[2, 17]", 0, primeDivTest(17));
  }

}
