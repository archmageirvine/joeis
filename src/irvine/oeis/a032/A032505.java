package irvine.oeis.a032;

import irvine.oeis.prime.PowerFactorPrimeSequence;

/**
 * A032505 Numbers n such that 257*2^n+1 is prime.
 * @author Sean A. Irvine
 */
public class A032505 extends PowerFactorPrimeSequence {

  /** Construct the sequence. */
  public A032505() {
    super(1, 279, 257, 2, 1);
  }
}
