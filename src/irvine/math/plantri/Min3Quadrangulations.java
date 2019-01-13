package irvine.math.plantri;

/**
 * Initialize edges for the 3-connected quadrangulation generation, and make the initial cube.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Min3Quadrangulations {

  private Min3Quadrangulations() { }

  private static void createEdge(final Edge[] edges, final int k, final int end, final int inverse) {
    final Edge e = edges[k];
    if (end >= 0) {
      e.mEnd = end;
    }
    e.mInverse = edges[inverse];
    e.mMin = inverse < k ? e.mInverse : e;
  }

  /* First initialize the edges for operation P1. They look like

         a
      \ / \ /
      ?b   c?   Vertex c is the new point. (a,c) and (d,c) are the
      / \ / \   new edges with a-.c taken as quadrP1(n)
         d

  It is assumed that for 8<=n<MAX_VERTICES after quadrP1(n) there is room for 4 edges.
  */
  static void init(final PlantriGraphState state) {
    final Edge[] edges = state.mEdges;
    for (int n = 8; n < Plantri.MAX_VERTICES; ++n) {
      final int start = EdgeCounts.quadrP1(n);
      Edge run = edges[start];
      run.mEnd = n;
      run.mMin = run;
      run.mInverse = edges[start + 1];

      run = edges[start + 1];
      run.mStart = n;
      run.mMin = run.mInverse = edges[start];
      run.mPrev = edges[start + 3];

      run = edges[start + 2];
      run.mEnd = n;
      run.mMin = run;
      run.mInverse = edges[start + 3];

      run = edges[start + 3];
      run.mStart = n;
      run.mMin = run.mInverse = edges[start + 2];
      run.mNext = edges[start + 1];
    }


    // The edges for operation P2 can't be "drawn" -- sorry
    // It is assumed that after quadrP2(n) there is room for 14 edges.
    for (int n = 8; n < Plantri.MAX_VERTICES - 2; ++n) {
      final int start = EdgeCounts.quadrP2(n);

      for (int i = 0; i < 4; ++i) {
        final int q = start + 2 * i;
        final Edge run = edges[q];
        run.mInverse = edges[q + 1];
        run.mMin = run;
        edges[q + 1].mInverse = edges[q + 1].mMin = run;
      }

      Edge run = edges[start];
      run.mStart = n;
      run.mPrev = edges[start + 7];

      run = edges[start + 1];
      run.mEnd = n;

      run = edges[start + 2];
      run.mStart = n + 1;
      run.mPrev = edges[start + 4];
      run.mNext = edges[start + 6];

      run = edges[start + 3];
      run.mEnd = n + 1;

      run = edges[start + 4];
      run.mStart = n + 1;
      run.mPrev = edges[start + 6];
      run.mNext = edges[start + 2];

      run = edges[start + 5];
      run.mEnd = n + 1;

      run = edges[start + 6];
      run.mStart = n + 1;
      run.mEnd = n;
      run.mPrev = edges[start + 2];
      run.mNext = edges[start + 4];

      run = edges[start + 7];
      run.mStart = n;
      run.mEnd = n + 1;
      run.mNext = edges[start];
    }

    // The edges for operation P3.
    // It is assumed that after quadrP3(n) there is room for 16 edges.
    for (int n = 8; n < Plantri.MAX_VERTICES - 4; ++n) {
      final int start = EdgeCounts.quadrP3(n);

      for (int i = 0; i < 4; ++i) {
        int q = start + 3 * i;
        Edge run = edges[q];
        run.mNext = edges[q + 1];
        run.mPrev = edges[q + 2];
        run.mStart = n + i;
        run = edges[++q];
        run.mNext = edges[q + 1];
        run.mPrev = edges[q - 1];
        run.mStart = n + i;
        run = edges[++q];
        run.mNext = edges[q - 2];
        run.mPrev = edges[q - 1];
        run.mStart = n + i;
      }

      createEdge(edges, start,      -1,    start + 12);
      createEdge(edges, start + 1,  n + 1, start + 3);
      createEdge(edges, start + 2,  n + 3, start + 11);
      createEdge(edges, start + 3,  n,     start + 1);
      createEdge(edges, start + 4,  -1,    start + 13);
      createEdge(edges, start + 5,  n + 2, start + 6);
      createEdge(edges, start + 6,  n + 1, start + 5);
      createEdge(edges, start + 7,  -1,    start + 14);
      createEdge(edges, start + 8,  n + 3, start + 9);
      createEdge(edges, start + 9,  n + 2, start + 8);
      createEdge(edges, start + 10, -1,    start + 15);
      createEdge(edges, start + 11, n,     start + 2);
      createEdge(edges, start + 12, n,     start);
      createEdge(edges, start + 13, n + 1, start + 4);
      createEdge(edges, start + 14, n + 2, start + 7);
      createEdge(edges, start + 15, n + 3, start + 10);
    }
    Cube.makeCube(state);
  }
}
