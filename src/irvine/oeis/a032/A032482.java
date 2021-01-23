package irvine.oeis.a032;

import irvine.oeis.PowerFactorPrimeSequence;

/**
 * A032482 Numbers k such that 211*2^k+1 is prime.
 * @author Sean A. Irvine
 */
public class A032482 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A032482() {
    super(1, 20, 211, 2, 1);
  }
}
