package irvine.oeis.a064;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064365.
 * @author Sean A. Irvine
 */
public class A064365 extends Sequence0 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private final Fast mPrime = new Fast();
  private long mP = 1;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else {
      mSeen.add(mA);
      mP = mPrime.nextPrime(mP);
      final Z t = mA.subtract(mP);
      if (t.signum() > 0 && mSeen.add(t)) {
        mA = t;
      } else {
        mA = mA.add(mP);
      }
    }
    return mA;
  }
}
