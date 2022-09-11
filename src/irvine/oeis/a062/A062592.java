package irvine.oeis.a062;
// manually 2022-09-09

import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A062592 Numbers k such that 26^k - 25^k is prime.
 * @author Georg Fischer
 */
public class A062592 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A062592() {
    super("[[0],[-650],[51],[-1]]", "[0, 1]", 0);
  }
}
