package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057457 Prime recurrence: a(n+1) = a(n)-th prime, with a(1) = 12.
 * @author Sean A. Irvine
 */
public class A057457 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = null;
  private long mCount = 5;

  @Override
  public Z next() {
    if (mP == null) {
      mP = Z.valueOf(12);
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
