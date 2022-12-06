package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060651 Smallest odd prime p such that Q(sqrt(-p)) has class number 2n+1.
 * @author Sean A. Irvine
 */
public class A060651 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if (LongUtils.classNumber(-p) == mN) {
        return Z.valueOf(p);
      }
    }
  }
}
