package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003288 Number of n-step self-avoiding walks on f.c.c. lattice from (0, 0, 0) to (0, 0, 2).
 * @author Sean A. Irvine
 */
public class A003288 extends AbstractSequence {

  /** Construct the sequence. */
  public A003288() {
    super(2);
  }

  // Walks in hexagonal fcc lattice between origin and a selected target

  // The following implementation uses minimal memory.  Just a grid to keep tracks of points
  // included in the current path.  It researches for each new distance "n" rather than
  // expanding for previous existing paths.  8-bits are used for each coordinate, this
  // allows +/- 127 in each dimension, more than adequate for what can be exhaustively
  // enumerated.
  private final boolean[] mUsed = new boolean[1 << 24];
  private long mCount = 0;
  protected int mN = first() - 1;

  protected int first() {
    return 2;
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

  private void search(final int x, final int y, final int z, final int tx, final int ty, final int tz, final int stepsRemaining) {
    if (stepsRemaining <= 0) {
      if (stepsRemaining == 0 && x == tx && y == ty && z == tz) {
        ++mCount;
      }
    } else if (tx != x || ty != y || tz != z) {
      // Check that it is possible to reach the target within the remaining numbers of moves
      final int dx = Math.abs(tx - x);
      final int dy = Math.abs(ty - y);
      final int dz = Math.abs(tz - z);
      final int d = Math.max(Math.max(dx, dy), dz);
      if (d <= stepsRemaining) {
        final int coord = coord(x, y, z);
        if (!mUsed[coord]) {
          mUsed[coord] = true;
          search(x + 1, y + 1, z, tx, ty, tz, stepsRemaining - 1);
          search(x + 1, y - 1, z, tx, ty, tz, stepsRemaining - 1);
          search(x - 1, y + 1, z, tx, ty, tz, stepsRemaining - 1);
          search(x - 1, y - 1, z, tx, ty, tz, stepsRemaining - 1);
          search(x + 1, y, z + 1, tx, ty, tz, stepsRemaining - 1);
          search(x + 1, y, z - 1, tx, ty, tz, stepsRemaining - 1);
          search(x - 1, y, z + 1, tx, ty, tz, stepsRemaining - 1);
          search(x - 1, y, z - 1, tx, ty, tz, stepsRemaining - 1);
          search(x, y + 1, z + 1, tx, ty, tz, stepsRemaining - 1);
          search(x, y + 1, z - 1, tx, ty, tz, stepsRemaining - 1);
          search(x, y - 1, z + 1, tx, ty, tz, stepsRemaining - 1);
          search(x, y - 1, z - 1, tx, ty, tz, stepsRemaining - 1);
          mUsed[coord] = false;
        }
      }
    }
  }

  protected long search(final int x, final int y, final int z, final int tx, final int ty, final int tz, final int stepsRemaining, final int m) {
    mCount = 0;
    if (stepsRemaining >= 0) {
      search(x, y, z, tx, ty, tz, stepsRemaining);
    }
    return mCount * m;
  }

  protected long search() {
    final int tx = 0;
    final int ty = 0;
    final int tz = 2;
    //return search(0, 0, 0, tx, ty, tz, mN, 1); // Basic search
    // Expanding first few links to exploit symmetries
    use(0, 0, 0);
    return search(1, 1, 0, tx, ty, tz, mN - 1, 4)
      + search(1, 0, 1, tx, ty, tz, mN - 1, 4)
      + search(1, 0, -1, tx, ty, tz, mN - 1, 4);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(search());
  }

}
