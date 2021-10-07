package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051764 Number of torus knots with n crossings.
 * @author Sean A. Irvine
 */
public class A051764 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    final long s = LongUtils.sqrt(++mN);
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final long d = dd.longValue();
      if (d > s && LongUtils.gcd(d, 1 + mN / d) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
