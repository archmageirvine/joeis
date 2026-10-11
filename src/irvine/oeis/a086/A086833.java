package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A086833 Minimum number of different addends occurring in any shortest addition chain of Brauer type for a given n, or 0 if n has no shortest addition chain of Brauer type.
 * @author Sean A. Irvine
 */
public class A086833 extends Sequence1 {

  private long mN = 0;
  private int mShortest = 0;
  private int mBest = 0;
  private final DynamicLongArray mA = new DynamicLongArray();
  private LongDynamicLongArray mB = null;
  {
    mA.set(0, 1L);
  }

  private void search(final long sum, final int pos, final int distinct) {
    if (sum == mN) {
      if (pos <= mShortest) {
        if (pos < mShortest) {
          mShortest = pos;
          mBest = distinct;
        } else if (distinct < mBest) {
          mBest = distinct;
        }
      }
      return;
    }
    if (pos > mShortest) {
      return;
    }
    final long prev = mA.get(pos - 1);
    for (int k = 0; k < pos; ++k) {
      final long add = mA.get(k);
      final long t = prev + add;
      if (t > mN) {
        return;
      }
      mA.set(pos, t);
      final int d = distinct + (mB.increment(add) == 1 ? 1 : 0);
      search(t, pos + 1, d);
      mB.add(add, - 1);
    }
  }

  @Override
  public Z next() {
    ++mN;
    mShortest = Integer.MAX_VALUE;
    mBest = Integer.MAX_VALUE;
    mB = new LongDynamicLongArray();
    mB.increment(1);
    search(1, 1, 1);
    return mShortest == Integer.MAX_VALUE ? Z.ZERO : Z.valueOf(mBest);
  }
}
