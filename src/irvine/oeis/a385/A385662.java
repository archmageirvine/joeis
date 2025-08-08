package irvine.oeis.a385;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385662 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A385662 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      if (LongUtils.modPow(d, d, mN) == LongUtils.modPow(mN - d, d, mN)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
