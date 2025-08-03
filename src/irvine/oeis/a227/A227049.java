package irvine.oeis.a227;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A227049 Numbers k such that (15^k + 4^k)/19 is prime.
 * @author Georg Fischer
 */
public class A227049 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A227049() {
    super("[[0],[-60],[19],[-1]]", "[2, 19]", 0, primeDivTest(19));
  }

}
