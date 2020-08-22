package irvine.oeis.a032;

import irvine.oeis.PowerFactorPrimeSequence;

/**
 * A032418 Numbers n such that 137 * 2^n + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A032418 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A032418() {
    super(1, 3, 137, 2, 1);
  }
}
