package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051764 Number of torus knots with n crossings.
 * @author Sean A. Irvine
 */
public class A051764 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    final long s = LongUtils.sqrt(++mN);
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final long d = dd.longValue();
      if (d > s && LongUtils.gcd(d, 1 + mN / d) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
