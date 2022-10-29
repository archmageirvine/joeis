package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128072 Numbers k such that (3^k + 14^k)/17 is prime.
 * @author Georg Fischer
 */
public class A128072 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128072() {
    super("[[0],[-42],[17],[-1]]", "[2, 17]", 0, primeDivTest(17));
  }

}
