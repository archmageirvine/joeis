package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a038.A038776;
import irvine.oeis.memory.MemorySequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A060113 Least common multiple of all orbit lengths of the permutation A038776.
 * @author Sean A. Irvine
 */
public class A060113 extends Sequence0 {

  private final MemorySequence mPerm = MemorySequence.cachedSequence(new A038776());
  private final LongDynamicBooleanArray mMarks = new LongDynamicBooleanArray();
  private int mN = -1;
  private Z mLcm = Z.ONE;

  private long cycleLength(final int n) {
    int m = n;
    long cnt = 0;
    do {
      ++cnt;
      mMarks.set(m);
      m = mPerm.a(m - 1).intValueExact();
    } while (m != n);
    return cnt;
  }

  @Override
  public Z next() {
    final int start = mN == -1 ? 1 : Functions.CATALAN.i(mN);
    final long n = ++mN;
    final int end = Functions.CATALAN.i(n);
    for (int k = start; k < end; ++k) {
      if (!mMarks.isSet(k)) {
        mLcm = mLcm.lcm(Z.valueOf(cycleLength(k)));
      }
    }
    return mLcm;
  }
}
