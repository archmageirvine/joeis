package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070277 Smallest prime ending in n, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A070277 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mMod = 10;

  @Override
  public Z next() {
    if (++mN == 2 || mN == 5) {
      return Z.valueOf(mN);
    }
    if ((mN & 1) == 0 || mN % 5 == 0) {
      return Z.ZERO;
    }
    if (mN >= mMod) {
      mMod *= 10;
    }
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if ((p - mN) % mMod == 0) {
        return Z.valueOf(p);
      }
    }
  }
}
