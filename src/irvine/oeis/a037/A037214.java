package irvine.oeis.a037;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037214 Expansion of ( Sum_{k&gt;=0} k*q^(k^2) )^2.
 * @author Sean A. Irvine
 */
public class A037214 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long x = 1; x * x <= mN; ++x) {
      final long y2 = mN - x * x;
      final long y = LongUtils.sqrt(y2);
      if (y * y == y2) {
        sum = sum.add(y * x);
      }
    }
    return sum;
  }
}
