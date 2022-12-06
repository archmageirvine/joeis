package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002148 Smallest prime p==3 (mod 8) such that Q(sqrt(-p)) has class number 2n+1.
 * @author Sean A. Irvine
 */
public class A002148 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if ((p & 7) == 3 && LongUtils.hurwitzClassNumber(-p) == mN) {
        return Z.valueOf(p);
      }
    }
  }
}
