package irvine.oeis.a000;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000755 No-3-in-line problem on n X n grid: total number of ways of placing 2n points on n X n grid so no 3 are in a line. No symmetries are taken into account.
 * @author Sean A. Irvine
 */
public class A000755 implements Sequence {

  // This is not a very competitive implementation.
  // Among other things it takes no account of symmetry.

  private int mN = 0;
  private int mNSquared = 0;
  private int[][][] mLines;

  private void initLines() {
    // Precomputes positions and slopes for lines
    mLines = new int[mNSquared][mNSquared][4];
    for (int a = 0; a < mNSquared; ++a) {
      final int ay = a / mN;
      final int ax = a % mN;
      for (int b = 0; b < mNSquared; ++b) {
        if (a != b) {
          final int by = b / mN;
          final int bx = b % mN;
          final int ty = ay - by;
          final int tx = ax - bx;
          final int d = IntegerUtils.gcd(tx, ty);
          final int dx = tx / d;
          final int dy = ty / d;
          mLines[a][b][0] = ax;
          mLines[a][b][1] = ay * mN; // prescaling
          mLines[a][b][2] = dx;
          mLines[a][b][3] = dy * mN; // prescaling
        }
      }
    }
  }

  private boolean isValid(final boolean[] used, final int newPoint) {
    final int[][] linesAtNewPoint = mLines[newPoint];
    for (int k = 0; k < used.length; ++k) {
      if (used[k] && k != newPoint) {
        final int[] vec = linesAtNewPoint[k];
        final int dx = vec[2];
        final int dy = vec[3];
        int cnt = 1; // point (nx, ny)
        int qx = vec[0] + dx;
        int qy = vec[1] + dy;
        while (qx >= 0 && qy >= 0 && qx < mN && qy < mNSquared) {
          if (used[qy + qx] && ++cnt > 2) {
            return false;
          }
          qx += dx;
          qy += dy;
        }
        qx = vec[0] - dx;
        qy = vec[1] - dy;
        while (qx >= 0 && qy >= 0 && qx < mN && qy < mNSquared) {
          if (used[qy + qx] && ++cnt > 2) {
            return false;
          }
          qx -= dx;
          qy -= dy;
        }
      }
    }
    return true;
  }

  private int setBlocks(final int[] blocked, final boolean[] used, final int newPoint) {
    blocked[newPoint] = newPoint + 1;
    int cnt = 1;
    final int[][] linesAtNewPoint = mLines[newPoint];
    for (int k = 0; k < used.length; ++k) {
      if (used[k] && k != newPoint) {
        final int[] vec = linesAtNewPoint[k];
        final int dx = vec[2];
        final int dy = vec[3];
        int qx = vec[0] + dx;
        int qy = vec[1] + dy;
        while (qx >= 0 && qy >= 0 && qx < mN && qy < mNSquared) {
          if (blocked[qy + qx] == 0) {
            blocked[qy + qx] = newPoint + 1;
            ++cnt;
          }
          qx += dx;
          qy += dy;
        }
        qx = vec[0] - dx;
        qy = vec[1] - dy;
        while (qx >= 0 && qy >= 0 && qx < mN && qy < mNSquared) {
          if (blocked[qy + qx] == 0) {
            blocked[qy + qx] = newPoint + 1;
            ++cnt;
          }
          qx -= dx;
          qy -= dy;
        }
      }
    }
    return cnt;
  }

  private void clearBlocks(final int[] blocked, final int value) {
    for (int k = 0; k < blocked.length; ++k) {
      if (blocked[k] == value) {
        blocked[k] = 0;
      }
    }
  }

  private long count(final int pointsPosition, final boolean[] used, final int placedSoFar, final int[] blocked, final int unblockedPoints) {
    if (placedSoFar == 2 * mN) {
      return 1;
    }
    if (unblockedPoints < 2 * mN - placedSoFar) {
      return 0;
    }

    long c = 0;

    // Find highest-priority unused, the above checks guarantee that such
    // a point will exist
    for (int pp = pointsPosition - 1; pp >= 0; --pp) {
      if (blocked[pp] == 0) {
        final int rowNumber = mN - pp / mN - 1;
        if (placedSoFar < 2 * rowNumber) {
          // Need exactly 2 per row
          return c;
        }
        if (isValid(used, pp)) {
          // We can place this point, do so
          used[pp] = true;
          final int numBlocks = setBlocks(blocked, used, pp);
          c += count(pp, used, placedSoFar + 1, blocked, unblockedPoints - numBlocks);
          clearBlocks(blocked, pp + 1);
          used[pp] = false;
        }
      }
    }
    return c;
  }


  @Override
  public Z next() {
    ++mN;
    mNSquared = mN * mN;
    initLines();
    final boolean[] used = new boolean[mNSquared];
    final int[] blocked = new int[mNSquared];
    return Z.valueOf(count(mNSquared, used, 0, blocked, mNSquared));
  }
}
