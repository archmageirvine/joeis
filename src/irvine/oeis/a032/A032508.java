package irvine.oeis.a032;

import irvine.oeis.PowerFactorPrimeSequence;

/**
 * A032508 Numbers k such that 263*2^k+1 is prime.
 * @author Sean A. Irvine
 */
public class A032508 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A032508() {
    super(1, 29, 263, 2, 1);
  }
}
