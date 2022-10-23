package irvine.oeis.a001;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A001072 Number of minimally 2-edge-connected non-isomorphic graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A001072 extends Sequence3 implements GraphProcessor {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 2;
  private long mCount = 0;

  @Override
  public void process(final Graph graph) {
    if (graph.isMinimallyTwoEdgeConnected()) {
      ++mCount;
      if (mVerbose) {
        System.out.println(graph);
      }
    }
  }

  protected int connectionLevel() {
    return 1;
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(connectionLevel());
    gg.setVertices(mN);
    gg.setMinEdges(mN);
    gg.setMaxEdges(mN * (mN - 1));
    gg.setProcessor(this);
    gg.sanitizeParams();
    gg.run(false, false, false, 0, 0);
    return Z.valueOf(mCount);
  }

}

