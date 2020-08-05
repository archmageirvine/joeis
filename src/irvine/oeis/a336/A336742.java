package irvine.oeis.a336;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A336742 Number of self-avoiding cycles of length <code>2n</code> on the half-Manhattan lattice.
 * @author Sean A. Irvine
 */
public class A336742 implements Sequence {

  private int mN = -2;
  private long mCount = 0;
  private final HashSet<Point> mUsed = new HashSet<>();

  private int d(final int z) {
    return 1 - ((z & 1) << 1);
  }

  private void search(final int x, final int y, final int remaining) {
    if (remaining == 0) {
      if (x == 0 && y == 0) {
        ++mCount;
      }
      return;
    }
    if (y > 0 || (y == 0 && x < 0)) {
      // Origin is not leftmost topmost
      return;
    }
    if (Math.abs(x) + Math.abs(y) > remaining) {
      // Cannot possibly make it back to origin in remaining moves (A*)
      return;
    }
    final Point p = new Point(x, y);
    if (mUsed.add(p)) {
      search(x + d(y), y, remaining - 1);
      search(x, y - 1, remaining - 1);
      search(x, y + 1, remaining - 1);
      mUsed.remove(p);
    }
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    mCount = 0;
    mUsed.add(new Point(0, 0));
    search(0, 1, mN - 1);
    mCount *= 2; // for (0, -1)
    search(1, 0, mN - 1);
    return Z.valueOf(mCount);
  }
}
