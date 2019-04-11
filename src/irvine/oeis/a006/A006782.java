package irvine.oeis.a006;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A006782 Number of polygons of length <code>4n</code> on L-lattice.
 * @author Sean A. Irvine
 */
public class A006782 implements Sequence {

  // L-lattice is infinite plane like this
  //
  // |   ^   |   ^   |
  // V   |   V   |   V
  // .-->.<--.-->.<--.
  // ^   |   ^   |   ^
  // |   V   |   V   |
  // .<--.-->.<--.-->.


  private int mN = 0;
  private long mCount = 0;
  private final HashSet<Point> mUsed = new HashSet<>();

  private void search(final int x, final int y, final int remaining) {
    if (remaining == 0) {
      if (x == 0 && y == 0) {
        ++mCount;
      }
      return;
    }
    if (y < 0 || (y == 0 && x < 0)) {
      // Origin is not leftmost topmost
      return;
    }
    if (x + y > remaining) {
      // Cannot possibly make it back to origin in remaining moves (A*)
      return;
    }
    final Point p = new Point(x, y);
    if (mUsed.add(p)) {
      if (((x + y) & 1) == 0) {
        search(x, y + 1, remaining - 1);
        search(x, y - 1, remaining - 1);
      } else {
        search(x + 1, y, remaining - 1);
        search(x - 1, y, remaining - 1);
      }
      mUsed.remove(p);
    }
  }

  @Override
  public Z next() {
    mN += 4;
    mCount = 0;
    mUsed.add(new Point(0, 0));
    search(0, 1, mN - 1);
    return Z.valueOf(mCount);
  }
}
