package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128031 Numbers k such that (17^k - 3^k)/14 is prime.
 * @author Georg Fischer
 */
public class A128031 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128031() {
    super("[[0],[-51],[20],[-1]]", "[0, 14]", 0, primeDivTest(14));
  }

}
