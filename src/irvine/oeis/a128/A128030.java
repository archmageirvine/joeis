package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128030 Numbers k such that (16^k - 3^k)/13 is prime.
 * @author Georg Fischer
 */
public class A128030 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128030() {
    super("[[0],[-48],[19],[-1]]", "[0, 13]", 0, primeDivTest(13));
  }

}
