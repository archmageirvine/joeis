package irvine.oeis.a059;

import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A059803 Numbers k such that 9^k - 8^k is prime.
 * @author Sean A. Irvine
 */
public class A059803 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A059803() {
    super("[[0],[-72],[17],[-1]]", "[0, 1]", 0);
  }
}
