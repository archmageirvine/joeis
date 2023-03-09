package irvine.oeis.a061;

import java.util.ArrayList;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061828 Number of partitions of n into parts using the digits of n.
 * @author Sean A. Irvine
 */
public class A061828 extends Sequence1 {

  private int mN = 0;
  private final ArrayList<Integer> mAllowed = new ArrayList<>();

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int minIndex) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int k = minIndex; k < mAllowed.size() && mAllowed.get(k) <= n; ++k) {
        sum = sum.add(get(n - mAllowed.get(k), k));
      }
      return sum;
    }
  };

  private boolean lt(final int[] a, final int[] b) {
    for (int k = 0; k < a.length; ++k) {
      if (a[k] > b[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final int[] cn = ZUtils.digitCounts(++mN);
    mAllowed.clear();
    mB.clear();
    for (int k = 1; k <= mN; ++k) {
      final int[] ck = ZUtils.digitCounts(k);
      if (lt(ck, cn)) {
        mAllowed.add(k);
      }
    }
    return mB.get(mN, 0);
  }
}

