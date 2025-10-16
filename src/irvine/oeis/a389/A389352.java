package irvine.oeis.a389;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A389532 allocated for Gus Wiseman.
 * @author Sean A. Irvine
 */
public class A389352 extends Sequence1 {

  private int mArch = 0;
  private int mSign = 1;
  private final LinkedList<Point> mPoints = new LinkedList<>();
  {
    mPoints.add(new Point(0, 0));
  }

  protected Z select(final Point pt) {
    return Z.valueOf(Math.abs(pt.left()) + pt.right());
  }

  @Override
  public Z next() {
    if (mPoints.isEmpty()) {
      ++mArch;
      for (int y = 0; y <= mArch; ++y) {
        mPoints.add(new Point(mSign * mArch, y));
      }
      for (int x = mArch - 1; x >= -mArch; --x) {
        mPoints.add(new Point(mSign * x, mArch));
      }
      mSign = -mSign;
      for (int y = mArch - 1; y >= 0; --y) {
        mPoints.add(new Point(mSign * mArch, y));
      }
    }
    return select(mPoints.poll());
  }
}
