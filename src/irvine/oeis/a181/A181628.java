package irvine.oeis.a181;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A181628 Numbers k such that (2^k + 3^k)/13 is prime.
 * @author Georg Fischer
 */
public class A181628 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A181628() {
    super("[[0],[-6],[5],[-1]]", "[2, 5]", 0, primeDivTest(13));
  }

}
