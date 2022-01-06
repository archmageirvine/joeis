package irvine.oeis.a032;

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A032478 Numbers k such that 203*2^k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A032478 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A032478() {
    super(1, 13, 203, 2, 1);
  }
}
