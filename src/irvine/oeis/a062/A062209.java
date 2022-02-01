package irvine.oeis.a062;

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A062209 Numbers k such that the smoothly undulating palindromic number (4*10^k-7)/33 = 121...21 is a prime (or PRP).
 * @author Georg Fischer
 */
public class A062209 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A062209() {
    super(1, 7, 4, 10, -7, 33);
  }
}
