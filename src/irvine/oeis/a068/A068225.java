package irvine.oeis.a068;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A068225 Neighbor in 1-2 direction of numbers arranged as clockwise spiral.
 * @author Sean A. Irvine
 */
public class A068225 extends Sequence1 {

  private static final int[] DELTA_X = {1, 0, -1, 0};
  private static final int[] DELTA_Y = {0, 1, 0, -1};
  private long mM = 1;
  private int mX = 0;
  private int mY = 0;
  private int mZ = 1;
  private int mD = 0;
  private int mE = 0;
  private final Map<Point, Long> mSpiral = new HashMap<>();
  private int mR = 0;
  private int mS = 0;
  private int mT = 1;
  private int mU = 0;
  private int mW = 0;
  private final int mOffsetX;
  private final int mOffsetY;

  protected A068225(final int offsetX, final int offsetY) {
    mOffsetX = offsetX;
    mOffsetY = offsetY;
  }

  /** Construct the sequence. */
  public A068225() {
    this(1, 0);
  }

  @Override
  public Z next() {
    final Point wanted = new Point(mR + mOffsetX, mS + mOffsetY);
    while (!mSpiral.containsKey(wanted)) {
      mSpiral.put(new Point(mX, mY), mM);
      ++mM;
      if (--mZ < 0) {
        if (++mD == DELTA_X.length) {
          mD = 0;
        }
        if (DELTA_X[mD] != 0) {
          ++mE;
        }
        mZ = mE;
      }
      mX += DELTA_X[mD];
      mY += DELTA_Y[mD];
    }
    if (--mT < 0) {
      if (++mU == DELTA_X.length) {
        mU = 0;
      }
      if (DELTA_X[mU] != 0) {
        ++mW;
      }
      mT = mW;
    }
    mR += DELTA_X[mU];
    mS += DELTA_Y[mU];
    return Z.valueOf(mSpiral.remove(wanted));
  }
}
