package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056619 Smallest prime with primitive root n, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A056619 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mS = 4;
  private long mM = 2;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mS) {
      mS = ++mM * mM;
      return (mN & 1) == 1 ? Z.TWO : Z.ZERO;
    }
    if ((mN & 1) == 1) {
      return Z.TWO;
    }
    long p = 2;
    final Z n = Z.valueOf(mN);
    while (true) {
      p = mPrime.nextPrime(p);
      if (Functions.GCD.l(mN, p) == 1 && Functions.ORDER.l(p, n) == p - 1) {
        return Z.valueOf(p);
      }
    }
  }
}

