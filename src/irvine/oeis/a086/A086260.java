package irvine.oeis.a086;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086260 Number of symmetric n X n conference matrices.
 *
 * <p>For n > 1 a normalized symmetric conference matrix is
 * equivalent to a conference graph on v=n-1 vertices with
 *
 * <pre>
 * v      = n-1
 * k      = (v-1)/2
 * lambda = (v-5)/4
 * mu     = (v-1)/4.
 * </pre>
 *
 * <p>We fix the neighborhood of vertex 0 to be 1,...,k.
 * The remaining graph is then enumerated subject to the
 * strongly regular graph conditions.
 *
 * <p>Every labeled conference graph gives 2^(n-1) symmetric
 * conference matrices by switching, and fixing the neighborhood
 * of vertex 0 loses a factor binomial(v-1,k).
 *
 * @author Sean A. Irvine
 */
public class A086260 extends Sequence1 {

  private int mN;
  private long mCount;

  private int mV;
  private int mK;
  private int mLambda;
  private int mMu;

  /*
   * a[i][j]:
   * -1 = edge not yet decided
   *  0 = no edge
   *  1 = edge
   */
  private int[][] mA;

  // Count the currently known edges incident with v
  private int degree(final int v) {
    int d = 0;
    for (int j = 0; j < mV; ++j) {
      if (mA[v][j] == 1) {
        ++d;
      }
    }
    return d;
  }

  // Number of still undecided edges incident with v
  private int degreeUnknown(final int v) {
    int d = 0;
    for (int j = 0; j < mV; ++j) {
      if (mA[v][j] < 0) {
        ++d;
      }
    }
    return d;
  }

  // Return the required number of common neighbors of i and j
  private int requiredCommon(final int i, final int j) {
    // Adjacent vertices have lambda common neighbors, nonadjacent vertices have mu
    return mA[i][j] == 1 ? mLambda : mMu;
  }

  /*
   * Check whether the current partial graph can still satisfy
   * all degree and common-neighbor requirements.
   */
  private boolean viable() {
    // Degree constraints
    for (int i = 0; i < mV; ++i) {
      final int d = degree(i);
      final int u = degreeUnknown(i);
      if (d > mK || d + u < mK) {
        return false;
      }
    }

    // Common-neighbor constraints
    for (int i = 0; i < mV; ++i) {
      for (int j = i + 1; j < mV; ++j) {
        /*
         * The adjacency of i,j is already known whenever this
         * test is reached for a pair whose edge has been assigned.
         * If it is still unknown, we cannot yet know whether the
         * required number is lambda or mu, so defer this pair.
         */
        if (mA[i][j] < 0) {
          continue;
        }

        int common = 0;
        int possible = 0;

        for (int k = 0; k < mV; ++k) {
          if (k == i || k == j) {
            continue;
          }

          final int x = mA[i][k];
          final int y = mA[j][k];

          if (x == 1 && y == 1) {
            ++common;
            ++possible;
          } else if (x != 0 && y != 0) {
            /*
             * At least one of the two edges is still unknown and
             * neither is forced to be absent, so this vertex could
             * become a common neighbor.
             */
            ++possible;
          }
        }

        final int required = requiredCommon(i, j);

        if (common > required || possible < required) {
          return false;
        }
      }
    }

    return true;
  }

  // Final test. At this point all edges are known
  private boolean valid() {
    for (int i = 0; i < mV; ++i) {
      int d = 0;
      for (int j = 0; j < mV; ++j) {
        d += mA[i][j];
      }
      if (d != mK) {
        return false;
      }
    }

    for (int i = 0; i < mV; ++i) {
      for (int j = i + 1; j < mV; ++j) {
        int common = 0;
        for (int k = 0; k < mV; ++k) {
          if (mA[i][k] == 1 && mA[j][k] == 1) {
            ++common;
          }
        }
        if (common != (mA[i][j] == 1 ? mLambda : mMu)) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Enumerate the remaining edges.
   * @param pos edge number
   */
  private void search(final int pos) {
    if (pos >= mV * (mV - 1) / 2) {
      if (valid()) {
        ++mCount;
      }
      return;
    }

    // Decode pos as an upper-triangular edge (i,j)
    int p = 0;
    int i = 0;
    int j = 1;
    while (p < pos) {
      ++j;
      if (j >= mV) {
        ++i;
        j = i + 1;
      }
      ++p;
    }

    // Edges involving vertex 0 were fixed before the search, so skip them
    if (i == 0) {
      search(pos + 1);
      return;
    }
    // Try edge absent
    mA[i][j] = mA[j][i] = 0;
    if (viable()) {
      search(pos + 1);
    }
    // Try edge present
    mA[i][j] = mA[j][i] = 1;
    if (viable()) {
      search(pos + 1);
    }
    // Restore
    mA[i][j] = mA[j][i] = -1;
  }

  // Enumerate graphs with N(0) fixed to {1,...,k}
  private long countNormalized() {
    mV = mN - 1;
    mK = (mV - 1) / 2;
    mLambda = (mV - 5) / 4;
    mMu = (mV - 1) / 4;

    mA = new int[mV][mV];
    for (int i = 0; i < mV; ++i) {
      java.util.Arrays.fill(mA[i], -1);
      mA[i][i] = 0;
    }

    // Fix N(0) = {1,...,k}
    for (int j = 1; j < mV; ++j) {
      final int x = j <= mK ? 1 : 0;
      mA[0][j] = mA[j][0] = x;
    }

    mCount = 0;
    // There are C(v,2) edges, but the k edges incident with vertex 0 have already been fixed
    search(0);
    return mCount;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    // Symmetric conference matrices can exist only when n == 2 (mod 4)
    if ((mN & 3) != 2) {
      return Z.ZERO;
    }
    final long normalized = countNormalized();
    // Undo the normalization of N(0)
    // There are C(v-1,k) possible neighborhoods for vertex 0
    final Z neighborhoodFactor = Binomial.binomial(mV - 1, mK);
    // Undo switching normalization. There are 2^(n-1) switchings of each normalized matrix
    return Z.valueOf(normalized).multiply(neighborhoodFactor).shiftLeft(mN - 1);
  }
}
