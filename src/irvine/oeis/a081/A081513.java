package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A081513 a(2)=0; for n != 2, let m = A081512(n), then a(n) = value of d_n in the lexicographically earliest set of n distinct divisors d_1, ..., d_n of m with d_1 + ... + d_n = m.
 * @author Sean A. Irvine
 */
public class A081513 extends Sequence1 {

  private long mN = 0;

  private long search(final long[] d, final long m, final long s, final int pos, final long remaining) {
    if (remaining == 0) {
      return s == m ? d[pos - 1] : 0;
    }
    for (int k = pos; k < d.length; ++k) {
      final long t = s + d[k];
      if (t <= m) {
        final long res = search(d, m, t, k + 1, remaining - 1);
        if (res != 0) {
          return res;
        }
      }
    }
    return 0;
  }

  private long search(final long m, final long n) {
    final Z[] d = Jaguar.factor(m).divisorsSorted();
    if (d.length < n) {
      return 0;
    }
    return search(ZUtils.toLong(d), m, 0, 0, n);
  }

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.valueOf(2 - mN);
    }
    long k = 5;
    while (true) {
      final long res = search(++k, mN);
      if (res != 0) {
        return Z.valueOf(res);
      }
    }
  }
}
