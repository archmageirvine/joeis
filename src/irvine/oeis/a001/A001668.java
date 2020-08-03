package irvine.oeis.a001;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A001668 Number of <code>self-avoiding n-step</code> walks on honeycomb lattice.
 * @author Alois P. Heinz
 * @author Sean A. Irvine
 */
public class A001668 implements Sequence {

  private int mN = -1;

  protected final HashSet<Point> mVisited = new HashSet<>();

  {
    mVisited.add(new Point(0, 0));
    mVisited.add(new Point(1, 0));
  }

  protected boolean check(final int x, final int y) {
    return true;
  }

  private Z b(final int n, final int x, final int y) {
    if (check(x, y)) {
      final Point v = new Point(x, y);
      if (mVisited.contains(v)) {
        return Z.ZERO;
      } else if (n == 0) {
        return Z.ONE;
      } else {
        mVisited.add(v);
        final Z c = b(n - 1, x + 1, y).add(b(n - 1, x - 1, y)).add(b(n - 1, x, y - 1 + 2 * ((x + y) & 1)));
        mVisited.remove(v);
        return c;
      }
    } else {
      return Z.ZERO;
    }
  }

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.valueOf(1 + 2 * mN);
    }
    return b(mN - 2, 1, 1).multiply(6);
  }
}
