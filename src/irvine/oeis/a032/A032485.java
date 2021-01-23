package irvine.oeis.a032;

import irvine.oeis.PowerFactorPrimeSequence;

/**
 * A032485 Numbers k such that 217*2^k+1 is prime.
 * @author Sean A. Irvine
 */
public class A032485 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A032485() {
    super(1, 66, 217, 2, 1);
  }
}
