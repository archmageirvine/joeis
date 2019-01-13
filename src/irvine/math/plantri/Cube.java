package irvine.math.plantri;

/**
 * Make a cube using the first 24 edges.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Cube {

  private Cube() {
  }

  private static void createEdge(final Edge[] edges, final int k, final int end, final int inverse) {
    final Edge e = edges[k];
    e.mEnd = end;
    e.mInverse = edges[inverse];
    e.mMin = inverse < k ? e.mInverse : e;
  }

  static void makeCube(final Edge[] edges, final Edge[] firstEdge, final int[] degree) {
    assert edges.length >= 24;
    assert firstEdge.length >= 8;
    assert degree.length >= 8;

    for (int i = 0, k = -1; i < 8; ++i) {
      Edge e = edges[++k];
      firstEdge[i] = e;
      degree[i] = 3;
      e.mNext = edges[k + 1];
      e.mPrev = edges[k + 2];
      e.mStart = i;
      e = edges[++k];
      e.mNext = edges[k + 1];
      e.mPrev = edges[k - 1];
      e.mStart = i;
      e = edges[++k];
      e.mNext = edges[k - 2];
      e.mPrev = edges[k - 1];
      e.mStart = i;
    }

    createEdge(edges, 0, 4, 12);
    createEdge(edges, 1, 3, 11);
    createEdge(edges, 2, 1, 4);
    createEdge(edges, 3, 5, 15);
    createEdge(edges, 4, 0, 2);
    createEdge(edges, 5, 2, 7);
    createEdge(edges, 6, 6, 18);
    createEdge(edges, 7, 1, 5);
    createEdge(edges, 8, 3, 10);
    createEdge(edges, 9, 7, 21);
    createEdge(edges, 10, 2, 8);
    createEdge(edges, 11, 0, 1);
    createEdge(edges, 12, 0, 0);
    createEdge(edges, 13, 5, 17);
    createEdge(edges, 14, 7, 22);
    createEdge(edges, 15, 1, 3);
    createEdge(edges, 16, 6, 20);
    createEdge(edges, 17, 4, 13);
    createEdge(edges, 18, 2, 6);
    createEdge(edges, 19, 7, 23);
    createEdge(edges, 20, 5, 16);
    createEdge(edges, 21, 3, 9);
    createEdge(edges, 22, 4, 14);
    createEdge(edges, 23, 6, 19);
    createEdge(edges, 20, 5, 16);
  }

  static void makeCube(final PlantriGraphState state) {
    makeCube(state.mEdges, state.mFirstEdge, state.mDegree);
    state.mNumVertices = 8;
    state.mNumEdges = 24;
  }
}
