package irvine.oeis.a062;
// manually 2022-09-09

import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A062611 Numbers k such that 45^k - 44^k is prime or a strong pseudoprime.
 * @author Georg Fischer
 */
public class A062611 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A062611() {
    super("[[0],[-1980],[89],[-1]]", "[0, 1]", 0);
  }
}
