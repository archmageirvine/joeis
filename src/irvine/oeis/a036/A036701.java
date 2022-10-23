package irvine.oeis.a036;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036701 a(n)=number of Gaussian integers z=a+bi satisfying n-1&lt;|z|&lt;=n, a&gt;=0, 0&lt;=b&lt;a.
 * @author Sean A. Irvine
 */
public class A036701 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long lo = mN * mN;
    final long s = ++mN * mN;
    if (mN == 0) {
      return Z.ZERO;
    }
    long cnt = 0;
    for (long y = 1; y <= mN; ++y) {
      final long x2 = s - y * y;
      if (x2 == 0) {
        ++cnt;
      } else {
        final long xHi = Math.min(y - 1, LongUtils.sqrt(Math.abs(x2)));
        final long xLo = LongUtils.sqrt(Math.abs(lo - y * y));
        if (xHi > xLo) {
          cnt += xHi - xLo;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

