package irvine.oeis.a063;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063520 Sum divides product: number of solutions (r,s,t), r&gt;=s&gt;=t&gt;0, to the equation rst = n(r+s+t).
 * @author Sean A. Irvine
 */
public class A063520 extends Sequence1 {

  // After Charles R Greathouse IV

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
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
