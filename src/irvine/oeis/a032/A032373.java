package irvine.oeis.a032;

import irvine.oeis.PowerFactorPrimeSequence;

/**
 * A032373 Numbers k such that 47*2^k+1 is prime.
 * @author Sean A. Irvine
 */
public class A032373 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A032373() {
    super(1, 583, 47, 2, 1);
  }
}
