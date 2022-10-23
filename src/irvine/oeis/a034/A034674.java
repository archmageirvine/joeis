package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A034674 Sum of n-th powers of divisors of 128.
 * @author Sean A. Irvine
 */
public class A034674 extends Sequence0 {

  private static final Z[] DIVISORS = ZUtils.toZ(1, 2, 4, 8, 16, 32, 64, 128);
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
