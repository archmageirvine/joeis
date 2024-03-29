package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050454 a(n) = Sum_{d|n, d=3 mod 4} d^3.
 * @author Sean A. Irvine
 */
public class A050454 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.mod(4) == 3) {
        sum = sum.add(d.pow(3));
      }
    }
    return sum;
  }
}
