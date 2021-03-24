package irvine.oeis.a337;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A337211 b(a(n)) is a closer approximation than b(a(n-1)), where b(k) is the "best approximation" to k as defined in A337210.
 * @author Sean A. Irvine
 */
public class A337211 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private CR mBest = CR.TWO;
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
      if (b.compareTo(mBest) < 0) {
        mBest = b;
        if (mVerbose) {
          System.out.println(mN + " # b=" + mBest.toString(30));
        }
        return Z.valueOf(mN);
      }
    }
  }
}
