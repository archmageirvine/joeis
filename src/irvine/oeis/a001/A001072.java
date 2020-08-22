package irvine.oeis.a001;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001072 Number of minimally 2-edge-connected non-isomorphic graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A001072 implements Sequence, GraphProcessor {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 2;
  private long mCount = 0;

  @Override
  public void process(final Graph graph) {
    if (graph.isMinimallyTwoEdgeConnected()) {
      ++mCount;
      if (mVerbose) {
        System.out.println(graph.toString());
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMinEdges(mN);
    gg.setMaxEdges(mN * (mN - 1));
    gg.setProcessor(this);
    gg.sanitizeParams();
    mCount = 0;
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e); // We are not generating output anyway
    }
    return Z.valueOf(mCount);
  }

}

