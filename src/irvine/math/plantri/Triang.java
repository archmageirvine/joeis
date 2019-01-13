package irvine.math.plantri;

/**
 * Initialize stars and create initial <code>K4</code>, for ordinary triangulations.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Triang {

  private Triang() { }

  static void init(final PlantriGraphState state) {
    final Edge[] edges = state.mEdges;
    for (int i = 0; i < Plantri.MAX_VERTICES; ++i) {
      int si = EdgeCounts.star3(i);

      for (int j = 0; j < 3; ++j) {
        edges[si + j].mEnd = edges[si + j + 3].mStart = i;
        edges[si + j].mInverse = edges[si + 3 + j];
        edges[si + j + 3].mInverse = edges[si + j];
        edges[si + j].mMin = edges[si + j + 3].mMin = edges[si + j];
        edges[si + j + 3].mNext = edges[si + 3 + (j + 1) % 3];
        edges[si + j + 3].mPrev = edges[si + 3 + (j + 2) % 3];
      }

      si = EdgeCounts.star4(i);

      for (int j = 0; j < 4; ++j) {
        edges[si + j].mEnd = edges[si + j + 4].mStart = i;
        edges[si + j].mInverse = edges[si + 4 + j];
        edges[si + j + 4].mInverse = edges[si + j];
        edges[si + j].mMin = edges[si + j + 4].mMin = edges[si + j];
        edges[si + j + 4].mNext = edges[si + 4 + (j + 1) % 4];
        edges[si + j + 4].mPrev = edges[si + 4 + (j + 3) % 4];
      }

      si = EdgeCounts.star5(i);

      for (int j = 0; j < 5; ++j) {
        edges[si + j].mEnd = edges[si + j + 5].mStart = i;
        edges[si + j].mInverse = edges[si + 5 + j];
        edges[si + j + 5].mInverse = edges[si + j];
        edges[si + j].mMin = edges[si + j + 5].mMin = edges[si + j];
        edges[si + j + 5].mNext = edges[si + 5 + (j + 1) % 5];
        edges[si + j + 5].mPrev = edges[si + 5 + (j + 4) % 5];
      }
    }

    edges[0].mStart = 0;
    edges[0].mEnd = 1;
    edges[0].mNext = edges[0].mPrev = edges[2];
    edges[0].mInverse = edges[1];
    edges[0].mMin = edges[0];

    edges[1].mStart = 1;
    edges[1].mEnd = 0;
    edges[1].mNext = edges[1].mPrev = edges[4];
    edges[1].mInverse = edges[0];
    edges[1].mMin = edges[0];

    edges[2].mStart = 0;
    edges[2].mEnd = 2;
    edges[2].mNext = edges[2].mPrev = edges[0];
    edges[2].mInverse = edges[3];
    edges[2].mMin = edges[2];

    edges[3].mStart = 2;
    edges[3].mEnd = 0;
    edges[3].mNext = edges[3].mPrev = edges[5];
    edges[3].mInverse = edges[2];
    edges[3].mMin = edges[2];

    edges[4].mStart = 1;
    edges[4].mEnd = 2;
    edges[4].mNext = edges[4].mPrev = edges[1];
    edges[4].mInverse = edges[5];
    edges[4].mMin = edges[4];

    edges[5].mStart = 2;
    edges[5].mEnd = 1;
    edges[5].mNext = edges[5].mPrev = edges[3];
    edges[5].mInverse = edges[4];
    edges[5].mMin = edges[4];

    state.mNumVertices = 3;
    state.mNumEdges = 6;

    final int[] degree = state.mDegree;
    degree[0] = degree[1] = degree[2] = 2;
    final Edge[] firstEdge = state.mFirstEdge;
    firstEdge[0] = edges[0];
    firstEdge[1] = edges[1];
    firstEdge[2] = edges[3];
  }

}
