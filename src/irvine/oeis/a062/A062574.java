package irvine.oeis.a062;
// manually prisub at 2023-03-15

import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A062574 Numbers k such that 8^k - 7^k is prime or a strong pseudoprime.
 * @author Georg Fischer
 */
public class A062574 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A062574() {
    super("[[0],[-56],[15],[-1]]", "[0, 1]", 0);
  }
}
