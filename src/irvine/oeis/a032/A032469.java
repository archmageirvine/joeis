package irvine.oeis.a032;

import irvine.oeis.PowerFactorPrimeSequence;

/**
 * A032469 Numbers k such that 185*2^k+1 is a prime.
 * @author Sean A. Irvine.
 */
public class A032469 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A032469() {
    super(1, 3, 185, 2, 1);
  }
}
