package irvine.oeis.a028;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A028308 Form a triangle with n numbers in top row; all other numbers are the product of their parents. The numbers must be positive and distinct and the final number is to be minimized.
 * @author Sean A. Irvine
 */
public class A028308 extends Sequence1 {

  // Incrementally chooses elements for the top row.
  // Maintain last element of each subsequent row (sufficient to compute total or back up).
  // Can use A*-style condition to determine product of remaining elements.
  // Abort search if sum will exceed current best solution.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private Z mBest = null;

  private Z aStarBound(final HashSet<Z> seen, final int k, final Z t) {
    Z s = t;
    Z p = Z.ONE;
    for (int j = k + 1; j < mN; ++j) {
      while ((p = p.add(1)).equals(t) || seen.contains(p)) {
        // do nothing
      }
      s = s.multiply(p);
    }
    return s;
  }

  private boolean isOk(final HashSet<Z> seen, final Z[] prev, final int k, Z s) {
    for (int j = 0; j <= k; ++j) {
      if (s.compareTo(mBest) >= 0 || seen.contains(s)) {
        return false;
      }
      if (prev[j] != null) {
        s = s.multiply(prev[j]);
      }
    }
    return true;
  }

  private void search(final HashSet<Z> seen, final Z prod, final Z[] prev, final int k) {
    if (k >= mN) {
      if (mBest == null || prev[mN - 1].compareTo(mBest) < 0) {
        mBest = prev[mN - 1];
        if (mVerbose) {
          StringUtils.message("Best now " + mBest);
        }
      }
    } else {
      for (Z s = Z.TWO; s.compareTo(mBest) < 0; s = s.add(1)) {
        final Z y = prod.multiply(s.pow(k));
        if (y.compareTo(mBest) < 0 && prod.multiply(aStarBound(seen, k, s).pow(k)).compareTo(mBest) < 0 && isOk(seen, prev, k, s)) {
          Z t = s;
          for (int j = 0; j <= k; ++j) {
            seen.add(t);
            final Z u = prev[j] == null ? t : t.multiply(prev[j]);
            prev[j] = t;
            t = u;
          }
          search(seen, y, prev, k + 1);
          for (int j = k; j >= 0; --j) {
            final Z u = t.divide(prev[j]);
            t = prev[j];
            prev[j] = u;
            seen.remove(t);
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    mBest = Z.ONE.shiftLeft(1000000); // More than enough for now
    final HashSet<Z> seen = new HashSet<>();
    final Z[] prev = new Z[mN];
    search(seen, Z.ONE, prev, 0);
    return mBest;
  }

}
