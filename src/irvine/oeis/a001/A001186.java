package irvine.oeis.a001;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001186 Number of cubic Hamiltonian graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A001186 implements Sequence, GraphProcessor {

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
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMinEdges(3 * mN / 2);
    gg.setMaxEdges(3 * mN / 2);
    gg.setMinDeg(3);
    gg.setMaxDeg(3);
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

