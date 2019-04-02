package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005794 Number of SO_1^{2+}(Z) orbits of Lorentzian modular group.
 * @author Sean A. Irvine
 */
public class A005794 implements Sequence {

  // After Michael Somos

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long k = 0; k <= LongUtils.sqrt(mN); ++k) {
      if (((mN - k) & 1) == 0) {
        final long j = (mN + k * k) / 2;
        for (final Z dd : Cheetah.factor(j).divisors()) {
          final long d = dd.longValue();
          if (d >= k && j >= d * k && (j <= d * d || (k > 0 && d > k && j > d * k))) {
            ++sum;
          }
        }
      }
    }
    return Z.valueOf(sum);
  }
}
