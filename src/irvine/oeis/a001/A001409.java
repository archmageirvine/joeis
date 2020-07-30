package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001409 Number of 2n-step polygons on cubic lattice.
 * @author Sean A. Irvine
 */
public class A001409 implements Sequence {

  // Walks in cubic lattice between origin and a selected target

  // The following implementation uses minimal memory.  Just a grid to keep tracks of points
  // included in the current path.  It researches for each new distance "n" rather than
  // expanding for previous existing paths.  8-bits are used for each coordinate, this
  // allows +/- 127 in each dimension, more than adequate for what can be exhaustively
  // enumerated.
  private final boolean[] mUsed = new boolean[1 << 24];
  private long mCount = 0;
  protected int mN = first() - 2;

  protected int first() {
    return 0;
  }

  protected int coord(final int x, final int y, final int z) {
    return ((z & 0xFF) << 16) + ((y & 0xFF) << 8) + (x & 0xFF);
  }

  protected void use(final int x, final int y, final int z) {
    mUsed[coord(x, y, z)] = true;
  }

  protected void clear(final int x, final int y, final int z) {
    mUsed[coord(x, y, z)] = false;
  }

  private void search(final int x, final int y, final int z, final int stepsRemaining, final int m, final boolean offX, final boolean offXY) {
    if (stepsRemaining <= 0) {
      if (stepsRemaining == 0 && x == 0 && y == 0 && z == 0) {
        mCount += m;
      }
    } else if (0 != x || 0 != y || 0 != z) {
      // Check that it is possible to reach the target within the remaining numbers of moves
      final int dx = Math.abs(x);
      final int dy = Math.abs(y);
      final int dz = Math.abs(z);
      final int d = dx + dy + dz;
      if (d <= stepsRemaining) {
        final int coord = coord(x, y, z);
        if (!mUsed[coord]) {
          mUsed[coord] = true;
          search(x + 1, y, z, stepsRemaining - 1, m, offX, offXY);
          search(x - 1, y, z, stepsRemaining - 1, m, offX, offXY);
          search(x, y + 1, z, stepsRemaining - 1, offX ? m : 4 * m, true, offXY);
          if (offX) {
            search(x, y - 1, z, stepsRemaining - 1, m, true, offXY);
            search(x, y, z + 1, stepsRemaining - 1, offXY ? m : 2 * m, true, true);
            if (offXY) {
              search(x, y, z - 1, stepsRemaining - 1, m, true, true);
            }
          }
          mUsed[coord] = false;
        }
      }
    }
  }

  protected long search(final int x, final int y, final int z, final int stepsRemaining, final int m) {
    mCount = 0;
    if (stepsRemaining > 2) {
      search(x, y, z, stepsRemaining, m, false, false);
    }
    return mCount;
  }

  protected long search() {
    return search(1, 0, 0, mN - 1, 3);
  }

  @Override
  public Z next() {
    mN += 2;
    return mN == 0 ? Z.ONE : Z.valueOf(search()).divide(mN);
  }

}
