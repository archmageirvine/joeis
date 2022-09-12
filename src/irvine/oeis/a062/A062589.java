package irvine.oeis.a062;
// manually 2022-09-09

import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A062589 Numbers k such that 23^k - 22^k is prime, or a strong pseudoprime.
 * @author Georg Fischer
 */
public class A062589 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A062589() {
    super("[[0],[-506],[45],[-1]]", "[0, 1]", 0);
  }
}
