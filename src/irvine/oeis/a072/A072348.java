package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072339.
 * @author Sean A. Irvine
 */
public class A072348 extends Sequence0 {

  private static final long[] SUFFIX = {1, 3, 7, 9};
  private final Fast mPrime = new Fast();
  private long mN = -10;
  private long mR = 100;

  @Override
  public Z next() {
    mN += 10;
    if (mN == mR) {
      mR *= 10;
    }
    long cnt = 0;
    long s = mN;
    for (int k = 1; k < 10; ++k) {
      s += mR;
      for (final long v : SUFFIX) {
        if (mPrime.isPrime(s + v)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
