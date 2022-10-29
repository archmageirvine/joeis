package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128032 Numbers k such that (19^k - 3^k)/16 is prime.
 * @author Georg Fischer
 */
public class A128032 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128032() {
    super("[[0],[-57],[22],[-1]]", "[0, 16]", 0, primeDivTest(16));
  }

}
