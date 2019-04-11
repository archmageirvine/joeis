package irvine.oeis.a072;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A072154 Coordination sequence for the planar net <code>4.6.12</code>.
 * @author Sean A. Irvine
 */
public class A072154 implements Sequence {

  // Numbering:
  //
  //             6  0
  //          7        1
  //        8            2
  //        9            3
  //          10       4
  //            11  5


  private static class Point {

    final int mLabel;

    // Counts for horizontal displacements
    final int mCos60;
    final int mCos30;
    final int mCos0;

    // Counts for vertical displacements
    final int mSin60;
    final int mSin30;
    final int mSin90;

    Point(final int label, final int cos60, final int cos30, final int cos0, final int sin60, final int sin30, final int sin90) {
      mLabel = label;
      mCos60 = cos60;
      mCos30 = cos30;
      mCos0 = cos0;
      mSin60 = sin60;
      mSin30 = sin30;
      mSin90 = sin90;
    }

    @Override
    public boolean equals(final Object that) {
      if (!(that instanceof Point)) {
        return false;
      }
      final Point p = (Point) that;
      return mSin60 == p.mSin60 && mCos30 == p.mCos30 && mSin90 == p.mSin90
        && mCos0 == p.mCos0 && mCos60 == p.mCos60 && mSin30 == p.mSin30
        && mLabel == p.mLabel;
    }

    @Override
    public int hashCode() {
      return mSin60 ^ mCos30 ^ mCos0 ^ mCos60 ^ mSin30 ^ mSin90;
    }
  }

  private final HashSet<Point> mGraph = new HashSet<>();
  private HashSet<Point> mCurrent = new HashSet<>();

  // All edges are 1 unit long

  // These are just place holders
  private static final int COS60 = 10;
  private static final int SIN60 = 11;
  private static final int SIN30 = 12;
  private static final int COS30 = 13;

  // These tables give the shifts from current position for each point label
  // in the labelling above and the next corresponding point label
  private static final int[][] DELTA_X = {
    {-1, COS60, COS30},
    {-COS60, COS30, COS30},
    {-COS30, 0, 1},
    {0, -COS30, 1},
    {COS30, -COS60, COS30},
    {COS60, -1, COS30},
    {1, -COS60, -COS30},
    {COS60, -COS30, -COS30},
    {COS30, 0, -1},
    {0, COS30, -1},
    {-COS30, COS60, -COS30},
    {-COS60, 1, -COS30},
  };

  private static final int[][] DELTA_Y = {
    {0, SIN60, -SIN30},
    {-SIN60, SIN30, -SIN30},
    {-SIN30, 1, 0},
    {-1, SIN30, 0},
    {-SIN30, SIN60, SIN30},
    {-SIN60, 0, SIN30},
    {0, SIN60, -SIN30},
    {-SIN60, SIN30, -SIN30},
    {-SIN30, 1, 0},
    {-1, SIN30, 0},
    {-SIN30, SIN60, SIN30},
    {-SIN60, 0, SIN30},
  };

  private static final int[][] NEW_LABEL = {
    {6, 1, 10},
    {0, 2, 11},
    {1, 3, 8},
    {2, 4, 9},
    {3, 5, 6},
    {4, 11, 7},
    {0, 7, 4},
    {6, 8, 5},
    {7, 9, 2},
    {8, 10, 3},
    {9, 11, 0},
    {10, 5, 1},
  };

  // Precomputed shifts into a, b, c, d, e label integers as described above
  private static final int[][] DELTA_COS60;
  private static final int[][] DELTA_COS30;
  private static final int[][] DELTA_COS0;
  private static final int[][] DELTA_SIN60;
  private static final int[][] DELTA_SIN30;
  private static final int[][] DELTA_SIN90;

  private static void init(final int[][] source, final int[][] target, final int value) {
    for (int k = 0; k < source.length; ++k) {
      for (int j = 0; j < 3; ++j) {
        if (source[k][j] == value) {
          target[k][j] = 1;
        } else if (source[k][j] == -value) {
          target[k][j] = -1;
        }
      }
    }
  }

  static {
    DELTA_COS60 = new int[DELTA_X.length][3];
    init(DELTA_X, DELTA_COS60, COS60);
    DELTA_COS30 = new int[DELTA_X.length][3];
    init(DELTA_X, DELTA_COS30, COS30);
    DELTA_COS0 = new int[DELTA_X.length][3];
    init(DELTA_X, DELTA_COS0, 1);
    DELTA_SIN60 = new int[DELTA_Y.length][3];
    init(DELTA_Y, DELTA_SIN60, SIN60);
    DELTA_SIN30 = new int[DELTA_Y.length][3];
    init(DELTA_Y, DELTA_SIN30, SIN30);
    DELTA_SIN90 = new int[DELTA_Y.length][3];
    init(DELTA_Y, DELTA_SIN90, 1);
  }

  private long expand() {
    // Grow the graph by making sure it contains all distance mN nodes
    mGraph.addAll(mCurrent);
    final HashSet<Point> newPoints = new HashSet<>();
    for (final Point p : mCurrent) {
      // For each possible node to expand, there are 3 potential new points.
      // The position of these points depends on which node it is in the
      // fundamental decagon. Create the new points and if they are not
      // already in the graph, then add them at the specified distance.
      for (int k = 0; k < 3; ++k) {
        final Point pt = new Point(NEW_LABEL[p.mLabel][k],
                                   p.mCos60 + DELTA_COS60[p.mLabel][k],
                                   p.mCos30 + DELTA_COS30[p.mLabel][k],
                                   p.mCos0 + DELTA_COS0[p.mLabel][k],
                                   p.mSin60 + DELTA_SIN60[p.mLabel][k],
                                   p.mSin30 + DELTA_SIN30[p.mLabel][k],
                                   p.mSin90 + DELTA_SIN90[p.mLabel][k]);
        if (!mGraph.contains(pt)) {
          newPoints.add(pt);
        }
      }
    }
    mCurrent = newPoints;
    return newPoints.size();
  }

  @Override
  public Z next() {
    if (mCurrent.isEmpty()) {
      mCurrent.add(new Point(0, 0, 0, 0, 0, 0, 0));
      return Z.ONE;
    } else {
      return Z.valueOf(expand());
    }
  }
}
