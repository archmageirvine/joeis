package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036704 a(n)=number of Gaussian integers z=a+bi satisfying |z|&lt;=n+1/2.
 * @author Sean A. Irvine
 */
public class A036704 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long cnt = 0;
    final long hi = mN * mN + mN;
    ++cnt; // x == 0
    for (long y = 1; y <= mN; ++y) {
      final long s = y * y;
      if (s <= hi) {
        cnt += 2;
      }
    }
    for (long x = 1; x <= mN; ++x) {
      cnt += 2;
      for (long y = 1; y <= mN; ++y) {
        final long s = x * x + y * y;
        if (s <= hi) {
          cnt += 4;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

