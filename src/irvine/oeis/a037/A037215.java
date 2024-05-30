package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037215 Expansion of ( Sum_{k&gt;=0} k*q^(k^2) )^3.
 * @author Sean A. Irvine
 */
public class A037215 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long x = 1; x * x <= mN; ++x) {
      final long r = mN - x * x;
      for (long y = 1; y * y <= r; ++y) {
        final long s = r - y * y;
        final long z = Functions.SQRT.l(s);
        if (z * z == s) {
          sum = sum.add(z * y * x);
        }
      }
    }
    return sum;
  }
}
