package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A388063.
 * @author Sean A. Irvine
 */
public class A389572 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private long mBest = 0;

  private void search(final int remaining, final long x, final Z v) {
    if (remaining == 0) {
      if (x < mBest) {
        mBest = x;
        if (mVerbose) {
          StringUtils.message(mN + " new best " + mBest);
        }
      }
      return;
    }
    long t = x + 1;
    while (t + remaining <= mBest) {
      final long u = t * t + 1;
      if (Functions.GCD.z(v, u).isOne()) {
        search(remaining - 1, t, v.multiply(u));
      }
      ++t;
    }
  }

  @Override
  public Z next() {
    ++mN;
    mBest = Long.MAX_VALUE;
    search(mN, 0, Z.ONE);
    return Z.valueOf(mBest);
  }
}

