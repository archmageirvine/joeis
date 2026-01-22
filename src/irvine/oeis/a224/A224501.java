package irvine.oeis.a224;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A224501 Numbers k such that (11^k + 4^k)/15 is prime.
 * @author Georg Fischer
 */
public class A224501 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A224501() {
    super("[[0],[-44],[15],[-1]]", "[2, 15]", 0, primeDivTest(15));
  }

}
