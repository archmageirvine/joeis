package irvine.oeis.a036;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.util.string.StringUtils;

/**
 * A036444 Integer-sided squares, no more than a(n) of any size, can tile the square with side n.
 * @author Sean A. Irvine
 */
public class A036444 extends MemorySequence {

  {
    add(null); // 0
    add(null); // 1
  }
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN;

  static boolean play(final boolean[][] used, final int sx, final int sy, final int part) {
    // Check corners first for efficiency
    if (used[sy][sx] || used[sy + part - 1][sx + part - 1] || used[sy][sx + part - 1] || used[sy + part - 1][sx]) {
      return false;
    }
    for (int y = 0; y < part; ++y) {
      for (int x = 0; x < part; ++x) {
        if (used[sy + y][sx + x]) {
          // Ugh! We cannot play here
          // Unwind up to row y
          for (int v = 0; v < y; ++v) {
            Arrays.fill(used[sy + v], sx, sx + part, false);
          }
          // Unwind where we reached on row y
          Arrays.fill(used[sy + y], sx, sx + x, false);
          return false;
        }
        used[sy + y][sx + x] = true;
      }
    }
    return true;
  }

  static void unplay(final boolean[][] used, final int sx, final int sy, final int part) {
    for (int y = 0; y < part; ++y) {
      Arrays.fill(used[sy + y], sx, sx + part, false);
    }
  }

  static boolean oneDimensionalCheck(final int[] parts, final int maxPart, final int remaining, final int partIndex) {
    if (remaining == 0) {
      return true;
    }
    for (int k = partIndex; k < maxPart; ++k) {
      if (k == partIndex || parts[k] != parts[k - 1]) {
        if (oneDimensionalCheck(parts, maxPart, remaining - parts[k], k + 1)) {
          return true;
        }
      }
    }
    return false;
  }

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
        if (!used[y][x] && p == parts[maxPart - 1]) {
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

  private boolean isSolvable(final int remaining, final int[] parts, final int partIndex, final int m, final int countOfM, final int max, final boolean sawMax) {
    if (remaining == 0) {
      // We have constructed a sum mN^2 = sum(parts^2).
      // But we have yet to verify that these parts can be packed into a square shape
      // We also require at least one part size of have achieved the maximum allowed
      // (to avoiding rechecking solutions already tested in earlier stages).
      return sawMax && oneDimensionalCheck(parts, partIndex, mN, 0) && twoDimensionalCheck(parts, partIndex);
    }
    if (countOfM < max && remaining >= m * m) {
      // Try placing another m^2
      parts[partIndex] = m;
      if (isSolvable(remaining - m * m, parts, partIndex + 1, m, countOfM + 1, max, sawMax | (countOfM + 1 == max))) {
        return true;
      }
    }
    for (int k = m - 1; k >= 1; --k) {
      final int r = remaining - k * k;
      if (r >= 0) {
        parts[partIndex] = k;
        if (isSolvable(remaining - k * k, parts, partIndex + 1, k, 1, max, sawMax)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  protected Z computeNext() {
    mN = size();

    // Upper bound can save a lot of searching
    // a(n) = m => a(kn) <= m
    int upperBound = mN * mN;
    for (int k = 2; k < mN; ++k) {
      if (mN % k == 0) {
        upperBound = Math.min(upperBound, get(mN / k).intValue());
      }
    }
    if (mVerbose) {
      StringUtils.message("a(" + mN + ") <= " + upperBound);
    }

    final int s = mN * mN;
    final int[] parts = new int[s];
    int max = 1;
    while (!isSolvable(s, parts, 0, mN - 1, 0, max, false)) {
      ++max;
      if (mVerbose) {
        StringUtils.message("a(" + mN + ") >= " + max);
      }
      if (max == upperBound) {
        return Z.valueOf(max);
      }
    }
    return Z.valueOf(max);
  }
}
