package irvine.oeis.a045;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045880 Integers whose square root is "well approximated" by other square roots of integers.
 * @author Sean A. Irvine
 */
public class A045880 extends Sequence1 {

  private CR mPrev = CR.TWO;
  private int mN = 0;
  private final ArrayList<CR> mSqrtCache = new ArrayList<>();

  private CR sqrt(final int n) {
    while (n >= mSqrtCache.size()) {
      mSqrtCache.add(CR.valueOf(mSqrtCache.size()).sqrt());
    }
    return mSqrtCache.get(n);
  }

  private CR search(final CR s, final int c) {
    if (c <= 0) {
      return s;
    }
    final CR t = s.subtract(sqrt(c));
    if (t.signum(-256) <= 0) {
      return search(s, c - 1);
    }
    return search(s, c - 1).min(search(t, c - 1));
  }

  @Override
  public Z next() {
    while (true) {
      final CR b = search(sqrt(++mN), mN - 1);
      if (b.compareTo(mPrev) < 0) {
        mPrev = b;
        return Z.valueOf(mN);
      }
      mPrev = b;
    }
  }
}
