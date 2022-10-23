package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036711 a(n)=number of Gaussian integers z=a+bi satisfying |z|&lt;=n+1/2, a&gt;0, b&gt;=0.
 * @author Sean A. Irvine
 */
public class A036711 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long cnt = 0;
    final long hi = ++mN * mN + mN;
    for (long x = 1; x <= mN; ++x) {
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

