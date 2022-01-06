package irvine.oeis.a032;

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A032401 Numbers k such that 103*2^k+1 is prime.
 * @author Sean A. Irvine
 */
public class A032401 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A032401() {
    super(1, 16, 103, 2, 1);
  }
}
