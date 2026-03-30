package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394362 Number of divisors d of n which also divide n/d + 1.
 * @author Sean A. Irvine
 */
public class A394362 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      if ((mN / d + 1) % d == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
