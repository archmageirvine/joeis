package irvine.oeis.a384;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384834 Number of divisors of n such that (-d)^d = -d (mod n).
 * @author Sean A. Irvine
 */
public class A384834 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      if (LongUtils.modPow(mN - d, d, mN) == (mN - d) % mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

