package irvine.math.plantri;

/**
 * Initialize edges for bipartite generation, and make the initial octahedron
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Bipartite {

  private Bipartite() { }

  static void init(final PlantriGraphState state) {
    final Edge[] edges = state.mEdges;

    /* First initialize the edges for the P-operation. They look like

       a
      / \
  ---b---c   Vertex c is the point where the reference edge is glued to.
      \ /      c--.b is the first edge pOp(n)
       d

      a and d will be from the old graph -- they cannot be initialised so far.
      It is assumed that for 0<=n<MAX_VERTICES after pOp(n) there is room for 12 edges.
    */

    for (int n = 6; n <= Plantri.MAX_VERTICES - 2; ++n) {
      final int start = EdgeCounts.pOp(n);
      Edge run = edges[start];
      run.mStart = n;
      run.mEnd = n + 1;
      run.mMin = run;
      run.mInverse = edges[start + 1];
      run.mNext = edges[start + 2];
      run.mPrev = edges[start + 4];
      run = edges[start + 1];
      run.mStart = n + 1;
      run.mEnd = n;
      run.mMin = run.mInverse = edges[start];
      run.mNext = edges[start + 7];
      run.mPrev = edges[start + 11];
      run = edges[start + 2];
      run.mStart = n;
      run.mMin = run;
      run.mInverse = edges[start + 3];
      run.mPrev = edges[start];
      run = edges[start + 3];
      run.mEnd = n;
      run.mMin = run.mInverse = edges[start + 2];
      run.mNext = edges[start + 10];
      run = edges[start + 4];
      run.mStart = n;
      run.mMin = run;
      run.mInverse = edges[start + 5];
      run.mNext = edges[start];
      run = edges[start + 5];
      run.mEnd = n;
      run.mMin = run.mInverse = edges[start + 4];
      run.mPrev = edges[start + 6];
      run = edges[start + 6];
      run.mEnd = n + 1;
      run.mMin = run;
      run.mInverse = edges[start + 7];
      run.mNext = edges[start + 5];
      run = edges[start + 7];
      run.mStart = n + 1;
      run.mMin = run.mInverse = edges[start + 6];
      run.mNext = edges[start + 9];
      run.mPrev = edges[start + 1];
      run = edges[start + 8];
      run.mEnd = n + 1;
      run.mMin = run;
      run.mInverse = edges[start + 9];
      run = edges[start + 9];
      run.mStart = n + 1;
      run.mMin = run.mInverse = edges[start + 8];
      run.mNext = edges[start + 11];
      run.mPrev = edges[start + 7];
      run = edges[start + 10];
      run.mEnd = n + 1;
      run.mMin = run;
      run.mInverse = edges[start + 11];
      run.mPrev = edges[start + 3];
      run = edges[start + 11];
      run.mStart = n + 1;
      run.mMin = run.mInverse = edges[start + 10];
      run.mNext = edges[start + 1];
      run.mPrev = edges[start + 9];
    }

/* The new edges for the Q-operations look like

   |\
   | \ c  Vertex c is the point where the reference edge is glued to
   | /    and the only new vertex
   |/

*/

    for (int n = 6; n <= Plantri.MAX_VERTICES - 1; ++n) {
      final int start = EdgeCounts.qOp(n);
      Edge run = edges[start];
      run.mMin = run;
      run.mStart = n;
      run.mInverse = edges[start + 1];
      run.mNext = edges[start + 4];
      run = edges[start + 1];
      run.mEnd = n;
      run.mInverse = run.mMin = edges[start];
      run.mPrev = edges[start + 2];
      run = edges[start + 2];
      run.mInverse = edges[start + 3];
      run.mNext = edges[start + 1];
      run.mMin = run;
      run = edges[start + 3];
      run.mInverse = run.mMin = edges[start + 2];
      run.mPrev = edges[start + 5];
      run = edges[start + 4];
      run.mStart = n;
      run.mInverse = edges[start + 5];
      run.mPrev = edges[start];
      run.mMin = run;
      run = edges[start + 5];
      run.mEnd = n;
      run.mInverse = run.mMin = edges[start + 4];
      run.mNext = edges[start + 3];
    }

    Octahedron.makeOctahedron(state);
  }
}
