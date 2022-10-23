package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013938 a(n) = Sum_{k=1..n} floor(n/k^4).
 * @author Sean A. Irvine
 */
public class A013938 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; ; ++k) {
      final long s = k * k;
      final long t = s * s;
      if (t > mN) {
        break;
      }
      sum = sum.add(mN / t);
    }
    return sum;
  }
}
