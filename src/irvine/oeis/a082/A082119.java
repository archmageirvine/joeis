package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A082119 Smallest positive difference between d and n/d for any divisor d of n.
 * @author Sean A. Irvine
 */
public class A082119 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long min = ++mN;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final long d = dd.longValue();
      final long diff = d - mN / d;
      if (diff > 0) {
        min = Math.min(min, diff);
      }
    }
    return Z.valueOf(min);
  }
}
