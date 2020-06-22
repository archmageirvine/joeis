package irvine.oeis.a032;

import irvine.oeis.PowerFactorPrimeSequence;

/**
 * A032497 Numbers n such that <code>241*2^n+1</code> is prime.
 * @author Sean A. Irvine
 */
public class A032497 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A032497() {
    super(1, 36, 241, 2, 1);
  }
}
