package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128352 Numbers k such that (17^k - 5^k)/12 is prime.
 * @author Georg Fischer
 */
public class A128352 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128352() {
    super("[[0],[-85],[22],[-1]]", "[0, 12]", 0, primeDivTest(12));
  }

}
