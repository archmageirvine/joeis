package irvine.oeis.a032;

import irvine.oeis.PowerFactorPrimeSequence;

/**
 * A032490 Numbers k such that <code>227*2^k+1</code> is prime.
 * @author Sean A. Irvine
 */
public class A032490 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A032490() {
    super(1, 11, 227, 2, 1);
  }
}
