package irvine.oeis.a060;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.Sort;
import irvine.util.string.StringUtils;

/**
 * A060655.
 * @author Sean A. Irvine
 */
public class A060655 extends Sequence1 {

  // Given n rectangles we can assume the 2*n different sides are 1,...,2*n.
  // Task 1: generate all possible combinations of rectangles.
  // Task 2: rank combinations by total area, those with smaller total area are the best candidates
  // Task 3: determine minimum size of square than could conceivably be the answer
  // Task 4: for each set of rectangles, attempt placement in square
  //   Task 4a: for each rectangle set, consider rectangles from largest area to smallest area
  //   Task 4b: place given rectangle and continue search etc.
  //   Task 4c: if a given placement is complete, report success updating bounds appropriately

  /*
   * Maximum number of rectangle sets to be considered.
   * Such sets are ordered by total area, and experience indicates the best solution can be
   * expected to be found within the first few possibilities.
   */
  private static final int HEURISTIC_MAX_RECTANGLE_SETS = 1000;

  private static final class RectangleSet implements Comparable<RectangleSet> {
    private final int[] mX;
    private final int[] mY;

    private RectangleSet(final int n) {
      mX = new int[n];
      mY = new int[n];
    }

    private RectangleSet(final RectangleSet r) {
      mX = Arrays.copyOf(r.mX, r.mX.length);
      mY = Arrays.copyOf(r.mY, r.mY.length);
    }

    private void set(final int k, final int x, final int y) {
      assert y > x;
      mX[k] = x;
      mY[k] = y;
    }

    private int totalArea() {
      int area = 0;
      for (int k = 0; k < mX.length; ++k) {
        area += mX[k] * mY[k];
      }
      return area;
    }

    private int maxSide() {
      int max = 0;
      for (final int y : mY) {
        if (y > max) {
          max = y;
        }
      }
      return max;
    }

    private void sort() {
      final int[] area =  new int[mX.length];
      for (int k = 0; k < area.length; ++k) {
        area[k] = mX[k] * mY[k];
      }
      final int[] pos = IntegerUtils.identity(new int[area.length]);
      Sort.sort(area, pos);
      final int[] origX = Arrays.copyOf(mX, mX.length);
      final int[] origY = Arrays.copyOf(mY, mY.length);
      for (int k = area.length - 1, j = 0; k >= 0; --k, ++j) {
        mX[j] = origX[pos[k]];
        mY[j] = origY[pos[k]];
      }
    }

    private int getX(final int n) {
      return mX[n];
    }

    private int getY(final int n) {
      return mY[n];
    }

    @Override
    public int compareTo(final RectangleSet rectangleSet) {
      final int areaThis = totalArea();
      final int areaThat = rectangleSet.totalArea();
      final int c = Integer.compare(areaThis, areaThat);
      if (c != 0) {
        return c;
      }
      final int d = Arrays.compare(mX, rectangleSet.mX);
      if (d != 0) {
        return d;
      }
      return Arrays.compare(mY, rectangleSet.mY);
    }
  }

  private int mN = 0;
  private final TreeSet<RectangleSet> mRectangleSets = new TreeSet<>();
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private boolean isNotUsed(final long set, final int length) {
    return (set & (1L << (length - 1))) == 0;
  }

  private void generateRectangleSets(final RectangleSet rectangles, final int r, final long used, final int least) {
    if (r == mN) {
      // We have generated all the rectangles, store the result
      final RectangleSet copy = new RectangleSet(rectangles);
      copy.sort(); // Sorts rectangles by decreasing area -- useful later
      mRectangleSets.add(copy);
      if (mRectangleSets.size() > HEURISTIC_MAX_RECTANGLE_SETS) {
        mRectangleSets.pollLast();
      }
      return;
    }
    // Find the least unused length (such a length must exist)
    for (int k = least; true; ++k) {
      if (isNotUsed(used, k)) {
        // Consider each possible longer unused length
        for (int j = k + 1; j <= 2 * mN; ++j) {
          if (isNotUsed(used, j)) {
            // (k,j) is a rectangle
            rectangles.set(r, k, j);
            generateRectangleSets(rectangles, r + 1, used + (1L << (k - 1)) + (1L << (j - 1)), k + 1);
          }
        }
        break;
      }
    }
  }

  private void place(final int[][] used, final int sx, final int sy, final int w, final int h, final int c) {
    for (int k = sy; k < sy + h; ++k) {
      Arrays.fill(used[k], sx, sx + w, c);
    }
  }

  private void unplace(final int[][] used, final int sx, final int sy, final int w, final int h) {
    for (int k = sy; k < sy + h; ++k) {
      Arrays.fill(used[k], sx, sx + w, 0);
    }
  }

