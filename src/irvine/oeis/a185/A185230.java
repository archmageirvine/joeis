package irvine.oeis.a185;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A185230 Numbers n such that (33^n + 1)/34 is prime.
 * @author Georg Fischer
 */
public class A185230 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A185230() {
    super("[[-32],[33],[-1]]", "[2, 34]", 0, primeDivTest(34));
  }

}
