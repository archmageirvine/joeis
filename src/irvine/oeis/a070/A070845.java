package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070837.
 * @author Sean A. Irvine
 */
public class A070845 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private Z mLim = Z.ONE;

  @Override
  public Z next() {
    final Z lo = mLim;
    mLim = mLim.multiply(10);
    if (++mN >= 29 && mPrime.isPrime(mN)) {
      return Z.ZERO;
    }
    Z t = mLim;
    do {
      t = t.subtract(1);
      if (Functions.SIGMA0.l(t) == mN) {
        return t;
      }
    } while (t.compareTo(lo) >= 0);
    return Z.ZERO;
  }
}

/*

If n is a prime < 29 then a(n) = 11^(n-1). - Chandler
If n is a prime >= 29 then a(n) = 0. - Vladeta Jovovic, Aug 20 2002
 */
