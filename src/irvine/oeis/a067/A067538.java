package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a008.A008284;

/**
 * A067538 Number of partitions of n in which the number of parts divides n.
 * @author Sean A. Irvine
 */
public class A067538 extends A008284 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(get(mN, d.longValue()));
    }
    return sum;
  }
}
