package irvine.math.graph;

import java.util.Arrays;
import java.util.List;

import irvine.math.z.Z;

/**
 * Iterate over clique covers of a graph from its maximal cliques.
 * @author Sean A. Irvine
 */
public final class CliqueCoversIterator {

  private final Z[] mCliqueBits;
  private final Z mAllVerticesBits;
  private final Z[] mEdges;
  private long mSyndrome;

  /**
   * Create a clique cover iterator for the given graph.
   * @param graph graph to get clique covers for
   */
  public CliqueCoversIterator(final Graph graph) {
    final int n = graph.order();
    if (n > 63) {
      throw new UnsupportedOperationException();
    }
    final List<Z> maximalCliques = MaximalCliques.maximalCliques(graph);
    mSyndrome = 1L << maximalCliques.size();
    mAllVerticesBits = Z.ONE.shiftLeft(n).subtract(1);
    mCliqueBits = maximalCliques.toArray(new Z[0]);
    // Precompute bit set versions of each edge
    mEdges = new Z[graph.size()];
    int k = 0;
    for (int u = 0; u < n; ++u) {
      int v = u;
      while ((v = graph.nextVertex(u, v)) != -1) {
        mEdges[k++] = Z.ONE.shiftLeft(u).setBit(v);
      }
    }
    assert k == mEdges.length;
  }

  private boolean contains(final Z[] cover, final int m, final Z edge) {
    for (int k = 0; k < m; ++k) {
      if (cover[k].and(edge).equals(edge)) {
        return true;
      }
    }
    return false;
  }

  private boolean isCliqueCover(final Z[] cover, final int m) {
    for (final Z edge : mEdges) {
      if (!contains(cover, m, edge)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Return the next clique cover or null if there are no further covers
   * @return clique cover or null
   */
  public Z[] next() {
    while (--mSyndrome > 0) {
      // Check that a cover will be formed before bothering to make the array
      long s = mSyndrome;
      Z covered = Z.ZERO;
      int popcount = 0;
      int i = 0;
      while (s != 0) {
        if ((s & 1) == 1) {
          covered = covered.or(mCliqueBits[i]);
          ++popcount;
        }
        s >>>= 1;
        ++i;
      }
      if (covered.equals(mAllVerticesBits)) {
        final Z[] cover = new Z[popcount];
        Arrays.fill(cover, Z.ZERO);
        int k = 0;
        int j = 0;
        s = mSyndrome;
        while (s != 0) {
          if ((s & 1) == 1) {
            cover[k] = mCliqueBits[j];
            ++k;
          }
          s >>>= 1;
          ++j;
        }
        if (isCliqueCover(cover, cover.length)) {
          return cover;
        }
      }
    }
    return null;
  }
}
