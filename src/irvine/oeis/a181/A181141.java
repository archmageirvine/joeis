package irvine.oeis.a181;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A181141 Numbers k such that (8^k + 7^k)/15 is prime.
 * @author Georg Fischer
 */
public class A181141 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A181141() {
    super("[[0],[-56],[15],[-1]]", "[2, 15]", 0, primeDivTest(15));
  }

}
