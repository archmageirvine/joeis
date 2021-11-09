package irvine.oeis.a052;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A048192 Number of connected chordal graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A052431 extends ParallelGenerateGraphsSequence {

  // todo This is apparently not right!

  /** Construct the sequence. */
  public A052431() {
    super(0, 0, false, false, false);
  }

  private boolean searchForOddChordlessCycle(final Graph graph, final int first, final int prev, final int v, final int length, final long used) {
    // Test if the path so far as a link from the current vertex to an earlier
    // vertex, other than the first vertex.  Such a link is a chord and the
    // checking for this path need go no further.
    boolean hasChord = false;
    for (int w = graph.nextVertex(v, -1); w >= 0; w = graph.nextVertex(v, w)) {
      if (w != prev && w != first && (used & (1L << w)) != 0) {
        hasChord = true;
        break;
      }
    }
    //System.out.println(graph + " " + first + " " + v + " len=" + length + " hc=" + hasChord);
    if (!hasChord) {
      // Test if we can close the cycle from the current vertex
      if (first != prev && graph.isAdjacent(v, first)) {
        // If the current length is even and at least four, then closing the cycle will be
        // a chordless cycle of odd length >= 5.  Otherwise, this edge would be chord in
        // any longer cycle. Either way the search can be terminated.
        return length >= 4 && (length & 1) == 0;
      }
      // There is no possible cycle in the vertices so far, so try each unused next vertex
      // todo why can I not start the following from "first"?
      for (int w = graph.nextVertex(v, -1); w >= 0; w = graph.nextVertex(v, w)) {
        final long bit = 1L << w;
        if ((used & bit) == 0) {
          if (searchForOddChordlessCycle(graph, first, v, w, length + 1, used | bit)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private boolean hasOddChordlessCycle(final Graph graph) {
    for (int u = 0; u < graph.order(); ++u) {
      // u is a vertex of proposed cycle, WLOG can assume next vertex is higher
      final int v = graph.nextVertex(u, u);
      if (v >= 0 && searchForOddChordlessCycle(graph, u, u, v, 1, (1L << u) | (1L << v))) {
        return true;
      }
    }
    return false;
  }

  @Override
  protected long getCount(final Graph graph) {
    return !hasOddChordlessCycle(graph) && !hasOddChordlessCycle(graph.complement()) ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setConnectionLevel(0);
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1));
  }
}

