package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A085274 Composite k such that (k!/k#) + 1 is a semiprime, where k# = primorial numbers A034386.
 * @author Sean A. Irvine
 */
public class A085274 extends SemiprimeSequence {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;

  @Override
  protected Z candidate(final int n) {
    if (n > 1 && !mPrime.isPrime(n)) {
      mA = mA.multiply(n);
      return mA.add(1);
    }
    return Z.ONE; // we apparently want to skip n prime for this
  }
}
