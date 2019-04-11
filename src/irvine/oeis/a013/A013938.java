package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013938 <code>a(n) =</code> Sum_{k=1..n} <code>floor(n/k^4)</code>.
 * @author Sean A. Irvine
 */
public class A013938 implements Sequence {

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
