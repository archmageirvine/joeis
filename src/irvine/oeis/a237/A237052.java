package irvine.oeis.a237;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A237052 Numbers n such that (49^n + 1)/50 is prime.
 * @author Georg Fischer
 */
public class A237052 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A237052() {
    super("[[-48],[49],[-1]]", "[2, 50]", 0, primeDivTest(50));
  }

}
