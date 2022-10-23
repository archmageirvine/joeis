package irvine.oeis.a134;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A134818 Number of unlabeled connected loopless multigraphs with n nodes of degree 4 or less and with at most triple edges.
 * @author Sean A. Irvine
 */
public class A134818 extends Sequence1 implements GraphProcessor {

  private int mN = 0;
  private Multigraph mMultigraph = null;

  @Override
  public void process(final Graph graph) {
    mMultigraph.multi(graph, 0, 0, Multigraph.NOLIMIT, 3, 4, false);
  }

  @Override
  public Z next() {
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(++mN);
    gg.setMaxEdges((mN * mN - mN) / 2);
    gg.setMaxDeg(4);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mMultigraph = new Multigraph(null);
    gg.run(false, false, false, 0, 0);
    return Z.valueOf(mMultigraph.getGraphsOutputCount());
  }
}

