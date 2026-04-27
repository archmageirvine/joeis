package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394830 Number of divisors d of n that do not divide n/d - 1.
 * @author Sean A. Irvine
 */
public class A394830 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      if ((mN / d - 1) % d != 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
