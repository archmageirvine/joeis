package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014203 a(n) = Sum_{i,j,k in Z and i^2 + j^2 + k^2 &lt;= n} i^2 + j^2 + k^2.
 * @author Sean A. Irvine
 */
public class A014203 extends Sequence0 {

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
