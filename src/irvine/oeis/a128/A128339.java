package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128339 Numbers k such that (9^k + 5^k)/14 is prime.
 * @author Georg Fischer
 */
public class A128339 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128339() {
    super("[[0],[-45],[14],[-1]]", "[2, 14]", 0, primeDivTest(14));
  }

}
