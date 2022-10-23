package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A034672 Sum of n-th powers of divisors of 96.
 * @author Sean A. Irvine
 */
public class A034672 extends Sequence0 {

  private static final Z[] DIVISORS = ZUtils.toZ(1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 96);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z d : DIVISORS) {
      sum = sum.add(d.pow(mN));
    }
    return sum;
  }
}
