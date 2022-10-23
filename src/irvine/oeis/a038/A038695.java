package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038695 Smallest n-digit prime * smallest (n+1)-digit prime.
 * @author Sean A. Irvine
 */
public class A038695 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(10);
    return mPrime.nextPrime(mT).multiply(mPrime.nextPrime(mT.multiply(10)));
  }
}
