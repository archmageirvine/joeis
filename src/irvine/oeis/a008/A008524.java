package irvine.oeis.a008;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008524 Coordination sequence for 4-dimensional lonsdaleite (or wurtzite).
 * @author Sean A. Irvine
 */
public class A008524 extends Sequence0 {

  private static final class Vertex {
    private final int[] mCoordinates;
    private final int mBasis;
    private final int mHash;

    private Vertex(final int[] coordinates, final int basis) {
      mCoordinates = coordinates;
      mBasis = basis;
      mHash = 31 * Arrays.hashCode(coordinates) + basis;
    }

    @Override
    public int hashCode() {
      return mHash;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Vertex)) {
        return false;
      }
      final Vertex other = (Vertex) obj;
      return mBasis == other.mBasis  && Arrays.equals(mCoordinates, other.mCoordinates);
    }
  }

  private final int mN;
  private final Set<Vertex> mVisited = new HashSet<>();
  private Set<Vertex> mFrontier = new HashSet<>();

  protected A008524(final int n) {
    mN = n;
    final Vertex origin = new Vertex(new int[n], 0);
    mVisited.add(origin);
    mFrontier.add(origin);
  }

  /** Construct the sequence. */
  public A008524() {
    this(4);
  }

  private Vertex neighbour(final Vertex v, final int k) {
    final int[] c = v.mCoordinates.clone();
    final int basis;
    switch (v.mBasis) {
      case 0:
        if (k == mN) {
          basis = 2;
        } else {
          for (int j = 0; j < mN - 1; ++j) {
            ++c[j];
          }
          if (k < mN - 1) {
            --c[k];
          }
          basis = 1;
        }
        break;

      case 1:
        if (k == mN) {
          basis = 3;
        } else {
          for (int j = 0; j < mN - 1; ++j) {
            --c[j];
          }
          if (k < mN - 1) {
            ++c[k];
          }
          basis = 0;
        }
        break;

      case 2:
        if (k == 0) {
          basis = 0;
        } else {
          for (int j = 0; j < mN - 1; ++j) {
            ++c[j];
          }
          if (k <= mN - 1) {
            --c[k - 1];
          }
          ++c[mN - 1];
          basis = 3;
        }
        break;

      default:
        if (k == 0) {
          basis = 1;
        } else {
          for (int j = 0; j < mN - 1; ++j) {
            --c[j];
          }
          if (k <= mN - 1) {
            ++c[k - 1];
          }
          --c[mN - 1];
          basis = 2;
        }
        break;
    }

    return new Vertex(c, basis);
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mFrontier.size());
    final Set<Vertex> next = new HashSet<>();

    for (final Vertex v : mFrontier) {
      for (int k = 0; k <= mN; ++k) {
        final Vertex w = neighbour(v, k);
        if (mVisited.add(w)) {
          next.add(w);
        }
      }
    }

    mFrontier = next;
    return result;
  }
}
