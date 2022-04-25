package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056619 Smallest prime with primitive root n, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A056619 implements Sequence {

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
      if (LongUtils.gcd(mN, p) == 1 && new IntegersModMul(p).order(n).longValueExact() == p - 1) {
        return Z.valueOf(p);
      }
    }
  }
}

