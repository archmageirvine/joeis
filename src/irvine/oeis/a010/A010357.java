package irvine.oeis.a010;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A010357 Number of unlabeled nonseparable (or 2-connected) loopless multigraphs with n edges.
 * @author Sean A. Irvine
 */
public class A010357 extends Sequence1 implements GraphProcessor {

  private int mEdges = 0;
  private Multigraph mMultigraph = null;

  @Override
  public void process(final Graph graph) {
    mMultigraph.multi(graph, 0, mEdges, mEdges, Multigraph.NOLIMIT, Multigraph.NOLIMIT, false);
  }

  @Override
  public Z next() {
    if (++mEdges == 1) {
      return Z.ONE;
    }
    Z count = Z.ONE;
    for (int k = 0; k <= mEdges; ++k) {
      final GenerateGraphs gg = new GenerateGraphs(1);
      gg.setConnectionLevel(2);
      gg.setVertices(k);
      gg.setMaxEdges(mEdges);
      gg.setMaxDeg(Multigraph.NOLIMIT);
      gg.setProcessor(this);
      gg.sanitizeParams();
      mMultigraph = new Multigraph(null);
      gg.run(false, false, false, 0, 0);
      count = count.add(mMultigraph.getGraphsOutputCount());
    }
    return count;
  }
}

