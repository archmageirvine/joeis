package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128071 Numbers k such that (3^k + 13^k)/16 is prime.
 * @author Georg Fischer
 */
public class A128071 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128071() {
    super("[[0],[-39],[16],[-1]]", "[2, 16]", 0, primeDivTest(16));
  }

}
