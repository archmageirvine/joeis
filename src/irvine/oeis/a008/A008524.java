package irvine.oeis.a008;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008524 Coordination sequence for 4-dimensional lonsdaleite (or wurtzite).
 * @author Sean A. Irvine
 */
public class A008524 extends Sequence0 {

  /*
   * A vertex is represented by:
   *   (t, x, y, z, basis)
   *
   * The first four entries are integer unit-cell coordinates.
   * The final entry identifies one of the four basis positions.
   *
   * The five neighbours are given by integer translations of
   * the appropriate basis positions.
   */

  private static final int[][] TARGET = {
    {1, 1, 1, 1, 2},
    {0, 0, 0, 0, 3},
    {0, 3, 3, 3, 3},
    {1, 2, 2, 2, 2}
  };

  private static final int[][][] DELTA = {
    {
      {0, 1, 1, 0},
      {1, 0, 1, 0},
      {1, 1, 0, 0},
      {1, 1, 1, 0},
      {0, 0, 0, 0}
    },
    {
      {-1, -1, -1, 0},
      {-1, -1, 0, 0},
      {-1, 0, -1, 0},
      {0, -1, -1, 0},
      {0, 0, 0, 0}
    },
    {
      {0, 0, 0, 0},
      {0, 1, 1, 1},
      {1, 0, 1, 1},
      {1, 1, 0, 1},
      {1, 1, 1, 1}
    },
    {
      {0, 0, 0, 0},
      {-1, -1, -1, -1},
      {-1, -1, 0, -1},
      {-1, 0, -1, -1},
      {0, -1, -1, -1}
    }
  };

  private static final class Vertex {
    private final int mT;
    private final int mX;
    private final int mY;
    private final int mZ;
    private final int mBasis;

    private Vertex(final int t, final int x, final int y, final int z, final int basis) {
      mT = t;
      mX = x;
      mY = y;
      mZ = z;
      mBasis = basis;
    }

    @Override
    public int hashCode() {
      int h = mT;
      h = 31 * h + mX;
      h = 31 * h + mY;
      h = 31 * h + mZ;
      return 31 * h + mBasis;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Vertex)) {
        return false;
      }
      final Vertex other = (Vertex) obj;
      return mT == other.mT
        && mX == other.mX
        && mY == other.mY
        && mZ == other.mZ
        && mBasis == other.mBasis;
    }
  }

  private final Set<Vertex> mVisited = new HashSet<>();
  private Set<Vertex> mFrontier = new HashSet<>();

  /**
   * Construct the sequence.
   */
  public A008524() {
    final Vertex origin = new Vertex(0, 0, 0, 0, 0);
    mVisited.add(origin);
    mFrontier.add(origin);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mFrontier.size());
    final Set<Vertex> next = new HashSet<>();
    for (final Vertex v : mFrontier) {
      final int basis = v.mBasis;
      for (int k = 0; k < 5; ++k) {
        final int[] d = DELTA[basis][k];
        final Vertex w = new Vertex(
          v.mT + d[0],
          v.mX + d[1],
          v.mY + d[2],
          v.mZ + d[3],
          TARGET[basis][k]
        );
        if (mVisited.add(w)) {
          next.add(w);
        }
      }
    }
    mFrontier = next;
    return result;
  }
}
