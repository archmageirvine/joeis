package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034671 Sum of n-th powers of divisors of 72.
 * @author Sean A. Irvine
 */
public class A034671 implements Sequence {

  private static final Z[] DIVISORS = ZUtils.toZ(1, 2, 3, 4, 6, 8, 9, 12, 18, 24, 36, 72);
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
