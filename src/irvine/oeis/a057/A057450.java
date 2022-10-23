package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057450 Prime recurrence: a(n+1) = a(n)-th prime, with a(1) = 4.
 * @author Sean A. Irvine
 */
public class A057450 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = null;
  private long mCount = 2;

  @Override
  public Z next() {
    if (mP == null) {
      mP = Z.FOUR;
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
