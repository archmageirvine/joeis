package irvine.oeis.a267;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A267375 Numbers k such that (47^k - 1)/46 is prime.
 * @author Georg Fischer
 */
public class A267375 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A267375() {
    super("[[46],[47],[-1]]", "[0, 46]", 0, primeDivTest(46));
  }

}
