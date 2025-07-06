package irvine.oeis.a078;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A078566 Number of (simple, undirected, unlabeled, connected) graphs with n vertices which contain no induced subgraph isomorphic to a C5 (the cycle on 5 vertices).
 * @author Sean A. Irvine
 */
public class A078566 extends ParallelGenerateGraphsSequence {

  private static boolean c5Free(final Graph graph) {
    if (graph.order() < 5) {
      return true;
    }
    //        b
    //       / \
    //      a   c
    //      |   |
    //      e---d
    for (int a = 0; a < graph.order(); ++a) {
      for (int b = graph.nextVertex(a, a); b >= 0; b = graph.nextVertex(a, b)) {
        for (int c = graph.nextVertex(b, -1); c >= 0; c = graph.nextVertex(b, c)) {
          if (a != c && !graph.isAdjacent(a, c)) {
            for (int d = graph.nextVertex(c, -1); d >= 0; d = graph.nextVertex(c, d)) {
              if (d != b && d != a && !graph.isAdjacent(d, b) && !graph.isAdjacent(d, a)) {
                for (int e = graph.nextVertex(d, -1); e >= 0; e = graph.nextVertex(d, e)) {
                  if (e != a && e != c && e != b && graph.isAdjacent(a, e) && !graph.isAdjacent(e, c) && !graph.isAdjacent(e, b)) {
                    return false;
                  }
                }
              }
            }
          }
        }
      }
    }
    return true;
  }

  /** Construct the sequence. */
  public A078566() {
    super(0, 0, 0, () -> graph -> c5Free(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
