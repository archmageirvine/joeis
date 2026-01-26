package irvine.oeis.a392;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392683 a(n) is the number of n-element families of nonempty subsets of {1, ..., n} in which every number in 1..n appears the same nonzero number of times.
 * @author Sean A. Irvine
 */
public class A392683 extends Sequence1 {

  private int mN = 0;
  private long mCount = 0;
  private long mLim = 0;

  private void increment(final long s, final int[] elementCounts) {
    for (int k = 0; k < mN; ++k) {
      if ((s & 1L << k) != 0) {
        ++elementCounts[k];
      }
    }
  }

  private void decrement(final long s, final int[] elementCounts) {
    for (int k = 0; k < mN; ++k) {
      if ((s & 1L << k) != 0) {
        --elementCounts[k];
      }
    }
  }

  private void search(final int sets, final long prev, final int[] elementCounts) {
    if (sets == mN) {
      if (IntegerUtils.isConstant(elementCounts)) {
        ++mCount;
      }
      return;
    }
    for (long s = prev + 1; s < mLim; ++s) {
      increment(s, elementCounts);
      final int min = Functions.MIN.i(elementCounts);
      final int max = Functions.MAX.i(elementCounts);
      if (max - min < mN - sets) {
        search(sets + 1, s, elementCounts);
      }
      decrement(s, elementCounts);
    }
  }

  @Override
  public Z next() {
    ++mN;
    mLim = 1L << mN;
    mCount = 0;
    search(0, 0L, new int[mN]);
    return Z.valueOf(mCount);
  }
}
