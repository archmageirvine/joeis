package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048874 Almost-cubes: numbers n such that n/s(n) &gt;= k/s(k) for all k&lt;n, where s(m) is the least surface area of a rectangular parallelepiped with integer side lengths and volume m.
 * @author Sean A. Irvine
 */
public class A048874 implements Sequence {

  private long mN = 0;
  private Q mBest = Q.ZERO;

  private long s(final long n) {
    long best = Long.MAX_VALUE;
    final Z[] dd = Jaguar.factor(n).divisorsSorted();
    final long[] d = new long[dd.length];
    for (int k = 0; k < dd.length; ++k) {
      d[k] = dd[k].longValue();
    }
    for (int a = 0; a < d.length; ++a) {
      final long na = n / d[a];
      for (int b = a; d[b] < na; ++b) {
        if (na % d[b] == 0) {
          final long dc = na / d[b];
          if (dc >= d[b]) {
            final long s = d[a] * d[b] + d[b] * dc + dc * d[a];
            if (s < best) {
              best = s;
            }
          }
        }
      }
    }
    return best;
  }

  @Override
  public Z next() {
    while (true) {
      final Q v = new Q(++mN, s(mN));
      if (v.compareTo(mBest) >= 0) {
        mBest = v;
        return Z.valueOf(mN);
      }
    }
  }
}

