package irvine.oeis.a006;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A006774.
 * @author Sean A. Irvine
 */
public class A006774 implements Sequence {

  private int mN = 4;

  private final HashSet<Point> mVisited = new HashSet<>();

  {
    mVisited.add(new Point(0, 0));
    mVisited.add(new Point(1, 0));
  }

  private Z b(final int n, final int x, final int y) {
    final Point v = new Point(x, y);
    if (n == 0) {
      return x == 0 && y == 0 ? Z.ONE : Z.ZERO;
    } else if (y < 0 || (y == 0 && x > 0)) { // Make sure our start point is least possible
      return Z.ZERO;
    } else if (mVisited.contains(v)) {
      return Z.ZERO;
    } else {
      mVisited.add(v);
      final Z c = b(n - 1, x + 1, y).add(b(n - 1, x - 1, y)).add(b(n - 1, x, y - 1 + 2 * ((x + y) & 1)));
      mVisited.remove(v);
      return c;
    }
  }

  @Override
  public Z next() {
    mN += 2;
    return b(mN - 2, 1, 1);
  }
}
