package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128340 Numbers k such that (11^k + 5^k)/16 is prime.
 * @author Georg Fischer
 */
public class A128340 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128340() {
    super("[[0],[-55],[16],[-1]]", "[2, 16]", 0, primeDivTest(16));
  }

}
