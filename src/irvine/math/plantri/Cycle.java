package irvine.math.plantri;

/**
 * Make a cycle.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Cycle {

  private Cycle() { }

  /* Makes a cycle on n vertices and uses the first 2n edges of the
     vector edges[] for it. Interpretation: a 1-cycle is a loop,
     a 2-cycle a double-edge. */
  static void makeCycle(final int n, final PlantriGraphState state) {
    // edges+2*i always leads from i to i+1 (sMod n) and edges+2*i+1 leads back.
    final int[] degree = state.mDegree;
    final Edge[] edges = state.mEdges;
    final Edge[] firstEdge  = state.mFirstEdge;
    for (int i = 0; i <= n - 1; ++i) {
      degree[i] = 2;
      final Edge buffer = edges[2 * i];
      firstEdge[i] = buffer;
      final Edge bufferb = edges[2 * i + 1];
      buffer.mInverse = bufferb;
      bufferb.mInverse = buffer;
      buffer.mMin = bufferb.mMin = buffer;
      buffer.mStart = bufferb.mEnd = i;
      bufferb.mStart = buffer.mEnd = (i + 1) % n;
      if (i > 0) {
        buffer.mPrev = buffer.mNext = edges[2 * i - 1];
      } else {
        buffer.mPrev = buffer.mNext = edges[2 * n - 1];
      }
      if (i < n - 1) {
        bufferb.mPrev = bufferb.mNext = edges[2 * i + 2];
      } else {
        bufferb.mPrev = bufferb.mNext = edges[0];
      }
    }

    state.mNumVertices = n;
    state.mNumEdges = 2 * n;
  }
}
