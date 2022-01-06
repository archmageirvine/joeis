package irvine.oeis.a032;

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A032506 Numbers k such that 259*2^k+1 is prime.
 * @author Sean A. Irvine
 */
public class A032506 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A032506() {
    super(1, 38, 259, 2, 1);
  }
}
