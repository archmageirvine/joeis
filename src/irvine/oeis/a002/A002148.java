package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002148 Smallest prime p==3 (mod 8) such that Q(sqrt(-p)) has class number 2n+1.
 * @author Sean A. Irvine
 */
public class A002148 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if ((p & 7) == 3 && LongUtils.classNumber(-p) == mN) {
        return Z.valueOf(p);
      }
    }
  }
}
