package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128075 Numbers k such that (3^k + 19^k)/22 is prime.
 * @author Georg Fischer
 */
public class A128075 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128075() {
    super("[[0],[-57],[22],[-1]]", "[2, 22]", 0, primeDivTest(22));
  }

}
