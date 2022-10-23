package irvine.oeis.a001;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A001186 Number of cubic Hamiltonian graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A001186 extends Sequence2 implements GraphProcessor {

  private int mN = 2;
  private long mCount = 0;

  @Override
  public void process(final Graph graph) {
    if (graph.isHamiltonian()) {
      ++mCount;
    }
  }

  @Override
  public Z next() {
    mN += 2;
    mCount = 0;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMinEdges(3 * mN / 2);
    gg.setMaxEdges(3 * mN / 2);
    gg.setMinDeg(3);
    gg.setMaxDeg(3);
    gg.setProcessor(this);
    gg.sanitizeParams();
    gg.run(false, false, false, 0, 0);
    return Z.valueOf(mCount);
  }

}

