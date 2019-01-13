package irvine.math.plantri;

/**
 * Make an icosahedron using the first 60 edges.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Icosahedron {

  private Icosahedron() {
  }

  private static void createEdge(final Edge[] edges, final int k, final int end, final int inverse) {
    final Edge e = edges[k];
    e.mEnd = end;
    e.mInverse = edges[inverse];
    e.mMin = inverse < k ? e.mInverse : e;
  }

  static void makeIcosahedron(final Edge[] edges, final Edge[] firstEdge, final int[] degree) {
    assert edges.length >= 60;
    assert firstEdge.length >= 12;
    assert degree.length >= 12;
    for (int i = 0, k = -1; i <= 11; ++i) {
      Edge e = edges[++k];
      firstEdge[i] = e;
      degree[i] = 5;
      e.mNext = edges[k + 1];
      e.mPrev = edges[k + 4];
      e.mStart = i;
      e = edges[++k];
      e.mNext = edges[k + 1];
      e.mPrev = edges[k - 1];
      e.mStart = i;
      e = edges[++k];
      e.mNext = edges[k + 1];
      e.mPrev = edges[k - 1];
      e.mStart = i;
      e = edges[++k];
      e.mNext = edges[k + 1];
      e.mPrev = edges[k - 1];
      e.mStart = i;
      e = edges[++k];
      e.mNext = edges[k - 4];
      e.mPrev = edges[k - 1];
      e.mStart = i;
    }

    createEdge(edges, 0, 1, 5);
    createEdge(edges, 1, 2, 10);
    createEdge(edges, 2, 3, 15);
    createEdge(edges, 3, 4, 20);
    createEdge(edges, 4, 5, 25);
    createEdge(edges, 5, 0, 0);
    createEdge(edges, 6, 5, 29);
    createEdge(edges, 7, 6, 30);
    createEdge(edges, 8, 7, 35);
    createEdge(edges, 9, 2, 11);
    createEdge(edges, 10, 0, 1);
    createEdge(edges, 11, 1, 9);
    createEdge(edges, 12, 7, 39);
    createEdge(edges, 13, 8, 40);
    createEdge(edges, 14, 3, 16);
    createEdge(edges, 15, 0, 2);
    createEdge(edges, 16, 2, 14);
    createEdge(edges, 17, 8, 44);
    createEdge(edges, 18, 9, 45);
    createEdge(edges, 19, 4, 21);
    createEdge(edges, 20, 0, 3);
    createEdge(edges, 21, 3, 19);
    createEdge(edges, 22, 9, 49);
    createEdge(edges, 23, 10, 50);
    createEdge(edges, 24, 5, 26);
    createEdge(edges, 25, 0, 4);
    createEdge(edges, 26, 4, 24);
    createEdge(edges, 27, 10, 54);
    createEdge(edges, 28, 6, 31);
    createEdge(edges, 29, 1, 6);
    createEdge(edges, 30, 1, 7);
    createEdge(edges, 31, 5, 28);
    createEdge(edges, 32, 10, 53);
    createEdge(edges, 33, 11, 55);
    createEdge(edges, 34, 7, 36);
    createEdge(edges, 35, 1, 8);
    createEdge(edges, 36, 6, 34);
    createEdge(edges, 37, 11, 59);
    createEdge(edges, 38, 8, 41);
    createEdge(edges, 39, 2, 12);
    createEdge(edges, 40, 2, 13);
    createEdge(edges, 41, 7, 38);
    createEdge(edges, 42, 11, 58);
    createEdge(edges, 43, 9, 46);
    createEdge(edges, 44, 3, 17);
    createEdge(edges, 45, 3, 18);
    createEdge(edges, 46, 8, 43);
    createEdge(edges, 47, 11, 57);
    createEdge(edges, 48, 10, 51);
    createEdge(edges, 49, 4, 22);
    createEdge(edges, 50, 4, 23);
    createEdge(edges, 51, 9, 48);
    createEdge(edges, 52, 11, 56);
    createEdge(edges, 53, 6, 32);
    createEdge(edges, 54, 5, 27);
    createEdge(edges, 55, 6, 33);
    createEdge(edges, 56, 10, 52);
    createEdge(edges, 57, 9, 47);
    createEdge(edges, 58, 8, 42);
    createEdge(edges, 59, 7, 37);
  }

  /* Make an icosahedron using the first 60 edges */
  static void makeIcosahedron(final PlantriGraphState state) {
    Icosahedron.makeIcosahedron(state.mEdges, state.mFirstEdge, state.mDegree);
    state.mNumVertices = 12;
    state.mNumEdges = 60;
  }
}
