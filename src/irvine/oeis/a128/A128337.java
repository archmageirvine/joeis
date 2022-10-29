package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128337 Numbers k such that (7^k + 5^k)/12 is prime.
 * @author Georg Fischer
 */
public class A128337 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128337() {
    super("[[0],[-35],[12],[-1]]", "[2, 12]", 0, primeDivTest(12));
  }

}
