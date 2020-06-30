package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A085725 Numbers k such that <code>1 +</code> (product of first k primes) is a semiprime.
 * @author Sean A. Irvine
 */
public class A085725 extends SemiprimeSequence {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;
  private Z mP = Z.ONE;

  /** Construct the sequence. */
  public A085725() {
    super(1);
  }

  @Override
  protected Z candidate(final int n) {
    mP = mPrime.nextPrime(mP);
    mA = mA.multiply(mP);
    return mA.add(1);
  }
}
