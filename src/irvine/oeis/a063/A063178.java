package irvine.oeis.a063;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A063178 Hexagonal spiral sequence: sequence is written as a hexagonal spiral around a 'dummy' center, each entry is the sum of the row in the previous direction containing the previous entry.
 * @author Sean A. Irvine
 */
public class A063178 extends Sequence1 {

  private static final int[] DX = {2, 1, -1, -2, -1, 1};
  private static final int[] DY = {0, 1, 1, 0, -1, -1};
  private final HashMap<Point, Z> mA = new HashMap<>();
  private int mPrevDir = 0;
  protected int mDir = 5;
  private int mX = -1;
  private int mY = -1;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.put(new Point(0, 0), Z.ZERO); // "*" in van Lamoen picture
      mA.put(new Point(-1, -1), Z.ONE);
      return Z.ONE;
    }
    final int nextDir = (mDir + 1) % DX.length;
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
