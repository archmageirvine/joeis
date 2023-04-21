package irvine.oeis.a063;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A062410.
 * @author Sean A. Irvine
 */
public class A063177 extends Sequence1 {

  private static final int[] DX = {2, -1, -1};
  private static final int[] DY = {0, 1, -1};
  private final HashMap<Point, Z> mA = new HashMap<>();
  private int mPrevDir = 0;
  private int mDir = 2;
  private int mX = 0;
  private int mY = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.put(new Point(0, 0), Z.ONE);
      return Z.ONE;
    }
    final int nextDir = (mDir + 1) % 3;
    if (mA.get(new Point(mX + DX[nextDir], mY + DY[nextDir])) == null) {
      // Yes we need to change direction
      mPrevDir = mDir;
      mDir = nextDir;
    }
    // Compute sum along previous direction
    Z sum = Z.ZERO;
    int tx = mX;
    int ty = mY;
    Z v;
    while ((v = mA.get(new Point(tx, ty))) != null) {
      sum = sum.add(v);
      tx -= DX[mPrevDir];
      ty -= DY[mPrevDir];
    }
    // Update to new position and store result
    mX += DX[mDir];
    mY += DY[mDir];
    mA.put(new Point(mX, mY), sum);
    return sum;
  }
}
