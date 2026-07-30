package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A395056 allocated for Ron Gordon.
 * @author Sean A. Irvine
 */
public class A395056 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mMin = 0;

  private void search(final long n, final long p, final long cnt) {
    if (n == 0) {
      if (cnt < mMin) {
        mMin = cnt;
      }
      return;
    }
    if (cnt >= mMin) {
      return;
    }
    final long q = mPrime.nextPrime(p);
    if (q > n) {
      return;
    }
    search(n - q, q, cnt);
    if (cnt + 1 < mMin) {
      search(n, q, cnt + 1);
    }
  }

  @Override
  public Z next() {
    ++mN;
    mMin = Long.MAX_VALUE;
    search(mN - 1, 1, 0);
    search(mN, 1, 1);
    return Z.valueOf(mMin);
  }
}
