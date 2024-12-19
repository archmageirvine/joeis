package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A073814 a(n) is the smallest number k such that A073813(k) = prime(n).
 * @author Sean A. Irvine
 */
public class A073814 extends A073813 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (mFirsts.get(mP) == 0) {
      ++mN;
      final long t = super.next().longValueExact();
      if (mFirsts.get(t) == 0) {
        mFirsts.set(t, mN);
      }
    }
    return Z.valueOf(mFirsts.get(mP));
  }
}
