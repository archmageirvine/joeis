package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034675 Sum of n-th powers of divisors of 144.
 * @author Sean A. Irvine
 */
public class A034675 implements Sequence {

  private static final Z[] DIVISORS = ZUtils.toZ(1, 2, 3, 4, 6, 8, 9, 12, 16, 18, 24, 36, 48, 72, 144);
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
