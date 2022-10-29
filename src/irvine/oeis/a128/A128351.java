package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128351 Numbers k such that (16^k - 5^k)/11 is prime.
 * @author Georg Fischer
 */
public class A128351 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128351() {
    super("[[0],[-80],[21],[-1]]", "[0, 11]", 0, primeDivTest(11));
  }

}
