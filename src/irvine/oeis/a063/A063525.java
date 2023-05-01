package irvine.oeis.a063;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063525 Sum divides product: number of ordered triples of positive solutions (r,s,t) to the equation rst = n(r+s+t).
 * @author Sean A. Irvine
 */
public class A063525 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long t = 1; t <= LongUtils.sqrt(3 * mN); ++t) {
      for (long s = t; s <= mN + LongUtils.sqrt(mN * mN + t); ++s) {
        final long d = s * t - mN;
        if (d != 0) {
          final long n = mN * (s + t);
          if (n % d == 0 && n / d >= s) {
            final long r = n / d;
            if (s == t && r == t) {
              ++cnt;
            } else if (s == t || s == r) {
              cnt += 3;
            } else {
              cnt += 6;
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
