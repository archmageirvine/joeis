package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007097 Primeth recurrence: a(n+1) = a(n)-th prime.
 * @author Sean A. Irvine
 */
public class A007097 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mP = null;
  private long mCount = 0;

  @Override
  public Z next() {
    if (mP == null) {
      mP = Z.ONE;
    } else {
      final long p = mP.longValueExact();
      while (mCount < p) {
        mP = mPrime.nextPrime(mP);
        ++mCount;
      }
    }
    return mP;
  }
}
