package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050467 a(n) = Sum_{d|n, n/d=3 mod 4} d^4.
 * @author Sean A. Irvine
 */
public class A050467 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.mod(4) == 3) {
        sum = sum.add(Z.valueOf(mN / d.longValue()).pow(4));
      }
    }
    return sum;
  }
}
