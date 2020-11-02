package irvine.oeis.a036;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A036445 Maximum size of smallest square when a square of side n is tiled with integer sided squares.
 * @author Sean A. Irvine
 */
public class A036445 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 1;
  private int mLowerBound = 0;

  private boolean twoDimensionalCheck(final boolean[][] used, final int[] parts, final int maxPart, final int partIndex, final int lastX, final int lastY) {
    if (partIndex >= maxPart) {
      return true; // We found the solution
    }
    // Try and play parts[partIndex] at each possible place
    final int p = parts[partIndex];
    final boolean sameAsPrevPart = partIndex > 0 && p == parts[partIndex - 1];
    // If we are playing subsequent parts of the same size, then do not retry positions
    // that we would have tried when playing the previous part.
    for (int y = sameAsPrevPart ? lastY : 0; y <= mN - p; ++y) {
      for (int x = sameAsPrevPart && y == lastY ? lastX : 0; x < mN; ++x) {
        if (x <= mN - p && A036444.play(used, x, y, p)) {
          if (twoDimensionalCheck(used, parts, maxPart, partIndex + 1, x + p, y)) {
            return true; // Don't need to unplay as we solved the problem
          }
          A036444.unplay(used, x, y, p);
        }
        if (!used[y][x] && p == parts[maxPart]) {
          // The current part is equal to the smallest part, but we were unable
          // to complete a solution playing in the first empty square, therefore
          // there is no possible solution.
          return false;
        }
      }
    }
    return false;
  }

  private boolean twoDimensionalCheck(final int[] parts, final int maxPart) {
    //System.out.println(mN + " Parts: " + Arrays.toString(Arrays.copyOf(parts, maxPart)));
    // parts already sorted from biggest to smallest
    final boolean[][] used = new boolean[mN][mN];
    // Attempt to play parts into the square
    return twoDimensionalCheck(used, parts, maxPart, 0, 0, 0);
  }

  private void search(final int remaining, final int[] parts, final int partIndex, final int m) {
    if (remaining == 0) {
      // We have constructed a sum mN^2 = sum(parts^2), with each part > mLowerBound.
      // But we have yet to verify that these parts can be packed into a square shape
      if (mN == 13) {
        StringUtils.message("Check: " + Arrays.toString(Arrays.copyOf(parts, partIndex)));
      }
      if (A036444.oneDimensionalCheck(parts, partIndex, mN, 0) && twoDimensionalCheck(parts, partIndex)) {
        mLowerBound = m;
        if (mVerbose) {
          StringUtils.message("a(" + mN + ") >= " + mLowerBound);
        }
      }
      return;
    }
    if (m > mLowerBound) {
      if (remaining >= m * m) {
        // Try placing another m^2
        parts[partIndex] = m;
        search(remaining - m * m, parts, partIndex + 1, m);
      }
      for (int k = m - 1; k > mLowerBound; --k) {
        final int r = remaining - k * k;
        if (r >= 0) {
          parts[partIndex] = k;
          search(remaining - k * k, parts, partIndex + 1, k);
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mLowerBound = Math.max(1, IntegerUtils.sqrt(mN / 2));
    if (mVerbose) {
      StringUtils.message("a(" + mN + ") >= " + mLowerBound);
    }

    final int s = mN * mN;
    final int[] parts = new int[s];
    search(s, parts, 0, mN - 1);
    return Z.valueOf(mLowerBound);
  }
}
