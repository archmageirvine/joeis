package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A082120 Smallest difference &gt; 1 between d and n/d for any divisor d of n.
 * @author Sean A. Irvine
 */
public class A082120 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    long min = ++mN;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final long d = dd.longValue();
      final long diff = d - mN / d;
      if (diff > 1) {
        min = Math.min(min, diff);
      }
    }
    return Z.valueOf(min);
  }
}
