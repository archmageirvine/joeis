package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070837.
 * @author Sean A. Irvine
 */
public class A070838 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mLim = 10;

  @Override
  public Z next() {
    mN += 9;
    if (mN > mLim) {
      mLim *= 10;
    }
    for (long p = 2; p < 100 * mLim; p = mPrime.nextPrime(p)) {
      if (Math.abs(p - Functions.REVERSE.l(p)) == mN) {
        return Z.valueOf(p);
      }
    }
    return Z.ZERO;
  }
}

