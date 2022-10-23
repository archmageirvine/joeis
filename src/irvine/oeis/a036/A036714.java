package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036714 a(n)=number of Gaussian integers z=a+bi satisfying n-1/2&lt;|z|&lt;=n+1/2, a&gt;=0, 0&lt;=b&lt;a.
 * @author Sean A. Irvine
 */
public class A036714 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long cnt = 0;
    final long lo = ++mN * mN - mN;
    final long hi = mN * mN + mN;
    for (long x = 0; x <= mN; ++x) {
      for (long y = x + 1; y <= mN; ++y) {
        final long s = x * x + y * y;
        if (s > lo && s <= hi) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

