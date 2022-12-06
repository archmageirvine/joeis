package irvine.oeis.a060;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.Sort;

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

  private static class RectangleSet implements Comparable<RectangleSet> {
    private int[] mX;
    private int[] mY;

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
  private int mMinimalSquareSide = 0;
  private final Collection<RectangleSet> mRectangleSets = new TreeSet<>();

  private boolean isNotUsed(final long set, final int length) {
    return (set & (1L << (length - 1))) == 0;
  }

  private void generateRectangleSets(final RectangleSet rectangles, final int r, final long used, final int least) {
    if (r == mN) {
      // We have generated all the rectangles, store the result
      final RectangleSet copy = new RectangleSet(rectangles);
      copy.sort(); // Sorts rectangles by decreasing area -- useful later
      mRectangleSets.add(copy);
      return;
    }
    // Find least unused length (such a length must exist)
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
    for (int k = sy; k < sy + h; ++k) {
      for (int j = sx; j < sx + w; ++j) {
        if (used[k][j] != 0) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean attemptSolution(final RectangleSet rectangles, final int[][] used, final int r, final int w, final int h) {
    for (int sy = 0; sy <= used.length - h; ++sy) {
      for (int sx = 0; sx <= used.length - w; ++sx) {
        if (canPlace(used, sx, sy, w, h)) {
          place(used, sx, sy, w, h, r + 1);
          final boolean res = attemptSolution(rectangles, used, r + 1);
          unplace(used, sx, sy, w, h);
          if (res) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private boolean attemptSolution(final RectangleSet rectangles, final int[][] used, final int r) {
    if (r == mN) {
      // Success! All rectangles are placed withing the square
      System.out.println(Arrays.deepToString(used));
      return true;
    }
    final int w = rectangles.getX(r);
    final int h = rectangles.getY(r);
    //System.out.println("Trying to play rectangle (" + w + "," + h + ") into " + Arrays.deepToString(used));
    return attemptSolution(rectangles, used, r, w, h) || attemptSolution(rectangles, used, r, h, w);
  }

  private boolean attemptSolution(final int side, final RectangleSet rectangles) {
    System.out.println("Attempting to fit into square with side " + side);
    final int[][] used = new int[side][side]; // use int rather than boolean, so we have a record of where individual rectangles are
    // WLOG we can assume first rectangle is place with r.x == used.x and r.y == used.y axes
    // For other rectangles we also have to consider r.x == used.y abd r.y == used.x axes
    final int w = rectangles.getX(0);
    final int h = rectangles.getY(0);
    // WLOG (w,h) should have left corner in upper left quadrant
    for (int sy = 0; sy <= Math.min(side - h, side / 2); ++sy) {
      for (int sx = 0; sx <= Math.min(side - w, side / 2); ++sx) {
        place(used, sx, sy, w, h, 1);
        final boolean res = attemptSolution(rectangles, used, 1);
        unplace(used, sx, sy, w, h);
        if (res) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN > 32) {
      throw new UnsupportedOperationException();
    }
    mRectangleSets.clear();
    generateRectangleSets(new RectangleSet(mN), 0, 0L, 1);
    System.out.println("#rectangle sets: " + mRectangleSets.size());
    mMinimalSquareSide = Integer.MAX_VALUE;
    for (final RectangleSet r : mRectangleSets) {
      final int maxSide = r.maxSide();
      final int totalArea = Math.max(r.totalArea(), maxSide * maxSide);
      int side = IntegerUtils.sqrt(totalArea);
      if (side * side < totalArea) {
        ++side;
      }
      // It is only worth attempting solution if the side is smaller than
      // the currently best know solution.
      if (side < mMinimalSquareSide) {
        System.out.println("area=" + totalArea + " minimum size of square is " + side);
        while (side < mMinimalSquareSide && !attemptSolution(side, r)) {
          ++side;
        }
        mMinimalSquareSide = side;
      }
    }
    return Z.valueOf(mMinimalSquareSide);
  }
}
