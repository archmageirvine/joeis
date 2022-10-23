package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050459 a(n) = Sum_{d|n, d==1 mod 4} d^3 - Sum_{d|n, d==3 mod 4} d^3.
 * @author Sean A. Irvine
 */
public class A050459 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      final long r = d.mod(4);
      if (r == 1) {
        sum = sum.add(d.pow(3));
      } else if (r == 3) {
        sum = sum.subtract(d.pow(3));
      }
    }
    return sum;
  }
}
