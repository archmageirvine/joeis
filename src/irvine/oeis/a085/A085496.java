package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A085496 Number of ways to write prime(n) as sum of distinct divisors of prime(n)+1.
 * @author Sean A. Irvine
 */
public class A085496 extends A000040 {

  static long count(final long p, final long[] d, final long sum, final int pos) {
    if (sum == p) {
      return 1;
    }
    long cnt = 0;
    for (int k = pos; k < d.length; ++k) {
      final long s = sum + d[k];
      if (s <= p) {
        cnt += count(p, d, s, k + 1);
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    final long[] d = ZUtils.toLong(Jaguar.factor(p + 1).divisors());
    return Z.valueOf(count(p, d, 0, 0));
  }
}
