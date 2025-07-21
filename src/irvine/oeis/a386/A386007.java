package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A386007 extends Sequence1 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray(); // only prime entries used
  private final LongDynamicLongArray mNumPopular = new LongDynamicLongArray();
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 1;
  private long mMax = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long gpf = Functions.GPF.l(++mM);
      final long cnt = mCounts.increment(gpf);
      if (cnt > mMax) {
        mMax = cnt;
      }
      mNumPopular.add(cnt - 1, -1);
      final long popular = mNumPopular.increment(cnt);
      if (cnt == mMax && mFirsts.get(popular) == 0) {
        mFirsts.set(popular, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
