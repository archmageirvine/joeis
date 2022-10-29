package irvine.oeis.a309;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A309409 Numbers k such that (37^k + 1)/38 is prime.
 * @author Georg Fischer
 */
public class A309409 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A309409() {
    super("[[-36],[37],[-1]]", "[2, 38]", 0, primeDivTest(38));
  }

}