  private boolean canPlace(final int[][] used, final int sx, final int sy, final int w, final int h) {
    // Check corners first (only for efficiency)
    final int tx = sx + w - 1;
    final int ty = sy + h - 1;
    if (used[ty][tx] != 0 || used[ty][sx] != 0 || used[sy][tx] != 0) {
      return false;
    }
    // Check entire square
    for (int k = sy; k < sy + h; ++k) {
      for (int j = sx; j < sx + w; ++j) {
        if (used[k][j] != 0) {
          return false;
        }
      }
    }
    return true;
  }

  // Attempt solution by consider each empty cell of used[][] in turn.
  // For each such cell, try and play a currently unused rectangle in both orientations.
  // This proved much faster an earlier approach which tried each rectangle in turn
  // at each place where it could be located

  private boolean attemptSolution(final RectangleSet rectangles, final int[][] used, final int r, final int x, final int y, final int availableArea, final int requiredArea, final long rSet) {
    if (requiredArea > availableArea || y >= used.length) {
      return false;
    }
    if (r == mN) {
      // All rectangles successfully place
      assert requiredArea == 0;
      if (mVerbose) {
        StringUtils.message(mN + " new best solution has side " + used.length + ": " + Arrays.deepToString(used));
      }
      return true;
    }

    int sx = x;
    int sy = y;
    if (sx == used.length) {
      if (++sy == used.length) {
        return false;
      }
      sx = 0;
    }
    while (used[sy][sx] > 0) {
      if (++sx == used.length) {
        if (++sy == used.length) {
          return false;
        }
        sx = 0;
      }
    }
    // (sx,sy) is start position within the grid and unused
    // Try playing each unused rectangle in turn
    for (int k = 0; k < mN; ++k) {
      if ((rSet & (1L << k)) == 0) {
        // Try rectangle[k]
        final int w = rectangles.getX(k);
        final int h = rectangles.getY(k);
        final int a = w * h;
        if (sx + w <= used.length && sy + h <= used.length && canPlace(used, sx, sy, w, h)) {
          place(used, sx, sy, w, h, k + 1);
          final boolean res = attemptSolution(rectangles, used, r + 1, sx + w, sy, availableArea - a, requiredArea - a, rSet | (1L << k));
          unplace(used, sx, sy, w, h);
          if (res) {
            return true;
          }
        }
        if (sx + h <= used.length && sy + w <= used.length && canPlace(used, sx, sy, h, w)) {
          place(used, sx, sy, h, w, k + 1);
          final boolean res = attemptSolution(rectangles, used, r + 1, sx + h, sy, availableArea - a, requiredArea - a, rSet | (1L << k));
          unplace(used, sx, sy, h, w);
          if (res) {
            return true;
          }
        }
      }
    }
    // Alternative we can leave this cell empty
    return attemptSolution(rectangles, used, r, sx + 1, sy, availableArea - 1, requiredArea, rSet);
  }

  private boolean attemptSolution(final int side, final RectangleSet rectangles) {
    final int[][] used = new int[side][side]; // use int rather than boolean, so we have a record of where individual rectangles are
    final int requiredArea = rectangles.totalArea();
    return attemptSolution(rectangles, used, 0, 0, 0, side * side, requiredArea, 0L);
  }

  @Override
  public Z next() {
    if (++mN > 32) {
      throw new UnsupportedOperationException();
    }
    mRectangleSets.clear();
    generateRectangleSets(new RectangleSet(mN), 0, 0L, 1);
    if (mVerbose) {
      StringUtils.message(mN + " there " + mRectangleSets.size() + " different sets of rectangles to consider");
    }
    int minimalSquareSide = Integer.MAX_VALUE;
    for (final RectangleSet r : mRectangleSets) {
      final int maxSide = r.maxSide();
      final int totalArea = Math.max(r.totalArea(), maxSide * maxSide);
      int side = IntegerUtils.sqrt(totalArea);
      if (side * side < totalArea) {
        ++side;
      }
      // It is only worth attempting solution if the side is smaller than the currently best know solution.
      if (side < minimalSquareSide) {
        if (mVerbose) {
          StringUtils.message(mN + " considering a rectangle set with total area " + totalArea);
        }
        while (side < minimalSquareSide && !attemptSolution(side, r)) {
          ++side;
        }
        minimalSquareSide = side;
      }
    }
    return Z.valueOf(minimalSquareSide);
  }

  /**
   * Run this calculation for a specified number of rectangles.
   * @param args value of n
   */
  public static void main(final String[] args) {
    final A060655 seq = new A060655();
    seq.mN = Integer.parseInt(args[0]) - 1;
    System.out.println(seq.next());
  }
}
