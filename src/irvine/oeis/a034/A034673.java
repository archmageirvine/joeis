package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034673 Sum of n-th powers of divisors of 120.
 * @author Sean A. Irvine
 */
public class A034673 implements Sequence {

  private static final Z[] DIVISORS = ZUtils.toZ(1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 20, 24, 30, 40, 60, 120);
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
