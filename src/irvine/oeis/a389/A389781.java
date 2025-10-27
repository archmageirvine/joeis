package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389781 Number of divisors d of n such that d^(n/d) == d (mod n).
 * @author Sean A. Irvine
 */
public class A389781 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (LongUtils.modPow(d.longValue(), mN / d.longValue(), mN) == d.mod(mN)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

