package irvine.oeis.a137;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A137251 Triangle <code>T(n,k)</code> read by rows: number of k X k triangular matrices with nonnegative integer entries and without zero rows or columns such that sum of all entries is equal to n, <code>n&gt;=1, 1&lt;=k&lt;=n</code>.
 * @author Sean A. Irvine
 */
public class A137251 extends MemoryFunctionInt3<Z[]> implements Sequence {

  // After Alois P. Heinz

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z[] compute(final int n, final int i, final int t) {
    if (n < 1) {
      final Z[] res = new Z[t + 1];
      Arrays.fill(res, Z.ZERO);
      res[t] = Z.ONE;
      return res;
    }
    List<Z> res = Collections.emptyList();
    for (int j = 0; j <= t + 1; ++j) {
      final Z[] row = get(n - 1, j, t + (j > i ? 1 : 0));
      final int lim = Math.max(res.size(), row.length);
      final List<Z> r = new ArrayList<>(lim);
      for (int k = 0; k < lim; ++k) {
        final Z x = k < res.size() ? res.get(k) : Z.ZERO;
        final Z y = k < row.length ? row[k] : Z.ZERO;
        r.add(x.add(y));
      }
      res = r;
    }
    return res.toArray(new Z[0]);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, 0, 0)[mM];
  }
}
