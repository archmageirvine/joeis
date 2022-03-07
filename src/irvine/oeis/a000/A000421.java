package irvine.oeis.a000;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000421 Number of isomorphism classes of connected 3-regular (trivalent, cubic) loopless multigraphs of order 2n.
 * @author Sean A. Irvine
 */
public class A000421 implements Sequence, GraphProcessor {

  private int mN = 0;
  private Multigraph mMultigraph = null;

  @Override
  public void process(final Graph graph) throws IOException {
    final int edges = 3 * mN / 2;
    mMultigraph.multi(graph, 0, edges, edges, Multigraph.NOLIMIT, 3, false);
  }

  @Override
  public Z next() {
    mN += 2;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setMaxDeg(3);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mMultigraph = new Multigraph(null, false);
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e); // We are not generating output anyway
    }
    //System.err.println("Gen: " + mMultigraph.getGraphsInputCount());
    return Z.valueOf(mMultigraph.getGraphsOutputCount());
  }
}
