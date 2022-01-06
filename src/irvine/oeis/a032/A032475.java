package irvine.oeis.a032;

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A032475 Numbers k such that 197*2^k+1 is prime.
 * @author Sean A. Irvine
 */
public class A032475 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A032475() {
    super(1, 15, 197, 2, 1);
  }
}
