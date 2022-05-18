package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050468 Sum_{d|n, n/d=1 mod 4} d^4 - Sum_{d|n, n/d=3 mod 4} d^4.
 * @author Sean A. Irvine
 */
public class A050468 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      final long r = d.mod(4);
      if (r == 1) {
        sum = sum.add(Z.valueOf(mN / d.longValue()).pow(4));
      } else if (r == 3) {
        sum = sum.subtract(Z.valueOf(mN / d.longValue()).pow(4));
      }
    }
    return sum;
  }
}
