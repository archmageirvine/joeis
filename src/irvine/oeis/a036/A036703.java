package irvine.oeis.a036;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036703 a(n)=number of Gaussian integers z=a+bi satisfying n-1&lt;|z|&lt;=n, a&gt;=0, 0&lt;=b&lt;=a.
 * @author Sean A. Irvine
 */
public class A036703 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final long lo = mN * mN;
    final long s = ++mN * mN;
    if (mN == 0) {
      return Z.ONE;
    }
    long cnt = 0;
    for (long y = 0; y <= mN; ++y) {
      final long x2 = s - y * y;
      if (x2 == 0) {
        ++cnt;
      } else {
        final long xHi = Math.min(y, LongUtils.sqrt(Math.abs(x2)));
        final long xLo = LongUtils.sqrt(Math.abs(lo - y * y));
        if (xHi > xLo) {
          cnt += xHi - xLo;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

