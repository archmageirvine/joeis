package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008457 a(n) = Sum_{ d &gt;= 1, d divides n} (-1)^(n-d)*d^3.
 * @author Sean A. Irvine
 */
public class A008457 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.signedAdd(((mN - d.longValue()) & 1) == 0, d.pow(3));
    }
    return sum;
  }
}
