package irvine.oeis.a035;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A035334 a(n) = smallest number which is not the sum of exactly 1 or a(n-1) earlier terms.
 * @author Sean A. Irvine
 */
public class A035334 extends MemorySequence {

  // Uses a heuristic, but will detect if it ever fails

  private long[] mTerms;
  private long mLeastUnused = 1;

  private void computeForbidden(final long sum, final LongDynamicBooleanArray forbidden, final int remaining, final int leastIndex, final long limit) {
    if (remaining == 0) {
      forbidden.set(sum);
      return;
    }
    for (int k = leastIndex; k < size(); ++k) {
      final long s = sum + mTerms[k];
      if (s >= limit) {
        break;
      }
      computeForbidden(s, forbidden, remaining - 1, k, limit);
    }
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    while (toList().contains(Z.valueOf(mLeastUnused))) {
      ++mLeastUnused;
    }
    final int cnt = get(size() - 1).intValueExact();
    if (mLeastUnused < cnt) {
      // We have an unused number that is smaller than the number of terms in the sum,
      // so it must automatically be the smallest unrepresentable number
      return Z.valueOf(mLeastUnused);
    }
    mTerms = new long[size()];
    for (int k = 0; k < size(); ++k) {
      mTerms[k] = get(k).longValueExact();
    }
    Arrays.sort(mTerms);
    final LongDynamicBooleanArray forbidden = new LongDynamicBooleanArray();
    final long limit = 2L << size(); // heuristic
    computeForbidden(0L, forbidden, cnt, 0, limit);
    long res = 0;
    while (++res < limit) {
      if (!forbidden.isSet(res) && !toList().contains(Z.valueOf(res))) {
        return Z.valueOf(res);
      }
    }
    throw new UnsupportedOperationException("Heuristic failed");
  }
}

