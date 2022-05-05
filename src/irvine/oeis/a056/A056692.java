package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056692 Number of divisors k of n with gcd(k-1, n) = 1.
 * @author Sean A. Irvine
 */
public class A056692 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      if (LongUtils.gcd(d.longValue() - 1, mN) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
