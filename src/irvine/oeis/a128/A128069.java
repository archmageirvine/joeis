package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128069 Numbers k such that (3^k + 10^k)/13 is prime.
 * @author Georg Fischer
 */
public class A128069 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128069() {
    super("[[0],[-30],[13],[-1]]", "[2, 13]", 0, primeDivTest(13));
  }

}
