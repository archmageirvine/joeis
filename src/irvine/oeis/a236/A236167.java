package irvine.oeis.a236;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A236167 Numbers k such that (47^k + 1)/48 is prime.
 * @author Georg Fischer
 */
public class A236167 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A236167() {
    super("[[-46],[47],[-1]]", "[2, 48]", 0, primeDivTest(48));
  }

}
