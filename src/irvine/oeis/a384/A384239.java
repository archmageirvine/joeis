package irvine.oeis.a384;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384239 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A384239 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
      if (LongUtils.modPow(p, p, mN) == p % mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

