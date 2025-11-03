package irvine.oeis.a081;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081517 Consider the smallest number m which can be expressed as the sum of n distinct numbers coprime to m. Sequence gives triangle (read by rows) of the set of coprime numbers pertaining to m. When there is a choice, use the lexicographically earliest solution.
 * @author Sean A. Irvine
 */
public class A081517 extends Sequence1 {

  protected long[] mRow = {};
  private int mN = 0;
  private int mM = 0;

  private boolean is(final ArrayList<Long> set, final long m, final long s, final int pos, final int remaining) {
    if (remaining == 0) {
      return s == m;
    }
    for (int k = pos; k < set.size(); ++k) {
      if (s + set.get(k) * remaining <= m && is(set, m, s + set.get(k), k + 1, remaining - 1)) {
        mRow[mN - remaining] = set.get(k);
        return true;
      }
    }
    return false;
  }

  private ArrayList<Long> coprimes(final long k) {
    final ArrayList<Long> res = new ArrayList<>();
    for (long j = 1; j <= k; ++j) {
      if (Functions.GCD.l(j, k) == 1) {
        res.add(j);
      }
    }
    return res;
  }

  protected void step() {
    mRow = new long[++mN];
    int k = 0;
    while (true) {
      final ArrayList<Long> coprimes = coprimes(++k);
      if (coprimes.size() >= mN && is(coprimes(k), k, 0, 0, mN)) {
        break;
      }
    }
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mM = 0;
      step();
    }
    return Z.valueOf(mRow[mM]);
  }
}
