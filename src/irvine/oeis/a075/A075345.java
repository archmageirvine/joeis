package irvine.oeis.a075;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075345 extends Sequence1 {

  private final Set<Long> mUsed = new HashSet<>();
  private long mBestSum = Long.MAX_VALUE;
  protected long[] mBestList = {};
  private int mN = 0;

  private void search(final long[] soFar, final int pos, final long sum, final long prev) {
    if (pos == soFar.length) {
      if (Predicates.PRIME.is(sum)) {
        mBestSum = sum;
        mBestList = Arrays.copyOf(soFar, soFar.length);
      }
      return;
    }
    long k = prev;
    while (true) {
      final long s = sum + ++k;
      final int remaining = mN - pos;
      if (s + k * remaining >= mBestSum) {
        return;
      }
      if (!mUsed.contains(k)) {
        soFar[pos] = k;
        search(soFar, pos + 1, s, k);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mBestSum = Long.MAX_VALUE;
    search(new long[mN], 0, 0, 0);
    for (final long v : mBestList) {
      mUsed.add(v);
    }
    return Z.valueOf(mBestSum);
  }
}
