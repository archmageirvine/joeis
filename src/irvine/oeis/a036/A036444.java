package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.util.string.StringUtils;

/**
 * A036444 Integer sided squares, no more than a(n) of any size, can tile the square with side n.
 * @author Sean A. Irvine
 */
public class A036444 extends MemorySequence {

  {
    add(null); // 0
    add(null); // 1
  }
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN;

  private boolean play(final boolean[][] used, final int sx, final int sy, final int part) {
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
            for (int u = 0; u < part; ++u) {
              used[sy + v][sx + u] = false;
            }
          }
          // Unwind where we reached on row y
          for (int u = 0; u < x; ++u) {
            used[sy + y][sx + u] = false;
          }
          return false;
        }
        used[sy + y][sx + x] = true;
      }
    }
    return true;
  }

  private void unplay(final boolean[][] used, final int sx, final int sy, final int part) {
    for (int y = 0; y < part; ++y) {
      for (int x = 0; x < part; ++x) {
        used[y + sy][x + sx] = false;
      }
    }
  }

  private boolean twoDimensionalCheck(final boolean[][] used, final int[] parts, final int maxPart, final int partIndex) {
    if (partIndex >= maxPart) {
      return true; // We found the solution
    }
    // Try and play parts[partIndex] at each possible place
    final int p = parts[partIndex];
    for (int y = 0; y <= mN - p; ++y) {
      for (int x = 0; x <= mN - p; ++x) {
        if (play(used, x, y, p)) {
          if (twoDimensionalCheck(used, parts, maxPart, partIndex + 1)) {
            return true; // Don't need to unplay as we solved the problem
          }
          unplay(used, x, y, p);
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
    return twoDimensionalCheck(used, parts, maxPart, 0);
  }

  private boolean isSolvable(final int remaining, final int[] parts, final int partIndex, final int m, final int countOfM, final int max, final boolean sawMax) {
    if (remaining == 0) {
      // We have constructed a sum mN^2 = sum(parts^2).
      // But we have yet to verify that these parts can be packed into a square shape
      // We also require at least one part size of have achieved the maximum allowed
      // (to avoiding rechecking solutions already tested in earlier stages).
      return sawMax && twoDimensionalCheck(parts, partIndex);
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
