package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005794 Number of SO_1^{2+}(Z) orbits of Lorentzian modular group.
 * @author Sean A. Irvine
 */
public class A005794 extends Sequence1 {

  // After Michael Somos

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long k = 0; k <= Functions.SQRT.l(mN); ++k) {
      if (((mN - k) & 1) == 0) {
        final long j = (mN + k * k) / 2;
        for (final Z dd : Jaguar.factor(j).divisors()) {
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
