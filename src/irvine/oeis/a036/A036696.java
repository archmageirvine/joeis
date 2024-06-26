package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036696 a(n)=number of Gaussian integers z=a+bi satisfying n-1&lt;|z|&lt;=n, b&gt;=0.
 * @author Sean A. Irvine
 */
public class A036696 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long lo = mN * mN;
    final long s = ++mN * mN;
    if (mN == 0) {
      return Z.ONE; // because lo is not valid for this case
    }
    long cnt = 0;
    for (long y = 0; y <= mN; ++y) {
      final long x2 = s - y * y;
      if (x2 == 0) {
        ++cnt;
      } else {
        final long xHi = Functions.SQRT.l(Math.abs(x2));
        final long xLo = Functions.SQRT.l(Math.abs(lo - y * y));
        cnt += 2 * (xHi - xLo);
      }
    }
    return Z.valueOf(cnt);
  }
}

