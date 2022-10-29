package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128070 Numbers k such that (3^k + 11^k)/14 is prime.
 * @author Georg Fischer
 */
public class A128070 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128070() {
    super("[[0],[-33],[14],[-1]]", "[2, 14]", 0, primeDivTest(14));
  }

}
