package irvine.math.plantri;

/**
 * Initialize edges for minimum degree 4 generation, and make the initial octahedron.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Min4 {

  private Min4() { }

  private static void makeEdge(final Edge[] edges, final int run, final int start, final int end, final int next, final int prev) {
    if (start >= 0) {
      edges[run].mStart = start;
    }
    if (end >= 0) {
      edges[run].mEnd = end;
    }
    if (next >= 0) {
      edges[run].mNext = edges[next];
    }
    if (prev >= 0) {
      edges[run].mPrev = edges[prev];
    }
  }

  static void init(final PlantriGraphState state) {
    final Edge[] edges = state.mEdges;

    /* First initialise the edges for the four-operation. */
    for (int n = 6; n <= Plantri.MAX_VERTICES; ++n) {
      final int start = EdgeCounts.fourOp(n);
      for (int i = 0, run = start; i < 6; i += 2) {
        edges[run].mStart = n;
        edges[run].mMin = edges[run];
        edges[run].mInverse = edges[run + 1];
        ++run;
        edges[run].mEnd = n;
        edges[run].mInverse = edges[run].mMin = edges[run - 1];
        ++run;
      }
      int run = start;
      edges[run].mNext = edges[run + 2];
      run += 2; /*2*/
      edges[run].mPrev = edges[start];
      edges[run].mNext = edges[run + 2];
      run += 2; /*4*/
      edges[run].mPrev = edges[start + 2];
    }

    /* Then initialise the edges for the five-operation. */
    for (int n = 6; n <= Plantri.MAX_VERTICES; ++n) {
      final int start = EdgeCounts.fiveOp(n);
      for (int i = 0, run = start; i < 6; i += 2) {
        edges[run].mStart = n;
        edges[run].mMin = edges[run];
        edges[run].mInverse = edges[run + 1];
        ++run;
        edges[run].mEnd = n;
        edges[run].mInverse = edges[run].mMin = edges[run - 1];
        ++run;
      }
      int run = start;
      edges[run].mNext = edges[run + 2];
      run += 2; /*2*/
      edges[run].mPrev = edges[start];
    }

    /* Then initialise the edges for the S-operation. */
    for (int n = 6; n <= Plantri.MAX_VERTICES - 3; ++n) {
      final int start = EdgeCounts.sOp(n);
      for (int i = 0; i < 18; i += 2) {
        int run = start + i;
        edges[run].mInverse = edges[run + 1];
        edges[run].mMin = edges[run];
        ++run;
        edges[run].mInverse = edges[run].mMin = edges[run - 1];
      }

      makeEdge(edges, start, n + 1, n, start + 4, start + 9);
      makeEdge(edges, start + 1, n, n + 1, start + 11, start + 3);
      makeEdge(edges, start + 2, n + 2, n, start + 15, start + 5);
      makeEdge(edges, start + 3, n, n + 2, start + 1, start + 13);
      makeEdge(edges, start + 4, n + 1, n + 2, start + 7, start);
      makeEdge(edges, start + 5, n + 2, n + 1, start + 2, start + 17);
      makeEdge(edges, start + 6, -1, n + 1, start + 16, -1);
      makeEdge(edges, start + 7, n + 1, -1, start + 9, start + 4);
      makeEdge(edges, start + 8, -1, n + 1, -1, start + 10);
      makeEdge(edges, start + 9, n + 1, -1, start, start + 7);
      makeEdge(edges, start + 10, -1, n, start + 8, -1);
      makeEdge(edges, start + 11, n, -1, start + 13, start + 1);
      makeEdge(edges, start + 12, -1, n, -1, start + 14);
      makeEdge(edges, start + 13, n, -1, start + 3, start + 11);
      makeEdge(edges, start + 14, -1, n + 2, start + 12, -1);
      makeEdge(edges, start + 15, n + 2, -1, start + 17, start + 2);
      makeEdge(edges, start + 16, -1, n + 2, -1, start + 6);
      makeEdge(edges, start + 17, n + 2, -1, start + 5, start + 15);
    }
    Octahedron.makeOctahedron(state);
  }

}
