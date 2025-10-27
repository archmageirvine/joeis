package irvine.oeis.a389;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A389841 Triangle read by rows: T(n,k) is the number of k-critical graphs with n vertices and degree k, (4 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A389841 extends AbstractSequence {

  private int mN = 4;
  private int mM = 2;

  /** Construct the sequence. */
  public A389841() {
    super(4);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 3;
    }
    return new ParallelGenerateGraphsSequence(mN, mN - 1, 0, 0, () -> graph -> {
      if (GraphUtils.isColorable(graph, mM)) {
        return 0;
      }
      for (int u = 0; u < graph.order(); ++u) {
        for (int v = graph.nextVertex(u, u); v >= 0; v = graph.nextVertex(u, v)) {
          graph.removeEdge(u, v);
          final boolean is = GraphUtils.isColorable(graph, mM);
          graph.addEdge(u, v);
          if (!is) {
            return 0;
          }
        }
      }
      return 1;
    }) {
      @Override
      protected void graphGenInit(final GenerateGraphs gg) {
        gg.setVertices(mN);
        gg.setMinEdges(1);
        gg.setMaxEdges(mN * (mN - 1) / 2);
        gg.setConnectionLevel(1);
      }
    }.next();
  }
}
