package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061398.
 * @author Sean A. Irvine
 */
public class A068362 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long lo = CR.valueOf(mN).log().multiply(mN).floor().longValueExact();
      final long hi = CR.valueOf(mN + 1).log().multiply(mN + 1).floor().longValueExact();
      long p = mPrime.nextPrime(lo);
      long cnt = 0;
      while (p < hi && cnt <= 4) {
        ++cnt;
        p = mPrime.nextPrime(p);
      }
      if (cnt == 4) {
        return Z.valueOf(mN);
      }
    }
  }
}

