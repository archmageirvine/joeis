package irvine.oeis.a134;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A134818.
 * @author Sean A. Irvine
 */
public class A134818 implements Sequence, GraphProcessor {

  private int mN = 0;
  private Multigraph mMultigraph = null;

  @Override
  public void process(final Graph graph) throws IOException {
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
    mMultigraph = new Multigraph(null, false, false, false);
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e); // We are not generating output anyway
    }
    return Z.valueOf(mMultigraph.getGraphsOutputCount());
  }
}

