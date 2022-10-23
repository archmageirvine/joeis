package irvine.oeis.a003;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A003317 Number of unlabeled minimally 2-connected graphs with n nodes (also called "blocks").
 * @author Sean A. Irvine
 */
public class A003317 extends Sequence3 implements GraphProcessor {

  // This works but is really slow

  private int mN = 2;
  private long mCount = 0;

  @Override
  public void process(final Graph graph) {
    if (graph.isMinimallyBiconnected()) {
      ++mCount;
    }
  }

  @Override
  public Z next() {
    ++mN;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(2); // biconnected
    gg.setVertices(mN);
    gg.setMinEdges(mN);
    gg.setMaxEdges(mN * (mN - 1));
    gg.setProcessor(this);
    gg.sanitizeParams();
    mCount = 0;
    gg.run(false, false, false, 0, 0);
    return Z.valueOf(mCount);
  }
}

