package irvine.oeis.a019;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A019531 Let I_c(n,d) be maximal number of independent sets in d-regular simple connected graphs with n vertices; sequence gives I_c(2n,3).
 * @author Sean A. Irvine
 */
public class A019531 extends Sequence2 implements GraphProcessor {

  private long mMax = 0;
  private int mN = 2;

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
    gg.setMinEdges(3 * mN / 2);
    gg.setMaxEdges(3 * mN / 2);
    gg.setMinDeg(3);
    gg.setMaxDeg(3);
    gg.setProcessor(this);
    gg.sanitizeParams();
    gg.run(0, 0, 0);
    return Z.valueOf(mMax);
  }
}
