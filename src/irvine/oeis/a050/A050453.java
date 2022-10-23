package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050453 Sum_{d|n, d=3 mod 4} d^2.
 * @author Sean A. Irvine
 */
public class A050453 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.mod(4) == 3) {
        sum = sum.add(d.square());
      }
    }
    return sum;
  }
}
