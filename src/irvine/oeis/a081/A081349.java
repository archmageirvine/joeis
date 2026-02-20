package irvine.oeis.a081;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Point;

/**
 * A081349 Square maze arrangement of the natural numbers, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A081349 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private int mX = 0;
  private int mY = 3;
  private long mV = 4;
  private int mD = 0;
  private final HashMap<Point, Long> mMaze = new HashMap<>();

  {
    mMaze.put(new Point(0, 0), 1L);
    mMaze.put(new Point(0, 1), 2L);
    mMaze.put(new Point(0, 2), 3L);
    mMaze.put(new Point(0, 3), 4L);
  }

  private long t(final int n, final int m) {
    final Point pt = new Point(n, m);
    while (!mMaze.containsKey(pt)) {
      switch (mD) {
        case 0:
          mX += 1;
          if (!mMaze.containsKey(new Point(mX, mY - 1))) {
            mD = 1;
          }
          break;
        case 1:
          mY -= 1;
          if (mY == 0) {
            mD = 2;
          }
          break;
        case 2:
          mX += 1;
          mD = 3;
          break;
        case 3:
          mY += 1;
          if (!mMaze.containsKey(new Point(mX - 1, mY))) {
            mD = 4;
          }
          break;
        case 4:
          mX -= 1;
          if (mX == 0) {
            mD = 5;
          }
          break;
        case 5:
          mY += 1;
          mD = 0;
          break;
        default:
          throw new RuntimeException();
      }
      mMaze.put(new Point(mX, mY), ++mV);
    }
    return mMaze.get(pt);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mM, mN - mM));
  }
}

