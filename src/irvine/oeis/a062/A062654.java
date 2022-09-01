package irvine.oeis.a062;
// manually/prisub at 2022-09-01

import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A062654 Numbers k such that 88^k - 87^k is prime or a strong pseudoprime.
 * @author Georg Fischer
 */
public class A062654 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A062654() {
    super("[[0],[-7656],[175],[-1]]", "[0, 1]", 0);
  }
}
