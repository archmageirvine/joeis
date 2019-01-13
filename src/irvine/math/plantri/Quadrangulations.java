package irvine.math.plantri;

/**
 * Initialize edges for the generation of all simple quadrangulations and make the initial path <code>p3</code>.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Quadrangulations {

  private Quadrangulations() { }

  /* Make the path P3 */
  private static void makeP3(final PlantriGraphState state) {
    final Edge[] edges = state.mEdges;
    final int[] degree = state.mDegree;
    final Edge[] firstEdge = state.mFirstEdge;
    Edge buffer = edges[0]; /* edge number 0 */
    buffer.mStart = 0;
    buffer.mEnd = 1;
    buffer.mNext = buffer;
    buffer.mPrev = buffer;
    buffer.mInverse = edges[1];
    buffer.mMin = buffer;

    buffer = edges[1]; /* edge number 1 */
    buffer.mStart = 1;
    buffer.mEnd = 0;
    buffer.mNext = edges[2];
    buffer.mPrev = edges[2];
    buffer.mInverse = edges[0];
    buffer.mMin = edges[0];

    buffer = edges[2]; /* edge number 2 */
    buffer.mStart = 1;
    buffer.mEnd = 2;
    buffer.mNext = edges[1];
    buffer.mPrev = edges[1];
    buffer.mInverse = edges[3];
    buffer.mMin = buffer;

    buffer = edges[3]; /* edge number 3 */
    buffer.mStart = 2;
    buffer.mEnd = 1;
    buffer.mNext = buffer;
    buffer.mPrev = buffer;
    buffer.mInverse = edges[2];
    buffer.mMin = edges[2];

    firstEdge[0] = edges[0];
    firstEdge[1] = edges[1];
    firstEdge[2] = edges[3];

    degree[0] = degree[2] = 1;
    degree[1] = 2;

    state.mNumVertices = 3;
    state.mNumEdges = 4;
  }

  /* initialize the edges for operation p0. they look like

         a
        / \
      ?b   c    vertex c is the new point. (a,c) and (d,c) are the
        \ /     new edges with a-.c taken as quadrP0(n)
         d

  it is assumed that for 3<=n<maxn after quadrP0(n) there is room for 4 edges.
  */
  static void init(final PlantriGraphState state) {
    final Edge[] edges = state.mEdges;
    for (int n = 3; n < Plantri.MAX_VERTICES; ++n) {
      final int start = EdgeCounts.quadrP0(n);
      Edge run = edges[start];
      run.mEnd = n;
      run.mMin = run;
      run.mInverse = edges[start + 1];

      run = edges[start + 1];
      run.mStart = n;
      run.mPrev = run.mNext = edges[start + 3];
      run.mMin = run.mInverse = edges[start];

      run = edges[start + 2];
      run.mEnd = n;
      run.mMin = run;
      run.mInverse = edges[start + 3];

      run = edges[start + 3];
      run.mStart = n;
      run.mMin = run.mInverse = edges[start + 2];
      run.mPrev = run.mNext = edges[start + 1];
    }

    // then initialize the edges for operation p1. they look like
    //
    //       a
    //    ? / \
    //   --b   c--  vertex c is the new point. (a,c) and (d,c) are the
    //    ? \ /     new edges with a-.c taken as quadrP1(n)
    //       d
    //
    // it is assumed that for 5<=n<maxn after quadrP1(n) there is room for 4 edges.

    for (int n = 5; n < Plantri.MAX_VERTICES; ++n) {
      final int start  = EdgeCounts.quadrP1(n);
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
    makeP3(state);
  }
}
