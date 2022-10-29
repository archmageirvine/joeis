package irvine.oeis.a128;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A128353 Numbers k such that (18^k - 5^k)/13 is prime.
 * @author Georg Fischer
 */
public class A128353 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A128353() {
    super("[[0],[-90],[23],[-1]]", "[0, 13]", 0, primeDivTest(13));
  }

}
