package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A081514 Triangle read by rows: row n = lexicographically earliest choice for n distinct divisors of A081512(n) = m whose sum is m.
 * @author Sean A. Irvine
 */
public class A081514 extends Sequence1 {

  private long[] mRow = {1};
  private int mN = 1;
  private int mM = -1;

  private boolean is(final long[] d, final long m, final long s, final int pos, final int remaining) {
    if (remaining == 0) {
      return s == m;
    }
    for (int k = pos; k < d.length; ++k) {
      final long t = s + d[k];
      if (t <= m && is(d, m, t, k + 1, remaining - 1)) {
        mRow[mN - remaining] = d[k];
        return true;
      }
    }
    return false;
  }

  private boolean is(final long m, final int n) {
    final Z[] d = Jaguar.factor(m).divisorsSorted();
    if (d.length < n) {
      return false;
    }
    return is(ZUtils.toLong(d), m, 0, 0, n);
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mM = 0;
      mRow = new long[++mN];
      if (mN != 2) {
        long k = 5;
        while (true) {
          if (is(++k, mN)) {
            break;
          }
        }
      }
    }
    return Z.valueOf(mRow[mM]);
  }
}
