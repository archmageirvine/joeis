package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008457 <code>a(n) = Sum_{ d &gt;= 1</code>, d divides <code>n} (-1)^(n-d)*d^3</code>.
 * @author Sean A. Irvine
 */
public class A008457 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum = sum.signedAdd(((mN - d.longValue()) & 1) == 0, d.pow(3));
    }
    return sum;
  }
}
