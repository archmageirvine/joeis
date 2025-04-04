package irvine.oeis.a019;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A019534 Let I_c(n,d) be the maximal number of independent sets in d-regular simple connected graphs with n nodes; sequence gives I_c(2n,5).
 * @author Sean A. Irvine
 */
public class A019534 extends Sequence3 implements GraphProcessor {

  private long mMax = 0;
  private int mN = 4;

  @Override
  public void process(final Graph graph) {
    final long independentSetCount = CountIndependentSets.count(graph);
    if (independentSetCount > mMax) {
      mMax = independentSetCount;
    }
  }

  @Override
  public Z next() {
    mN += 2;
    mMax = 0;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMinEdges(5 * mN / 2);
    gg.setMaxEdges(5 * mN / 2);
    gg.setMinDeg(5);
    gg.setMaxDeg(5);
    gg.setProcessor(this);
    gg.sanitizeParams();
    gg.run(0, 0, 0);
    return Z.valueOf(mMax);
  }
}
