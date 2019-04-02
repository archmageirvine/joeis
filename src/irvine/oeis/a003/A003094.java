package irvine.oeis.a003;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.io.IOException;

/**
 * A003094 Number of unlabeled connected planar simple graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A003094 implements Sequence, GraphProcessor {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;
  private long mGenCount = 0;
  private long mPlanarCount = 0;

  @Override
  public void process(final Graph graph) throws IOException {
    ++mGenCount;
    if (graph.isPlanar()) {
      ++mPlanarCount;
    }
  }


  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(1);
    gg.setMaxDeg(mN - 1);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mGenCount = 0;
    mPlanarCount = 0;
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e); // We are not generating output anyway
    }
    if (mVerbose) {
      System.out.println("Undirected generated count was " + mGenCount);
    }
    return Z.valueOf(mPlanarCount);
  }
}
