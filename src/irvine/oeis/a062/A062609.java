package irvine.oeis.a062;
// manually 2022-09-09

import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A062609 Numbers k such that 43^k - 42^k is prime.
 * @author Georg Fischer
 */
public class A062609 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A062609() {
    super("[[0],[-1806],[85],[-1]]", "[0, 1]", 0);
  }
}
