package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059843 a(n) is the smallest prime p such that p-n is a nonzero square.
 * @author Sean A. Irvine
 */
public class A059843 extends Sequence1 {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    ++mN;
    long p = mPrime.nextPrime(mN);
    while (true) {
      final long m = p - mN;
      final long s = LongUtils.sqrt(m);
      if (s * s == m) {
        return Z.valueOf(p);
      }
      p = mPrime.nextPrime(p);
    }
  }
}
