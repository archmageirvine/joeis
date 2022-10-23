package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057452 Prime recurrence: a(1)=8, a(n+1) = a(n)-th prime.
 * @author Sean A. Irvine
 */
public class A057452 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = null;
  private long mCount = 4;

  @Override
  public Z next() {
    if (mP == null) {
      mP = Z.EIGHT;
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
