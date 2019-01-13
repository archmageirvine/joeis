package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

import java.util.HashSet;

/**
 * A001668.
 * @author Alois P. Heinz
 * @author Sean A. Irvine
 */
public class A001668 implements Sequence {

  private int mN = -1;

  private final HashSet<Point> mVisited = new HashSet<>();

  {
    mVisited.add(new Point(0, 0));
    mVisited.add(new Point(1, 0));
  }

  private Z b(final int n, final int x, final int y) {
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
  }

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.valueOf(1 + 2 * mN);
    }
    return b(mN - 2, 1, 1).multiply(6);
  }
}
