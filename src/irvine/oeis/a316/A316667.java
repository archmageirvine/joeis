package irvine.oeis.a316;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A316667 Squares visited by a knight moving on a spirally numbered board always to the lowest available unvisited square.
 * @author Sean A. Irvine
 */
public class A316667 extends Sequence1 {

  private static final int[] DELTA_X = {1, 0, -1, 0};
  private static final int[] DELTA_Y = {0, 1, 0, -1};
  private static final int[] KNIGHT_DELTA_X = {2, 1, -1, -2, -2, -1, 1, 2};
  private static final int[] KNIGHT_DELTA_Y = {1, 2, 2, 1, -1, -2, -2, -1};
  private final int mSpecialFirst;
  private Point mPoint = null;

  private long mM = 1;
  private int mX = 0;
  private int mY = 0;
  private int mZ = 1;
  private int mD = 0;
  private int mE = 0;
  private final Map<Point, Long> mSpiral = new HashMap<>();
  private final Set<Point> mUsed = new HashSet<>();
  private final int[] mMoveX;
  private final int[] mMoveY;

  protected A316667(final int[] moveX, final int[] moveY, final int specialFirst) {
    mMoveX = moveX;
    mMoveY = moveY;
    mSpecialFirst = specialFirst;
  }

  /** Construct the sequence. */
  public A316667() {
    this(KNIGHT_DELTA_X, KNIGHT_DELTA_Y, 7);
  }

  private long findPos(final Point wanted) {
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
    return mSpiral.get(wanted);
  }

  @Override
  public Z next() {
    if (mPoint == null) {
      mPoint = new Point(0, 0);
      mUsed.add(mPoint);
      return Z.valueOf(findPos(mPoint));
    } else if (mSpecialFirst >= 0 && mUsed.size() == 1) {
      mPoint = new Point(mPoint.left() + mMoveX[mSpecialFirst], mPoint.right() + mMoveY[mSpecialFirst]);
      mUsed.add(mPoint);
      return Z.valueOf(findPos(mPoint));
    } else {
      long bestPos = Long.MAX_VALUE;
      Point bestP = null;
      for (int k = 0; k < mMoveX.length; ++k) {
        final Point p = new Point(mPoint.left() + mMoveX[k], mPoint.right() + mMoveY[k]);
        if (!mUsed.contains(p)) {
          final long pos = findPos(p);
          if (pos < bestPos) {
            bestPos = pos;
            bestP = p;
          }
        }
      }
      if (bestP == null) {
        return null;
      }
      mUsed.add(bestP);
      mPoint = bestP;
      return Z.valueOf(bestPos);
    }
  }
}
