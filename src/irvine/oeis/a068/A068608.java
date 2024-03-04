package irvine.oeis.a068;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Point;

/**
 * A068608 Path of a knight's tour on an infinite chessboard.
 * @author Sean A. Irvine
 */
public class A068608 extends Sequence0 {

  // After Hugo Pfoertner

  private static final int[] DELTA_X = {1, 0, -1, 0};
  private static final int[] DELTA_Y = {0, 1, 0, -1};
  private static final int[] KNIGHT_DELTA_Y = {2, 1, -1, -2, -2, -1, 1, 2};
  private static final int[] KNIGHT_DELTA_X = {1, 2, 2, 1, -1, -2, -2, -1};
  private final int mJ;
  private final int mRotation;
  private Point mPoint = null;

  private long mM = 1;
  private int mX = 0;
  private int mY = 0;
  private int mZ = 1;
  private int mD = 0;
  private int mE = 0;
  private final Map<Point, Long> mSpiral = new HashMap<>();
  private final Set<Point> mUsed = new HashSet<>();
  private int mN = 1;

  protected A068608(final int j) {
    mJ = j;
    mRotation = (j & 1) == 1 ? 1 : -1;
  }

  /** Construct the sequence. */
  public A068608() {
    this(2);
  }

  private double angle(final Point v, final Point w) {
    return mRotation * Math.atan2(v.left() * w.right() - v.right() * w.left(), v.left() * w.left() + v.right() * w.right());
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

  private boolean inRing(final int n, final Point p) {
    return !(Math.abs(p.left()) < n && Math.abs(p.right()) < n) && Math.abs(p.left()) <= n + 1 && Math.abs(p.right()) <= n + 1;
  }

  @Override
  public Z next() {
    if (mPoint == null) {
      mPoint = new Point(0, 0);
      mUsed.add(mPoint);
      return Z.valueOf(findPos(mPoint));
    } else if (mUsed.size() == 1) {
      mPoint = new Point(mPoint.left() + KNIGHT_DELTA_X[mJ], mPoint.right() + KNIGHT_DELTA_Y[mJ]);
      mUsed.add(mPoint);
      return Z.valueOf(findPos(mPoint));
    } else {
      while (true) {
        double angmin = -2 * Math.PI; // floating-point ok here, there is only 8 angles
        int jmin = 0;
        boolean ok = false;
        for (int j = 0; j < KNIGHT_DELTA_X.length; ++j) {
          final Point pTry = new Point(mPoint.left() + KNIGHT_DELTA_X[j], mPoint.right() + KNIGHT_DELTA_Y[j]);
          if (inRing(mN, pTry) && !mUsed.contains(pTry)) {
            ok = true;
            final double adiff = angle(mPoint, pTry);
            if (adiff <= 0 && adiff > angmin) {
              jmin = j;
              angmin = adiff;
            }
          }
        }
        if (ok) {
          mPoint = new Point(mPoint.left() + KNIGHT_DELTA_X[jmin], mPoint.right() + KNIGHT_DELTA_Y[jmin]);
          mUsed.add(mPoint);
          return Z.valueOf(findPos(mPoint));
        }
        mN += 2;
      }
    }
  }
}
