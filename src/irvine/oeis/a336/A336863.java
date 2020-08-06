package irvine.oeis.a336;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A336863.
 * @author Sean A. Irvine
 */
public class A336863 implements Sequence {

  private int mN = -2;
  private long mCount = 0;

  protected final HashSet<Point> mVisited = new HashSet<>();

  {
    mVisited.add(new Point(0, 0));
    mVisited.add(new Point(1, 0));
  }

  private void search(final int n, final int x, final int y) {
    if (n == 1) {
      // Check if we are next to the origin
      if (y == 0 && (x == 1 || x == -1)) {
        ++mCount;
      } else if (x == 0 && y + 2 * ((x + y) & 1) == 1) {
        ++mCount;
      }
      return;
    }
    if (Math.abs(x) + Math.abs(y) > n) {
      return; // Can never make it back in remaining steps
    }
    final Point v = new Point(x, y);
    if (!mVisited.contains(v)) {
      mVisited.add(v);
      search(n - 1, x + 1, y);
      search(n - 1, x - 1, y);
      search(n - 1, x, y - 1 + 2 * ((x + y) & 1));
      mVisited.remove(v);
    }
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    } else if (mN == 2) {
      // We don't allow polygons with no area, but if we were counting cycles
      // this number should be 1 (i.e., go to a vertex, then return to origin).
      return Z.ZERO;
    }
    mCount = 0;
    search(mN - 4, 1, 1);
    return Z.valueOf(mCount);
  }
}
