package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070837.
 * @author Sean A. Irvine
 */
public class A070844 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private Z mLim = Z.ONE;

  @Override
  public Z next() {
    Z t = mLim;
    mLim = mLim.multiply(10);
    if (mPrime.isPrime(++mN)) {
      return mN >= 29 ? Z.ZERO : Z.valueOf(11).pow(mN - 1);
    }
    do {
      if (Functions.SIGMA0.l(t) == mN) {
        return t;
      }
      t = t.add(1);
    } while (t.compareTo(mLim) < 0);
    return Z.ZERO;
  }
}
