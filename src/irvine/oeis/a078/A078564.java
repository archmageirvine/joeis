package irvine.oeis.a078;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A078564 Number of (simple, undirected, unlabeled, connected) graphs with n vertices which contain no induced subgraph isomorphic to the complement of P5 (the "house" graph).
 * @author Sean A. Irvine
 */
public class A078564 extends ParallelGenerateGraphsSequence {

  private static boolean houseFree(final Graph graph) {
    if (graph.order() < 5) {
      return true;
    }
    //        c
    //       / \
    //      a---b
    //      |   |
    //      d---e
    for (int a = 0; a < graph.order(); ++a) {
      if (graph.degree(a) >= 3) {
        for (int b = graph.nextVertex(a, a); b >= 0; b = graph.nextVertex(a, b)) {
          if (graph.degree(b) >= 3) {
            for (int c = graph.nextVertex(b, -1); c >= 0; c = graph.nextVertex(b, c)) {
              if (graph.isAdjacent(a, c)) {
                assert a != c;
                for (int d = graph.nextVertex(a, -1); d >= 0; d = graph.nextVertex(a, d)) {
                  if (d != b && d != c && !graph.isAdjacent(d, b) && !graph.isAdjacent(d, c)) {
                    for (int e = graph.nextVertex(d, -1); e >= 0; e = graph.nextVertex(d, e)) {
                      if (e != a && e != c && graph.isAdjacent(b, e) && !graph.isAdjacent(e, a) && !graph.isAdjacent(e, c)) {
                        return false;
                      }
                    }
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
  public A078564() {
    super(0, 0, 0, () -> graph -> houseFree(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
