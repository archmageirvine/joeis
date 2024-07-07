package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071261.
 * @author Sean A. Irvine
 */
public class A071262 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mLim = 10;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.valueOf(21);
    }
    if (mN >= mLim) {
      mLim *= 10;
    }
    long k = mN;
    while (mPrime.isPrime(k)) {
      k += mLim;
    }
    return Z.valueOf(k);
  }
}

