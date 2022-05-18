package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005793 Number of O_1^{2+}(Z)-orbits of Lorentzian modular group.
 * @author Sean A. Irvine
 */
public class A005793 implements Sequence {

  // After Michael Somos

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long k = 0; k <= LongUtils.sqrt(mN); ++k) {
      if (((mN - k) & 1) == 0) {
        final long j = (mN + k * k) / 2;
        for (final Z dd : Jaguar.factor(j).divisors()) {
          final long d = dd.longValue();
          if (d >= k && d * d <= j) {
            ++sum;
          }
        }
      }
    }
    return Z.valueOf(sum);
  }
}
