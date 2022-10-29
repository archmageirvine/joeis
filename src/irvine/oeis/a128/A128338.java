package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128338 Numbers k such that (8^k + 5^k)/13 is prime.
 * @author Georg Fischer
 */
public class A128338 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128338() {
    super("[[0],[-40],[13],[-1]]", "[2, 13]", 0, primeDivTest(13));
  }

}
