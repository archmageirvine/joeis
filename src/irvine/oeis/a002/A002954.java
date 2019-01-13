package irvine.oeis.a002;

import java.util.HashSet;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A002954.
 * @author Sean A. Irvine
 */
public class A002954 implements Sequence {

  // We use 0 for not yet computed and -1 for a true 0 (i.e. a prime)
  private final LongDynamicLongArray mChowla = new LongDynamicLongArray();
  private final DynamicLongArray mLeast = new DynamicLongArray();
  private long mN = 1;
  private int mIndex = 0;

  private long chowla(final long n) {
    if (n >= mChowla.length() || mChowla.get(n) == 0) {
      final long sigma = Cheetah.factor(n).sigma().longValueExact() - n - 1;
      mChowla.set(n, sigma == 0 ? -1 : sigma);
    }
    final long v = mChowla.get(n);
    return v == -1 ? 0 : v;
  }


  @Override
  public Z next() {
    ++mIndex;
    final HashSet<Long> seen = new HashSet<>();
    while (mLeast.get(mIndex) == 0) {
      long n = ++mN;
      seen.clear();
      int c = 0;
      while (n != 0 && seen.add(n)) {
        n = chowla(n);
        ++c;
      }
      if (n == 0 && mLeast.get(c) == 0) {
        mLeast.set(c, mN);
      }
    }
    return Z.valueOf(mLeast.get(mIndex));
  }
}
