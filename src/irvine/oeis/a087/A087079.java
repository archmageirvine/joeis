package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicArray;

/**
 * A087079 Number of lunar partitions of n: number of ways of writing n as a lunar sum of distinct terms, ignoring order.
 * @author Sean A. Irvine
 */
public class A087079 extends Sequence0 {

  private final LongDynamicArray<Z> mCounts = new LongDynamicArray<>();
  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    for (long k = mCounts.length() - 1; k > 0; --k) {
      if (mCounts.get(k) != null) {
        final long add = A087061.lunarAdd(Z.valueOf(k), n).longValueExact();
        final Z cnt = mCounts.get(add);
        mCounts.set(add, cnt == null ? mCounts.get(k) : cnt.add(mCounts.get(k)));
      }
    }
    final Z t = mCounts.get(mN);
    mCounts.set(mN, t == null ? Z.ONE : t.add(1));
    return mCounts.get(mN);
  }
}

