package irvine.oeis.a364;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A085725 Numbers k such that -1 + (product of first k primes) is a semiprime.
 * @author Sean A. Irvine
 */
public class A364840 extends SemiprimeSequence {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;
  private Z mP = Z.ONE;

  /** Construct the sequence. */
  public A364840() {
    super(1);
  }

  @Override
  protected Z candidate(final int n) {
    mP = mPrime.nextPrime(mP);
    mA = mA.multiply(mP);
    return mA.subtract(1);
  }
}
