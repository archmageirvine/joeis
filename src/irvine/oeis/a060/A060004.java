package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;

/**
 * A060004 a(n) = least odd number which can be represented in the form p + 2*k^2, k&gt;0, in n different ways.
 * @author Sean A. Irvine
 */
public class A060004 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private long mM = -1;
  private int mN = -1;

  private int representationCount(final long n) {
    int cnt = 0;
    for (long j, k = 1; (j = n - 2 * k * k) > 1; ++k) {
      if (mPrime.isPrime(j)) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mM += 2;
      final int cnt = representationCount(mM);
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
