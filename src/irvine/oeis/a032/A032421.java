package irvine.oeis.a032;

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A032421 Numbers k such that 143*2^k+1 is prime.
 * @author Sean A. Irvine
 */
public class A032421 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A032421() {
    super(1, 53, 143, 2, 1);
  }
}
