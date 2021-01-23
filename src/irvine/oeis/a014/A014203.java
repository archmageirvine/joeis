package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014203 Sum {i^2+j^2+k^2}, i^2+j^2+k^2 &lt;= n.
 * @author Sean A. Irvine
 */
public class A014203 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    long r;
    for (long k = 0; (r = k * k) <= mN; ++k) {
      final long u = k == 0 ? 1 : 2;
      long s;
      for (long j = 0; (s = r + j * j) <= mN; ++j) {
        final long v = j == 0 ? u : 2 * u;
        long t;
        for (long i = 0; (t = s + i * i) <= mN; ++i) {
          final long w = i == 0 ? v : 2 * v;
          sum = sum.add(w * t);
        }
      }
    }
    return sum;
  }
}
