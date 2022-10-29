package irvine.oeis.a309;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A309410 Numbers k such that (41^k + 1)/42 is prime.
 * @author Georg Fischer
 */
public class A309410 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A309410() {
    super("[[-40],[41],[-1]]", "[2, 42]", 0, primeDivTest(42));
  }

}
