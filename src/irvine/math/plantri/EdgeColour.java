package irvine.math.plantri;

/**
 * Calculate edge colouring.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class EdgeColour {

  private EdgeColour() { }

  /* list[0..numlist-1] give a list of undirected edges, and
       testEdge is another undirected edge (perhaps included).
       Both must be in mMin form.

       Calculate a colour for each orientation of all these edges.
       If the least colour of an orientation of testEdge is not the
       least of all, return with *nGood == 0.
       Otherwise, put those directed edges with the same least colour
       in good[0..*nGood-1], with testEdge and/or its inverse first.

       It is guaranteed that the edges selected all have the same starting
       and ending degree.

       Note that the definition of colour is used also in findFeasibleFlips. */
  static int makeEdgeColours(final int[] degree, final Edge testEdge, final Edge[] list, final int numlist, final Edge[] good) {
    long col1 = (long) (degree[testEdge.mPrev.mEnd] + degree[testEdge.mNext.mEnd]) << 20;
    long col2 = col1;
    int d1 = degree[testEdge.mStart];
    int d2 = degree[testEdge.mEnd];
    col1 += (long) d1 + ((long) d2 << 10);
    col2 += (long) d2 + ((long) d1 << 10);

    final long bestcol = Math.min(col1, col2);

    int numGood = 0;
    if (col1 == bestcol) {
      good[numGood++] = testEdge;
    }
    if (col2 == bestcol) {
      good[numGood++] = testEdge.mInverse;
    }

    for (int i = numlist; --i >= 0; ) {
      final Edge e = list[i];
      if (e == testEdge) {
        continue;
      }

      col1 = (long) (degree[e.mPrev.mEnd] + degree[e.mNext.mEnd]) << 20;
      col2 = col1;
      d1 = degree[e.mStart];
      d2 = degree[e.mEnd];
      col1 += (long) d1 + ((long) d2 << 10);
      col2 += (long) d2 + ((long) d1 << 10);
      if (col1 < bestcol || col2 < bestcol) {
        return 0;
      }
      if (col1 == bestcol) {
        good[numGood++] = e;
      }
      if (col2 == bestcol) {
        good[numGood++] = e.mInverse;
      }
    }
    return numGood;
  }
}
