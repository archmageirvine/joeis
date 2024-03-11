package irvine.oeis.a006;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006509 Cald's sequence: a(n+1) = a(n) - prime(n) if that value is positive and new, otherwise a(n) + prime(n) if new, otherwise 0; start with a(1)=1.
 * @author Sean A. Irvine
 */
public class A006509 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mA = Z.ONE;
    } else {
      mP = mPrime.nextPrime(mP);
      final Z neg = mA.subtract(mP);
      if (neg.signum() > 0 && !mSeen.contains(neg)) {
        mA = neg;
      } else {
        final Z pos = mA.add(mP);
        if (!mSeen.contains(pos)) {
          mA = pos;
        } else {
          mA = Z.ZERO;
        }
      }
    }
    mSeen.add(mA);
    return mA;
  }

}
