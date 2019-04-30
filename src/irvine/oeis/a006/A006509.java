package irvine.oeis.a006;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006509 Cald's sequence: <code>a(n+1)=a(n)-p(n)</code> if new and <code>&gt;0</code>, else <code>a(n)+p(n)</code> if new, otherwise 0, where <code>p(n) =</code> n-th prime.
 * @author Sean A. Irvine
 */
public class A006509 implements Sequence {

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
