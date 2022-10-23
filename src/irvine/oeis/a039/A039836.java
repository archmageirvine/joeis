package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A039836 Maximal number m of integers s(i), with 1 &lt;= s(1) &lt; s(2) &lt; ... &lt; s(m) &lt;= n, such that all sums s(i) + s(j), i&lt;&gt;j, are distinct.
 * @author Sean A. Irvine
 */
public class A039836 extends Sequence1 {

  // Direct backtracking search

  private int mN = 0;
  private int mMax = 0;
  private final int[] mS = new int[100];

  private boolean isOk(final int k, final int m, final LongDynamicBooleanArray seen) {
    for (int j = 0; j < m; ++j) {
      if (seen.isSet(k + mS[j])) {
        return false;
      }
    }
    return true;
  }

  private void search(final LongDynamicBooleanArray seen, final int m) {
    if (m > mMax) {
      mMax = m;
    }
    final int prev = mS[m - 1];
    if (mN - prev < mMax - m) {
      return; // insufficient remaining numbers
    }
    for (int k = prev + 1; k <= mN; ++k) {
      if (isOk(k, m, seen)) {
        mS[m] = k;
        for (int j = 0; j < m; ++j) {
          seen.set(k + mS[j]);
        }
        search(seen, m + 1);
        for (int j = 0; j < m; ++j) {
          seen.clear(k + mS[j]);
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    for (int k = 1; k <= mN; ++k) {
      mS[0] = k;
      search(new LongDynamicBooleanArray(), 1);
    }
    return Z.valueOf(mMax);
  }
}
