package irvine.math.plantri;

/**
 * Make an octahedron using the first 24 edges.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Octahedron {
  
  private Octahedron() { }

  private static void createEdge(final Edge[] edges, final int k, final int end, final int inverse) {
    final Edge e = edges[k];
    e.mEnd = end;
    e.mInverse = edges[inverse];
    e.mMin = inverse < k ? e.mInverse : e;
  }

  static void makeOctahedron(final Edge[] edges, final Edge[] firstEdge, final int[] degree) {
    assert edges.length >= 24;
    assert firstEdge.length >= 6;
    assert degree.length >= 6;
    for (int i = 0, k = -1; i <= 5; ++i) {
      firstEdge[i] = edges[++k];
      degree[i] = 4;
      edges[k].mNext = edges[k + 1];
      edges[k].mPrev = edges[k + 3];
      edges[k].mStart = i;
      edges[++k].mNext = edges[k + 1];
      edges[k].mPrev = edges[k - 1];
      edges[k].mStart = i;
      edges[++k].mNext = edges[k + 1];
      edges[k].mPrev = edges[k - 1];
      edges[k].mStart = i;
      edges[++k].mNext = edges[k - 3];
      edges[k].mPrev = edges[k - 1];
      edges[k].mStart = i;
    }

    createEdge(edges, 0, 4, 16);
    createEdge(edges, 1, 1, 4);
    createEdge(edges, 2, 2, 8);
    createEdge(edges, 3, 3, 12);
    createEdge(edges, 4, 0, 1);
    createEdge(edges, 5, 4, 19);
    createEdge(edges, 6, 5, 20);
    createEdge(edges, 7, 2, 9);
    createEdge(edges, 8, 0, 2);
    createEdge(edges, 9, 1, 7);
    createEdge(edges, 10, 5, 23);
    createEdge(edges, 11, 3, 13);
    createEdge(edges, 12, 0, 3);
    createEdge(edges, 13, 2, 11);
    createEdge(edges, 14, 5, 22);
    createEdge(edges, 15, 4, 17);
    createEdge(edges, 16, 0, 0);
    createEdge(edges, 17, 3, 15);
    createEdge(edges, 18, 5, 21);
    createEdge(edges, 19, 1, 5);
    createEdge(edges, 20, 1, 6);
    createEdge(edges, 21, 4, 18);
    createEdge(edges, 22, 3, 14);
    createEdge(edges, 23, 2, 10);
  }

  /* Make an octahedron using the first 24 edges */
  static void makeOctahedron(final PlantriGraphState state) {
    Octahedron.makeOctahedron(state.mEdges, state.mFirstEdge, state.mDegree);
    state.mNumVertices = 6;
    state.mNumEdges = 24;
  }
}
