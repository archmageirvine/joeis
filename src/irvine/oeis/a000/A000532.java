package irvine.oeis.a000;

import java.util.Arrays;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000532 Number of Hamiltonian paths from NW to SW corners in an n X n grid.
 * @author Sean A. Irvine
 */
public class A000532 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  private boolean[][] mSeen;
  private int[] mEmptyRowCellCount;
  private int[] mEmptyColCellCount;

  private void prepare(final int x, final int y) {
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

  private long count(final int x, final int y) {
    if (!mark(x, y)) {
      return 0;
    }
    final long c;
    if (x == 1 && y == 1) {
      c = isValid() ? 1 : 0;
    } else {
      c = count(x + 1, y)
        + count(x - 1, y)
        + count(x, y + 1)
        + count(x, y - 1);
    }
    unmark(x, y);
    return c;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    if (mN <= 2) {
      return Z.ONE;
    }
    if (mN == 3) {
      return Z.ONE.shiftLeft(mN >>> 1);
    }
    if (mN == 4) {
      return RING.coeff(Polynomial.create(-1, 1), Polynomial.create(-1, 2, 2, -2, 1), mN - 1);
    }
    if (mN == 5) {
      return RING.coeff(Polynomial.create(1, 0, -3, 0, -2), Polynomial.create(1, 0, -11, 0, 0, 0, -2), mN - 1);
    }
    prepare(mN, mN);
    return Z.valueOf(count(1, mN));
  }
}
