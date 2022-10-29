package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128354 Numbers k such that (19^k - 5^k)/14 is prime.
 * @author Georg Fischer
 */
public class A128354 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128354() {
    super("[[0],[-95],[24],[-1]]", "[0, 14]", 0, primeDivTest(14));
  }

}
