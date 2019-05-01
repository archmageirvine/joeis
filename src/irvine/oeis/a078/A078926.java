package irvine.oeis.a078;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A078926.
 * @author Sean A. Irvine
 */
public class A078926 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    final long lower = LongUtils.sqrt(++mN);
    final long upper = LongUtils.sqrt(2 * mN - 1);
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final long d = dd.longValueExact();
      if ((d & 1) == 1 && lower < d && d <= upper && LongUtils.gcd(d, mN / d) == 1) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
