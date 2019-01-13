package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007097.
 * @author Sean A. Irvine
 */
public class A007097 implements Sequence {

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
