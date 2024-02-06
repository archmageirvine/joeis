package irvine.math.graph;

import java.util.List;

import irvine.math.LongUtils;

/**
 * Iterate over clique covers of a graph from its maximal cliques.
 * @author Sean A. Irvine
 */
public final class CliqueCoversIterator {

  private final long[] mCliqueBits;
  private final long mAllVerticesBits;
  private final long[] mEdges;
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
    final List<Long> maximalCliques = MaximalCliques.maximalCliques(graph);
    mSyndrome = 1L << maximalCliques.size();
    mAllVerticesBits = (1L << n) - 1;
    mCliqueBits = LongUtils.toLong(maximalCliques);
    // Precompute bit set versions of each edge
    mEdges = new long[graph.size()];
    int k = 0;
    for (int u = 0; u < n; ++u) {
      int v = u;
      while ((v = graph.nextVertex(u, v)) != -1) {
        mEdges[k++] = (1L << u) | (1L << v);
      }
    }
    assert k == mEdges.length;
  }

  private boolean contains(final long[] cover, final int m, final long edge) {
    for (int k = 0; k < m; ++k) {
      if ((cover[k] & edge) == edge) {
        return true;
      }
    }
    return false;
  }

  private boolean isCliqueCover(final long[] cover, final int m) {
    for (final long edge : mEdges) {
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
  public long[] next() {
    while (--mSyndrome > 0) {
      // Check that a cover will be formed before bothering to make the array
      long s = mSyndrome;
      long covered = 0;
      int popcount = 0;
      int i = 0;
      while (s != 0) {
        if ((s & 1) == 1) {
          covered |= mCliqueBits[i];
          ++popcount;
        }
        s >>>= 1;
        ++i;
      }
      if (covered == mAllVerticesBits) {
        final long[] cover = new long[popcount];
        int k = 0;
        int j = 0;
        s = mSyndrome;
        while (s != 0) {
          if ((s & 1) == 1) {
            final long cb = mCliqueBits[j];
            cover[k++] = cb;
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
