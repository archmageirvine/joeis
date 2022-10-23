package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A058264 Smallest prime p of two consecutive primes, p &lt; q, such that gcd( p-1, q-1 ) = 2n.
 * @author Sean A. Irvine
 */
public class A058264 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mQ = 3;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long p = mQ;
      mQ = mPrime.nextPrime(mQ);
      final long d = LongUtils.gcd(p - 1, mQ - 1) / 2;
      if (mFirsts.get(d) == 0) {
        mFirsts.set(d, p);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
