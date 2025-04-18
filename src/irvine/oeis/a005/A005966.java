package irvine.oeis.a005;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005966 Number of trivalent planar loopless multigraphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A005966 extends Sequence1 implements GraphProcessor {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private long mGenCount = 0;

  private Multigraph mMultigraph = null;

  @Override
  public void process(final Graph graph) {
    ++mGenCount;
    if (graph.isPlanar()) {
      final int edges = 3 * mN / 2;
      mMultigraph.multi(graph, 0, edges, edges, Multigraph.NOLIMIT, 3, false);
    }
  }

  @Override
  public Z next() {
    mGenCount = 0;
    mN += 2;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(mN);
    gg.setMaxEdges(3 * mN / 2);
    gg.setConnectionLevel(1);
    gg.setMaxDeg(3);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mMultigraph = new Multigraph(null);
    gg.run(0, 0, 0);
    if (mVerbose) {
      System.out.println("Preplanar " + mGenCount + " planar before multiple edges " + mMultigraph.getGraphsInputCount());
    }
    return Z.valueOf(mMultigraph.getGraphsOutputCount());
  }
}
