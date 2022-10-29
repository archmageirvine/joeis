package irvine.oeis.a098;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A098438 Numbers k such that (30^k - 1)/29 is prime.
 * @author Georg Fischer
 */
public class A098438 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A098438() {
    super("[[29],[30],[-1]]", "[0, 29]", 0, primeDivTest(29));
  }

}
