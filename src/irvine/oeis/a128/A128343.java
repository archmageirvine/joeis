package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128343 Numbers k such that (14^k + 5^k)/19 is prime.
 * @author Georg Fischer
 */
public class A128343 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128343() {
    super("[[0],[-70],[19],[-1]]", "[2, 19]", 0, primeDivTest(19));
  }

}
