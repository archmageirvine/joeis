package irvine.oeis.a030;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030057 Least number that is not a sum of distinct divisors of n.
 * @author Sean A. Irvine
 */
public class A030057 implements Sequence {

  protected long mN = 0;

  private long[] divisors(final long n) {
    final Z[] d = Jaguar.factor(n).divisorsSorted();
    final long[] divisors = new long[d.length];
    for (int k = 0; k < d.length; ++k) {
      divisors[k] = d[k].longValue();
    }
    return divisors;
  }

  private boolean isExpressible(final long[] d, final long n, final int pos) {
    if (n == 0) {
      return true;
    }
    for (int k = pos; k < d.length && d[k] <= n; ++k) {
      if (isExpressible(d, n - d[k], k + 1)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    final long[] d = divisors(++mN);
    long m = 1;
    while (isExpressible(d, ++m, 0)) {
      // do nothing
    }
    return Z.valueOf(m);
  }
}
