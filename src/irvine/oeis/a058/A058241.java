package irvine.oeis.a058;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A058241 Number of sets of n positive integers that can be placed along a circle such that the set of sums of adjacent integers forms { 1, 2, ..., n^2-n+1 }.
 * @author Sean A. Irvine
 */
public class A058241 extends Sequence1 {

  // To generate exactly all of 1, 2, .., n^2-n+1 every number in the circle must be distinct;
  // because there are n sums of 1 terms, n sums of 2 terms. n sums of 3 terms, and so on up
  // to n sums of n-1 terms, but only 1 sum of n terms, hence total sums is
  // 1 + Sum_{k=1..n-1} n = n^2-n+1.
  // Because one of the sums is 1, we must have 1 is one of the n numbers. WLOG we can assume
  // the first number selected is 1.
  // By symmetry, we can assume the second number selected is larger than the last number.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mLim = 0;
  private boolean[] mSeen = null;
  private long mCount = 0;

  private boolean isUsable(final int[] circle, final int pos, final int k) {
    if (mSeen[k]) {
      return false;
    }
    for (int j = pos - 1, sum = k; j >= 0; --j) {
      sum += circle[j];
      if (sum > mLim || mSeen[sum]) {
        return false;
      }
    }
    return true;
  }

  private void use(final int[] circle, final int pos, final int k) {
    mSeen[k] = true;
    circle[pos] = k;
    for (int j = pos - 1, sum = k; j >= 0; --j) {
      sum += circle[j];
      mSeen[sum] = true;
    }
  }

  private void unuse(final int[] circle, final int pos, final int k) {
    mSeen[k] = false;
    for (int j = pos - 1, sum = k; j >= 0; --j) {
      sum += circle[j];
      mSeen[sum] = false;
    }
  }

  private boolean accept(final int[] circle) {
    // todo is this strict enough?
    for (int start = circle.length - 1, sum = 0; start >= 1; --start) {
      sum += circle[start];
      for (int k = 0, s = sum; k < start - 1; ++k) {
        s += circle[k];
        if (s > mLim || mSeen[s]) {
          return false;
        }
      }
    }
    return true;
  }

  private void search(final int[] circle, final int pos, final int sum) {
    if (pos >= circle.length) {
      // Check symmetry constraint and sums crossing circle boundary
      if (circle[1] >= circle[circle.length - 1] && accept(circle)) {
        if (mVerbose) {
          StringUtils.message("Accepted: " + Arrays.toString(circle));
        }
        ++mCount;
      }
      return;
    }
    // Consider possible elements for position pos in the circle
    final int r = circle.length - pos - 1;
    // r * (r + 3) / 2 is Sum_{j=1..r} (1+j) minimal sum of remaining terms
    final int lim = mLim - sum - r * (r + 3) / 2;
    for (int k = 2; k <= lim; ++k) {
      if (isUsable(circle, pos, k)) {
        use(circle, pos, k);
        search(circle, pos + 1, sum + k);
        unuse(circle, pos, k);
      }
    }
  }

  // The Bruck-Ryser Theorem shows that if a finite projective plane of order q exists
  // and q is congruent to 1 or 2 (mod 4), then q must be the sum of two squares.
  private boolean isZeroByBruckRyser(final int q) {
    final int r = q & 3;
    if (r == 0 || r == 3) {
      return false;
    }
    for (int k = 0; k * k <= q / 2; ++k) {
      final int j2 = q - k * k;
      final int j = Functions.SQRT.i(j2);
      if (j * j == j2) {
        return false;
      }
    }
    if (mVerbose) {
      StringUtils.message("Bruck-Ryser implies no solution for " + (q + 1));
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (isZeroByBruckRyser(mN - 1)) {
      return Z.ZERO;
    }
    mCount = 0;
    mLim = mN * mN - mN + 1;
    mSeen = new boolean[mLim + 2]; // element 0 unused
    final int[] circle = new int[mN];
    circle[0] = 1;
    mSeen[1] = true;
    search(circle, 1, 1);
    return Z.valueOf(mCount);
  }
}
