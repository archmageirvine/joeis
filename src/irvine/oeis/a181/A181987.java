package irvine.oeis.a181;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A181987 Numbers n such that (39^n - 1)/38 is prime.
 * @author Georg Fischer
 */
public class A181987 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A181987() {
    super("[[38],[39],[-1]]", "[0, 38]", 0, primeDivTest(38));
  }

}
