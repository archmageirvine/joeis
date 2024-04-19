package irvine.oeis.a246;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A246106 Number A(n,k) of inequivalent n X n matrices with entries from [k], where equivalence means permutations of rows or columns; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A246106 extends MemoryFunction2Sequence<Integer, List<List<int[]>>> {

  // After Alois P. Heinz

  private int mN = -1;
  private int mM = 0;

  @Override
  protected List<List<int[]>> compute(final Integer n, final Integer i) {
    if (n == 0) {
      return Collections.singletonList(Collections.emptyList());
    }
    if (i < 1) {
      return Collections.emptyList();
    }
    final ArrayList<List<int[]>> res = new ArrayList<>(get(n, i - 1));
    for (int j = 1; j <= n / i; ++j) {
      final List<List<int[]>> t = get(n - i * j, i - 1);
      for (final List<int[]> lst : t) {
        final List<int[]> map = new ArrayList<>(lst);
        map.add(new int[] {i, j});
        res.add(map);
      }
    }
    return res;
  }

  private Z per(final List<int[]> s) {
    Z prod = Z.ONE;
    for (final int[] i : s) {
      prod = prod.multiply(Z.valueOf(i[0]).pow(i[1]).multiply(Functions.FACTORIAL.z(i[1])));
    }
    return prod;
  }

  protected Z a(final int n, final int k) {
    Q sum = Q.ZERO;
    final Z zk = Z.valueOf(k);
    for (final List<int[]> s : get(n, n)) {
      for (final List<int[]> t : get(n, n)) {
        int e = 0;
        for (final int[] i : s) {
          for (final int[] j : t) {
            e += i[1] * j[1] * IntegerUtils.gcd(i[0], j[0]);
          }
        }
        sum = sum.add(new Q(zk.pow(e), per(s).multiply(per(t))));
      }
    }
    return sum.toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return a(mM, mN - mM);
  }
}
