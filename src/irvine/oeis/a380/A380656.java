package irvine.oeis.a380;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A380656 a(n) is the number of divisors d such that -d^n mod n = d.
 * @author Sean A. Irvine
 */
public class A380656 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final long d = dd.longValue();
      if ((mN - LongUtils.modPow(d, mN, mN)) % mN == d) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

