package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036708 a(n)=number of Gaussian integers z=a+bi satisfying n-1/2&lt;|z|&lt;=n+1/2, b&gt;=0.
 * @author Sean A. Irvine
 */
public class A036708 extends Sequence0 {

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
      for (long y = 0; y <= mN; ++y) {
        final long s = x * x + y * y;
        if (s > lo && s <= hi) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

