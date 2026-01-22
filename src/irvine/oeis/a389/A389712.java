package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A389712 a(n) is the least number k such that there is a set of n proper divisors of k whose sum is k, and no set of fewer than n proper divisors of k whose sum is k.
 * @author Sean A. Irvine
 */
public class A389712 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 2;
  private long mM = 5;
  private int mCount;

  private void count(final Z[] d, final int pos, final Z sum, final int cnt) {
    final int c = sum.compareTo(d[d.length - 1]);
    if (c >= 0) {
      if (c == 0) {
        mCount = cnt;
      }
      return;
    }
    if (cnt >= mCount) {
      return;
    }
    for (int k = pos - 1; k >= 0; --k) {
      count(d, k, sum.add(d[k]), cnt + 1);
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mCount = Integer.MAX_VALUE;
      final Z[] d = Jaguar.factor(++mM).divisorsSorted();
      count(d, d.length - 1, Z.ZERO, 0);
      if (mCount != Integer.MAX_VALUE && mFirsts.get(mCount) == 0) {
        mFirsts.set(mCount, mM);
        if (mVerbose) {
          StringUtils.message("Found solution " + mM + " for n=" + mCount);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
