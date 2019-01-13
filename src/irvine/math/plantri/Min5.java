package irvine.math.plantri;

/**
 * Initialize edges for minimum degree 5 generation, and make the initial icosahedron.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Min5 {

  private Min5() { }

  private static void setEndEdge(final Edge[] edges, final int k, final int end, final int inverse) {
    final Edge e = edges[k];
    if (end >= 0) {
      e.mEnd = end;
    }
    e.mInverse = edges[inverse];
    e.mMin = inverse < k ? e.mInverse : e;
  }

  private static void setEdge(final Edge[] edges, final int k, final int start, final int end, final int inverse) {
    if (start >= 0) {
      edges[k].mStart = start;
    }
    setEndEdge(edges, k, end, inverse);
  }

  private static void setPrevNext(final Edge[] edges, final int k, final int prev, final int next) {
    final Edge e = edges[k];
    e.mPrev = edges[prev];
    e.mNext = edges[next];
  }

  /* First initialize the edges for operation a.). They look like

       a
    \ / \ /
    ?b---c?   Vertex c is the new point. (a,c), (b,c) and (d,c) are the
    / \ / \   new edges with a-.c taken as min5A(n)
       d

     a,b and d will be from the old graph -- they cannot be initialised so far.
     It is assumed that for 12 <= n < MAX_VERTICES after min5A(n) there is room for 6 edges.
  */
  private static void initA(final PlantriGraphState state) {
    final Edge[] edges = state.mEdges;
    for (int n = 12; n < Plantri.MAX_VERTICES; ++n) {
      final int start = EdgeCounts.min5A(n);
      setEdge(edges, start, -1, n, start + 1);
      setEdge(edges, start + 1, n, -1, start);
      edges[start + 1].mPrev = edges[start + 3];
      setEdge(edges, start + 2, -1, n, start + 3);
      setEdge(edges, start + 3, n, -1, start + 2);
      setPrevNext(edges, start + 3, start + 5, start + 1);
      setEdge(edges, start + 4, -1, n, start + 5);
      setEdge(edges, start + 5, n, -1, start + 4);
      edges[start + 5].mNext = edges[start + 3];
    }
  }

  /* The edges for operation b.) look like

        a
     \ / \
      b---e-
     /|  /|      The new vertices are e, f, the new edges (a,e), (b,e), (c,e),
      | / |      (c,f), (d,f), (e,f) with a-.e taken as min5B0(n)
      |/  |/
     -c---f
       \ / \
        d

      It is assumed that after min5B(n) there is room for 12 edges.
  */
  private static void initB(final PlantriGraphState state) {
    final Edge[] edges = state.mEdges;
    for (int n = 12; n < Plantri.MAX_VERTICES - 1; ++n) {
      final int start = EdgeCounts.min5B0(n);
      setEdge(edges, start, -1, n, start + 1);
      setEdge(edges, start + 1, n, -1, start);
      edges[start + 1].mPrev = edges[start + 3];
      setEdge(edges, start + 2, -1, n, start + 3);
      setEdge(edges, start + 3, n, -1, start + 2);
      setPrevNext(edges, start + 3, start + 5, start + 1);
      setEdge(edges, start + 4, -1, n, start + 5);
      edges[start + 4].mNext = edges[start + 8];
      setEdge(edges, start + 5, n, -1, start + 4);
      setPrevNext(edges, start + 5, start + 7, start + 3);
      setEdge(edges, start + 6, n + 1, n, start + 7);
      edges[start + 6].mPrev = edges[start + 9];
      setEdge(edges, start + 7, n, n + 1, start + 6);
      edges[start + 7].mNext = edges[start + 5];
      setEdge(edges, start + 8, -1, n + 1, start + 9);
      edges[start + 8].mPrev = edges[start + 4];
      setEdge(edges, start + 9, n + 1, -1, start + 8);
      setPrevNext(edges, start + 9, start + 11, start + 6);
      setEdge(edges, start + 10, -1, n + 1, start + 11);
      setEdge(edges, start + 11, n + 1, -1, start + 10);
      edges[start + 11].mNext = edges[start + 9];
    }

    // The mirror image operation
    for (int n = 12; n < Plantri.MAX_VERTICES - 1; ++n) {
      final int start = EdgeCounts.min5B1(n);
      setEdge(edges, start, -1, n, start + 1);
      setEdge(edges, start + 1, n, -1, start);
      edges[start + 1].mNext = edges[start + 3];
      setEdge(edges, start + 2, -1, n, start + 3);
      setEdge(edges, start + 3, n, -1, start + 2);
      setPrevNext(edges, start + 3, start + 1, start + 5);
      setEdge(edges, start + 4, -1, n, start + 5);
      edges[start + 4].mPrev = edges[start + 8];
      setEdge(edges, start + 5, n, -1, start + 4);
      setPrevNext(edges, start + 5, start + 3, start + 7);
      setEdge(edges, start + 6, n + 1, n, start + 7);
      edges[start + 6].mNext = edges[start + 9];
      setEdge(edges, start + 7, n, n + 1, start + 6);
      edges[start + 7].mPrev = edges[start + 5];
      setEdge(edges, start + 8, -1, n + 1, start + 9);
      edges[start + 8].mNext = edges[start + 4];
      setEdge(edges, start + 9, n + 1, -1, start + 8);
      setPrevNext(edges, start + 9, start + 6, start + 11);
      setEdge(edges, start + 10, -1, n + 1, start + 11);
      setEdge(edges, start + 11, n + 1, -1, start + 10);
      edges[start + 11].mPrev = edges[start + 9];
    }
  }

  // The last operation is c.) It is much too hard too "draw" this way.
  // The new part that has to be inserted is a vertex of valency 5 surrounded
  // by 5 vertices of the same valency and the "corona" of them. All this is
  // inserted into a pentagon. The edge min5C(n) is one in the corona that
  // has its mStart at an old vertex and an edge of the pentagon in mNext direction.
  private static void initC(final PlantriGraphState state) {
    final Edge[] edges = state.mEdges;
    for (int n = 12; n < Plantri.MAX_VERTICES - 5; ++n) {
      final int start = EdgeCounts.min5C(n);
      // The rotation and starts around the inner vertices is easy:
      int i;
      for (i = 0; i < 4; ++i) {
        int run = start + 10 + 5 * i;
        edges[run].mStart = n + i;
        setPrevNext(edges, run, run + 4, run + 1);
        edges[++run].mStart = n + i;
        setPrevNext(edges, run, run - 1, run + 1);
        edges[++run].mStart = n + i;
        setPrevNext(edges, run, run - 1, run + 1);
        edges[++run].mStart = n + i;
        setPrevNext(edges, run, run - 1, run + 1);
        edges[++run].mStart = n + i;
        setPrevNext(edges, run, run - 1, run - 4);
      }
      int run = start + 10 + 5 * i;
      setPrevNext(edges, run, run + 4, run + 1);
      edges[++run].mStart = n + i;
      setPrevNext(edges, run, run - 1, run + 1);
      edges[++run].mStart = n + i;
      setPrevNext(edges, run, run - 1, run + 1);
      edges[++run].mStart = n + i;
      setPrevNext(edges, run, run - 1, run + 1);
      edges[++run].mStart = n + i;
      setPrevNext(edges, run, run - 1, run - 4);

      run = start + 10 + 5 * (i + 1);
      edges[run].mStart = n + i;
      setPrevNext(edges, run, run + 4, run + 1);
      edges[++run].mStart = n + i;
      setPrevNext(edges, run, run - 1, run + 1);
      edges[++run].mStart = n + i;
      setPrevNext(edges, run, run - 1, run + 1);
      edges[++run].mStart = n + i;
      setPrevNext(edges, run, run - 1, run + 1);
      edges[++run].mStart = n + i;
      setPrevNext(edges, run, run - 1, run - 4);

      // The edges starting at the boundary 5-gon
      run = start;
      edges[run].mPrev = edges[run + 1];
      edges[run + 1].mNext = edges[run];
      run += 2;
      edges[run].mPrev = edges[run + 1];
      edges[run + 1].mNext = edges[run];
      run += 2;
      edges[run].mPrev = edges[run + 1];
      edges[run + 1].mNext = edges[run];
      run += 2;
      edges[run].mPrev = edges[run + 1];
      edges[run + 1].mNext = edges[run];
      run += 2;
      edges[run].mPrev = edges[run + 1];
      edges[run + 1].mNext = edges[run];

      // Now all the ends, inverses, and mins
      setEndEdge(edges, start, n, start + 10);
      setEndEdge(edges, start + 1, n + 1, start + 15);
      setEndEdge(edges, start + 2, n + 1, start + 16);
      setEndEdge(edges, start + 3, n + 2, start + 21);
      setEndEdge(edges, start + 4, n + 2, start + 22);
      setEndEdge(edges, start + 5, n + 3, start + 26);
      setEndEdge(edges, start + 6, n + 3, start + 27);
      setEndEdge(edges, start + 7, -1, start + 31);
      setEndEdge(edges, start + 8, -1, start + 32);
      setEndEdge(edges, start + 9, n, start + 14);
      setEndEdge(edges, start + 10, -1, start);
      setEndEdge(edges, start + 11, n + 1, start + 19);
      setEndEdge(edges, start + 12, n + 4, start + 35);
      setEndEdge(edges, start + 13, -1, start + 33);
      setEndEdge(edges, start + 14, -1, start + 9);
      setEndEdge(edges, start + 15, -1, start + 1);
      setEndEdge(edges, start + 16, -1, start + 2);
      setEndEdge(edges, start + 17, n + 2, start + 20);
      setEndEdge(edges, start + 18, n + 4, start + 36);
      setEndEdge(edges, start + 19, n, start + 11);
      setEndEdge(edges, start + 20, n + 1, start + 17);
      setEndEdge(edges, start + 21, -1, start + 3);
      setEndEdge(edges, start + 22, -1, start + 4);
      setEndEdge(edges, start + 23, n + 3, start + 25);
      setEndEdge(edges, start + 24, n + 4, start + 37);
      setEndEdge(edges, start + 25, n + 2, start + 23);
      setEndEdge(edges, start + 26, -1, start + 5);
      setEndEdge(edges, start + 27, -1, start + 6);
      setEndEdge(edges, start + 28, -1, start + 30);
      setEndEdge(edges, start + 29, n + 4, start + 38);
      setEndEdge(edges, start + 30, n + 3, start + 28);
      setEndEdge(edges, start + 31, -1, start + 7);
      setEndEdge(edges, start + 32, -1, start + 8);
      setEndEdge(edges, start + 33, n, start + 13);
      setEndEdge(edges, start + 34, n + 4, start + 39);
      setEndEdge(edges, start + 35, n, start + 12);
      setEndEdge(edges, start + 36, n + 1, start + 18);
      setEndEdge(edges, start + 37, n + 2, start + 24);
      setEndEdge(edges, start + 38, n + 3, start + 29);
      setEndEdge(edges, start + 39, -1, start + 34);
    }
  }  

  static void init(final PlantriGraphState state) {
    initA(state);
    initB(state);
    initC(state);
    Icosahedron.makeIcosahedron(state);
  }
}
