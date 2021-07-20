package irvine.oeis.a072;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A072149 Coordination sequence for AlPO_4-11 structure with respect to node (X) where decagon and two hexagons meet.
 * @author Sean A. Irvine
 */
public class A072149 implements Sequence {

  // This is quite tricky. It is based on counting path length in an infinite
  // graph based loosely on the decagon.  We implement it by growing the "graph"
  // as a series of points.  Points are represented as
  // (a * sin72 + b * cos54, c * cos0 + d * cos72 + e * sin54)
  // where a, b, c, d, and e are integers. This means we do not need floating-point
  // arithemetic and don't have to worry about numerical accuracy.
  //
  // The decagon has points labelled like this
  //
  //                        0
  //                     9     1
  //                   8         2
  //                   7         3
  //                     6     4
  //                        5
  //
  // thus new points can be generated from the existing by knowing its type and
  // position.  For details on the graph see the OEIS entry.
  //
  // It would be possible to optimize this code by using vertical symmetry.
  // a(n) = b(n-1) + b(n) where b(n) is points with y>=0 (assuming origin is (0,0).

  private static class Point {

    final int mLabel;

    // Counts for horizontal displacements
    final int mSin72;
    final int mCos54;

    // Counts for vertical displacements
    final int mCos0;
    final int mCos72;
    final int mSin54;

    Point(final int label, final int sin72, final int cos54, final int cos0, final int cos72, final int sin54) {
      mLabel = label;
      mSin72 = sin72;
      mCos54 = cos54;
      mCos0 = cos0;
      mCos72 = cos72;
      mSin54 = sin54;
    }

    @Override
    public boolean equals(final Object that) {
      if (!(that instanceof Point)) {
        return false;
      }
      final Point p = (Point) that;
      return mSin72 == p.mSin72 && mCos54 == p.mCos54
        && mCos0 == p.mCos0 && mCos72 == p.mCos72 && mSin54 == p.mSin54
        && mLabel == p.mLabel;
    }

    @Override
    public int hashCode() {
      return mSin72 ^ mCos54 ^ mCos0 ^ mCos72 ^ mSin54;
    }
  }

  private final HashSet<Point> mGraph = new HashSet<>();
  private HashSet<Point> mCurrent = new HashSet<>();

  // These are just place holders
  private static final int SIN72 = 10;
  private static final int COS72 = 11;
  private static final int SIN54 = 12;
  private static final int COS54 = 13;

  // These tables give the shifts from current position for each point label
  // in the labelling above and the next corresponding point label
  private static final int[][] DELTA_X = {
    {0, SIN72, -SIN72},
    {-SIN72, SIN72, COS54},
    {-COS54, 0, SIN72},
    {0, -COS54, SIN72},
    {COS54, -SIN72, SIN72},
    {0, SIN72, -SIN72},
    {SIN72, -SIN72, -COS54},
    {COS54, 0, -SIN72},
    {0, COS54, -SIN72},
    {-COS54, SIN72, -SIN72},
  };

  private static final int[][] DELTA_Y = {
    {-1, COS72, COS72},
    {-COS72, -COS72, SIN54},
    {-SIN54, 1, -COS72},
    {-1, SIN54, COS72},
    {-SIN54, COS72, COS72},
    {1, -COS72, -COS72},
    {COS72, COS72, -SIN54},
    {SIN54, -1, COS72},
    {1, -SIN54, -COS72},
    {SIN54, -COS72, -COS72},
  };

  private static final int[][] NEW_LABEL = {
    {5, 1, 9},
    {0, 7, 2},
    {1, 3, 6},
    {2, 4, 9},
    {3, 5, 8},
    {0, 4, 6},
    {5, 2, 7},
    {6, 8, 1},
    {7, 9, 4},
    {8, 0, 3},
  };

  // Precomputed shifts into a, b, c, d, e label integers as described above
  private static final int[][] DELTA_SIN72;
  private static final int[][] DELTA_COS54;
  private static final int[][] DELTA_COS0;
  private static final int[][] DELTA_COS72;
  private static final int[][] DELTA_SIN54;

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
    DELTA_SIN72 = new int[DELTA_X.length][3];
    init(DELTA_X, DELTA_SIN72, SIN72);
    DELTA_COS54 = new int[DELTA_X.length][3];
    init(DELTA_X, DELTA_COS54, COS54);
    DELTA_COS0 = new int[DELTA_Y.length][3];
    init(DELTA_Y, DELTA_COS0, 1);
    DELTA_COS72 = new int[DELTA_Y.length][3];
    init(DELTA_Y, DELTA_COS72, COS72);
    DELTA_SIN54 = new int[DELTA_Y.length][3];
    init(DELTA_Y, DELTA_SIN54, SIN54);
  }

  private long expand() {
    // Grow the graph by making sure it contains all distance mN nodes
    mGraph.addAll(mCurrent);
    //    System.out.println("mGraph=" + mGraph.size() + " " + mCurrent.size());
    final HashSet<Point> newPoints = new HashSet<>();
    for (final Point p : mCurrent) {
      // For each possible node to expand, there are 3 potential new points.
      // The position of these points depends on which node it is in the
      // fundamental decagon. Create the new points and if they are not
      // already in the graph, then add them at the specified distance.
      for (int k = 0; k < 3; ++k) {
        final Point pt = new Point(NEW_LABEL[p.mLabel][k],
                                   p.mSin72 + DELTA_SIN72[p.mLabel][k],
                                   p.mCos54 + DELTA_COS54[p.mLabel][k],
                                   p.mCos0 + DELTA_COS0[p.mLabel][k],
                                   p.mCos72 + DELTA_COS72[p.mLabel][k],
                                   p.mSin54 + DELTA_SIN54[p.mLabel][k]);
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
      mCurrent.add(new Point(0, 0, 0, 0, 0, 0));
      return Z.ONE;
    } else {
      return Z.valueOf(expand());
    }
  }
}
