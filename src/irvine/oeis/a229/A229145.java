package irvine.oeis.a229;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A229145 Numbers k such that (36^k + 1)/37 is prime.
 * @author Georg Fischer
 */
public class A229145 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A229145() {
    super("[[-35],[36],[-1]]", "[2, 37]", 0, primeDivTest(37));
  }

}
