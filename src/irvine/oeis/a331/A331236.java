package irvine.oeis.a331;

import java.util.Collection;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A002887.
 * @author Sean A. Irvine
 */
public class A331236 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A331236() {
    super(0, 0, false, false, false);
  }

  private long cuttingNumber(final Graph graph, final int vertex) {
    final Collection<Graph> branches = graph.delete(vertex).components();
    if (branches.size() <= 1) {
      return 0;
    }
    final long p = graph.order();
    long cn = (p - 1) * (p - 2) / 2;
    for (final Graph g : branches) {
      final long pg = g.order();
      cn -= pg * (pg - 1) / 2;
    }
    return cn;
  }

  private long cuttingNumber(final Graph graph) {
    long cn = 0;
    for (int v = 0; v < graph.order(); ++v) {
      if (graph.degree(v) > 1) {
        final long cnv = cuttingNumber(graph, v);
        if (cnv > cn) {
          cn = cnv;
        }
      }
    }
    return cn;
  }

  @Override
  protected long getCount(final Graph graph) {
    return cuttingNumber(graph);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    //gg.setMaxEdges(mN - 1); // Trees
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
