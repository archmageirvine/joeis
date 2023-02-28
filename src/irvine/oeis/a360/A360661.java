package irvine.oeis.a360;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A360661 allocated for Ilya Gutkovskiy.
 * @author Sean A. Irvine
 */
public class A360661 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mCount = 0;

  private void search(final long n, final long min, final int count) {
    if (n == 1) {
      if (mPrime.isPrime(count)) {
        ++mCount;
      }
      return;
    }
    for (long m = min; m <= n; ++m) {
      if (n % m == 0) {
        search(n / m, m, count + 1);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    search(mN, 2, 0);
    return Z.valueOf(mCount);
  }
}

