package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037216 Expansion of ( Sum_{k&gt;=0} k*q^(k^2) )^4.
 * @author Sean A. Irvine
 */
public class A037216 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long x = 1; x * x <= mN; ++x) {
      final long r = mN - x * x;
      for (long y = 1; y * y <= r; ++y) {
        final long s = r - y * y;
        for (long z = 1; z * z <= s; ++z) {
          final long t = s - z * z;
          final long w = Functions.SQRT.l(t);
          if (w * w == t) {
            sum = sum.add(w * z * y * x);
          }
        }
      }
    }
    return sum;
  }
}
