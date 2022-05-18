package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A068068 Number of odd unitary divisors of n. d is a unitary divisor of n if d divides n and gcd(d,n/d)=1.
 * @author Sean A. Irvine
 */
public class A068068 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValueExact();
      if ((d & 1) == 1 && LongUtils.gcd(d, mN / d) == 1) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
