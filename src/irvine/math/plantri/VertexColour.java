package irvine.math.plantri;

/**
 * Vertex colouring.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class VertexColour {

  private VertexColour() { }

  /* Make better colours for maxdeg=3, supposing that expand3() has been
       performed at position e3 (though it hasn't been yet).
       If the virtual new vertex, mState.mNumVertices, is not best, return 0.
       Otherwise, return the number of vertices with the same
       colour as mState.mNumVertices (including itself).  Note that for correct
       operation, col[mState.mNumVertices-1] must have the smallest value in col[]
       and all colours must be positive. */
  static int makeColours(final PlantriGraphState state, final int[] col, final Edge e3) {
    final int[] degree = state.mDegree;
    final int v1 = e3.mStart;
    final int v2 = e3.mEnd;
    final int v3 = e3.mNext.mEnd;

    final int c0 = (1 << ((++degree[v1]) & 7)) + (1 << ((++degree[v2]) & 7)) + (1 << ((++degree[v3]) & 7));

    col[state.mNumVertices] = 2;
    int nc = 1;

    for (int i = state.mNumVertices; --i >= 0; ) {
      if (degree[i] != 3) {
        col[i] = degree[i];
      } else {
        final Edge e = state.mFirstEdge[i];
        final int c = (1 << (degree[e.mEnd] & 7)) + (1 << (degree[e.mNext.mEnd] & 7)) + (1 << (degree[e.mNext.mNext.mEnd] & 7));
        if (c > c0) {
          degree[v1]--;
          degree[v2]--;
          degree[v3]--;
          return 0;
        } else if (c == c0) {
          col[i] = 2;
          ++nc;
        } else {
          col[i] = 3;
        }
      }
    }
    degree[v1]--;
    degree[v2]--;
    degree[v3]--;
    return nc;
  }
}
