package irvine.oeis.a068;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A068068.
 * @author Sean A. Irvine
 */
public class A068068 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final long d = dd.longValueExact();
      if ((d & 1) == 1 && LongUtils.gcd(d, mN / d) == 1) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
