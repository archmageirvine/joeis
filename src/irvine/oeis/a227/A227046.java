package irvine.oeis.a227;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A227046 Numbers k such that (17^k + 5^k)/22 is prime.
 * @author Georg Fischer
 */
public class A227046 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A227046() {
    super("[[0],[-85],[22],[-1]]", "[2, 22]", 0, primeDivTest(22));
  }

}
