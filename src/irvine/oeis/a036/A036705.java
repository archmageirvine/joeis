package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036705 Number of Gaussian integers z=a+bi satisfying n - 1/2 &lt; |z| &lt;= n + 1/2.
 * @author Sean A. Irvine
 */
public class A036705 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long cnt = 0;
    final long lo = mN * mN - mN;
    final long hi = mN * mN + mN;
    for (long x = -mN; x <= mN; ++x) {
      if (x * x > lo) {
        ++cnt; // y == 0
      }
      for (long y = 1; y <= mN; ++y) {
        final long s = x * x + y * y;
        if (s > lo && s <= hi) {
          cnt += 2;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

