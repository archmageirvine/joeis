package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056691 Number of divisors k of n with gcd(k+1, n) = 1.
 * @author Sean A. Irvine
 */
public class A056691 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (LongUtils.gcd(d.longValue() + 1, mN) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
