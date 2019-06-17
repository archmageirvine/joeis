package irvine.oeis.a022;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A022562 Number of connected claw-free unlabeled graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A022562 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A022562() {
    super(0, 0, false, false, false);
  }

  static boolean isClawFree(final Graph graph) {
    // Test if is claw free
    // Technically better algorithms are known
    for (int u = 0; u < graph.order(); ++u) {
      if (graph.degree(u) > 2) {
        for (int v = graph.nextVertex(u, -1); v >= 0; v = graph.nextVertex(u, v)) {
          for (int w = graph.nextVertex(u, v); w >= 0; w = graph.nextVertex(u, w)) {
            if (!graph.isAdjacent(v, w)) {
              for (int x = graph.nextVertex(u, w); x >= 0; x = graph.nextVertex(u, x)) {
                if (!graph.isAdjacent(v, x) && !graph.isAdjacent(w, x)) {
                  return false; // found a claw
                }
              }
            }
          }
        }
      }
    }
    return true;
  }

  @Override
  protected long getCount(final Graph graph) {
    return isClawFree(graph) ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
