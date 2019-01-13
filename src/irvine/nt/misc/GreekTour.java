package irvine.nt.misc;

import java.util.Arrays;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * Count solutions to maximal self-avoiding walk problems.
 * Uses a naive backtracking approach.
 *
 * @author Sean A. Irvine
 */
public final class GreekTour {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private final boolean[][] mSeen;
  private final int[] mEmptyRowCellCount;
  private final int[] mEmptyColCellCount;

  private GreekTour(final int x, final int y) {
    // Make array of size (x,y) with a border of 1 pre-marked as used.
    // This saves extra conditions in the comparisons during the search.
    // Thus the target cell is actually (1,1) and not (0,0).
    mSeen = new boolean[y + 2][x + 2];
    Arrays.fill(mSeen[0], true);
    Arrays.fill(mSeen[y + 1], true);
    for (int k = 1; k <= y; ++k) {
      mSeen[k][0] = true;
      mSeen[k][x + 1] = true;
    }
    mEmptyColCellCount = new int[x + 1];
    mEmptyRowCellCount = new int[y + 1];
    Arrays.fill(mEmptyColCellCount, y);
    Arrays.fill(mEmptyRowCellCount, x);
    mEmptyRowCellCount[0] = 0;
    mEmptyColCellCount[0] = 0;
  }

  /*
   * Attempt to add cell <code>(x,y)</code> to the current path. A
   * certain amount of checking is done, and if this mark would lead
   * to an impossible situation, then false is returned and the mark
   * is not made.
   */
  private boolean mark(final int x, final int y) {
    if (mSeen[y][x]) {
      return false;
    }
    if (--mEmptyColCellCount[x] == 0) {
      // We just filled in a column, check no non-zeros right of this
      for (int k = x + 1; k < mEmptyColCellCount.length; ++k) {
        if (mEmptyColCellCount[k] != 0) {
          mEmptyColCellCount[x]++;
          return false;
        }
      }
    }
    if (--mEmptyRowCellCount[y] == 0) {
      // We just filled in a row, check no non-zeros below this
      for (int k = y + 1; k < mEmptyRowCellCount.length; ++k) {
        if (mEmptyRowCellCount[k] != 0) {
          mEmptyColCellCount[x]++;
          mEmptyRowCellCount[y]++;
          return false;
        }
      }
    }
    mSeen[y][x] = true;
    return true;
  }

  private void unmark(final int x, final int y) {
    mSeen[y][x] = false;
    mEmptyRowCellCount[y]++;
    mEmptyColCellCount[x]++;
  }

  private boolean isValid() {
    for (final int v : mEmptyColCellCount) {
      if (v != 0) {
        return false;
      }
    }
    for (final int v : mEmptyRowCellCount) {
      if (v != 0) {
        return false;
      }
    }
    return true;
  }

  private static long count(final GreekTour gt, final int x, final int y) {
    if (!gt.mark(x, y)) {
      return 0;
    }
    final long c;
    if (x == 1 && y == 1) {
      c = gt.isValid() ? 1 : 0;
    } else {
      c = count(gt, x + 1, y)
        + count(gt, x - 1, y)
        + count(gt, x, y + 1)
        + count(gt, x, y - 1);
    }
    gt.unmark(x, y);
    return c;
  }

  /**
   * Compute the number of Greek-key tours from the north-west corner to
   * the south-west corner of an rectangular grid.
   *
   * @param x columns
   * @param y rows
   * @return number of paths
   */
  public static Z greek(final int x, final int y) {
    if (x == 0 || y == 0) {
      return Z.ZERO;
    }
    if (y == 1) {
      return x == 1 ? Z.ONE : Z.ZERO;
    }
    if (y == 2) {
      return Z.ONE;
    }
    if (y == 3) {
      if ((x & 1) == 0) {
        return Z.ZERO;
      }
      return Z.ONE.shiftLeft(x >>> 1);
    }
    if (y == 4) {
      return RING.coeff(Polynomial.create(-1, 1), Polynomial.create(-1, 2, 2, -2, 1), x - 1);
    }
    if (y == 5) {
      return RING.coeff(Polynomial.create(1, 0, -3, 0, -2), Polynomial.create(1, 0, -11, 0, 0, 0, -2), x - 1);
    }
    final GreekTour gt = new GreekTour(x, y);
    return Z.valueOf(count(gt, 1, y));
  }


  /**
   * Compute a count of Greek tour.
   *
   * @param args see usage
   */
  public static void main(final String[] args) {
    if (args == null || args.length != 2) {
      System.err.println("Usage: GreekTour rows cols");
      return;
    }
    final int x = Integer.parseInt(args[1]);
    final int y = Integer.parseInt(args[0]);
    System.out.println(String.valueOf(greek(x, y)));
  }
}
