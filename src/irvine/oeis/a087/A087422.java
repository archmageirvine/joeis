package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087422 Number of terms in the expansion of Product(x_i + x_{i+1} + ... + x_j) over 1 &lt;= i &lt; j &lt;= n.
 * @author Sean A. Irvine
 */
public class A087422 extends Sequence0 {

  private int mN = -1;
  private long mCount = 0;

  private static long binomial2(final long n) {
    return Functions.TRIANGULAR.l(n - 1);
  }

  private void search(final int q, final int n, final long[] s) {
    final long total = binomial2(n);
    long lo = 0;
    for (int p = 0; p < q; ++p) {
      lo = Math.max(lo, s[p] + binomial2(q - p));
    }
    if (q == n) {
      if (lo <= total) {
        ++mCount;
      }
      return;
    }
    final long hi = total - binomial2(n - q);
    for (long v = lo; v <= hi; ++v) {
      s[q] = v;
      search(q + 1, n, s);
    }
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    mCount = 0;
    search(1, mN, new long[mN + 1]);
    return Z.valueOf(mCount);
  }
}
