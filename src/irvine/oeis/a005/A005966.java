package irvine.oeis.a005;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005966 Number of trivalent planar loopless multigraphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A005966 implements Sequence, GraphProcessor {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private long mGenCount = 0;

  private Multigraph mMultigraph = null;

  @Override
  public void process(final Graph graph) throws IOException {
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
    mMultigraph = new Multigraph(null, false, false, false);
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e); // We are not generating output anyway
    }
    if (mVerbose) {
      System.out.println("Preplanar " + mGenCount + " planar before multiple edges " + mMultigraph.getGraphsInputCount());
    }
    return Z.valueOf(mMultigraph.getGraphsOutputCount());
  }
}
