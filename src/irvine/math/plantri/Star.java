package irvine.math.plantri;

/**
 * Make a star.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Star {

  private Star() { }

  static void makeStar(final int n, final Edge[] edges, final Edge[] firstEdge, final int[] degree) {
    firstEdge[0] = edges[0];
    degree[0] = n - 1;
    int buffer = 0;
    for (int i = 1, buffer2 = n - 1; i <= n - 1; ++i, ++buffer, ++buffer2) {
      edges[buffer].mStart = edges[buffer2].mEnd = 0;
      edges[buffer].mEnd = edges[buffer2].mStart = i;
      edges[buffer].mInverse = edges[buffer2];
      edges[buffer2].mInverse = edges[buffer];
      edges[buffer].mMin = edges[buffer2].mMin = edges[buffer];
      edges[buffer2].mPrev = edges[buffer2].mNext = edges[buffer2];
      degree[i] = 1;
      firstEdge[i] = edges[buffer2];
    }

    edges[buffer] = edges[0];
    // buffer leading to 1
    if (n > 2) {
      edges[buffer].mNext = edges[buffer + 1];
    } else {
      edges[buffer].mNext = edges[buffer];
    }
    edges[buffer].mPrev = edges[buffer + n - 2];
    ++buffer;
    for (int i = 2; i < n - 1; ++i, ++buffer) {
      // buffer leading to i
      edges[buffer].mPrev = edges[buffer - 1];
      edges[buffer].mNext = edges[buffer + 1];
    }
    if (n > 2) {
      // buffer leading to n-1
      edges[buffer].mPrev = edges[buffer - 1];
      edges[buffer].mNext = edges[0];
    }
  }

  /* Makes a star on n vertices -- so one vertex of degree n-1
     and n-1 vertices of degree 1 */
  static void makeStar(final int n, final PlantriGraphState state) {
    if (n == 1) {
      state.mNumVertices = 1;
      state.mNumEdges = 0;
      state.mFirstEdge[0] = null;
      return;
    }
    makeStar(n, state.mEdges, state.mFirstEdge, state.mDegree);
    state.mNumVertices = n;
    state.mNumEdges = 2 * (n - 1);
  }
}
