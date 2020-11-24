package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036709 a(n)=number of Gaussian integers z=a+bi satisfying |z|&lt;=n+1/2, a&gt;=0, b&gt;=0.
 * @author Sean A. Irvine
 */
public class A036709 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long cnt = 0;
    final long hi = mN * mN + mN;
    for (long x = 0; x <= mN; ++x) {
      for (long y = 0; y <= mN; ++y) {
        final long s = x * x + y * y;
        if (s <= hi) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

