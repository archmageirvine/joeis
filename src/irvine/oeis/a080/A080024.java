package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080024 Number of divisors d of n such that in binary representation d and n/d have the same number of 1's as n.
 * @author Sean A. Irvine
 */
public class A080024 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    final long c = Long.bitCount(++mN);
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final long d = dd.longValue();
      if (Long.bitCount(d) == c && Long.bitCount(mN / d) == c) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
