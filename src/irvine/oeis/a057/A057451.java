package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057451 Prime recurrence: a(n+1) = a(n)-th prime, with a(1) = 6.
 * @author Sean A. Irvine
 */
public class A057451 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = null;
  private long mCount = 3;

  @Override
  public Z next() {
    if (mP == null) {
      mP = Z.SIX;
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
