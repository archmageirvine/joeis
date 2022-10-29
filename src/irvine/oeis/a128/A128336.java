package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128336 Numbers k such that (6^k + 5^k)/11 is prime.
 * @author Georg Fischer
 */
public class A128336 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128336() {
    super("[[0],[-30],[11],[-1]]", "[2, 11]", 0, primeDivTest(11));
  }

}
