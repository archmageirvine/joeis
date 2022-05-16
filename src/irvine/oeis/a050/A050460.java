package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050460 a(n) = Sum_{ d divides n, n/d=1 mod 4} d.
 * @author Sean A. Irvine
 */
public class A050460 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.mod(4) == 1) {
        sum = sum.add(mN / d.longValue());
      }
    }
    return sum;
  }
}
