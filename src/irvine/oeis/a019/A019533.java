package irvine.oeis.a019;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A019533 Let I_c(n,d) be the maximal number of independent sets in d-regular simple connected graphs with n vertices; sequence gives I_c(n, 4).
 * @author Sean A. Irvine
 */
public class A019533 implements Sequence, GraphProcessor {

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
    ++mN;
    mMax = 0;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMinEdges(2 * mN);
    gg.setMaxEdges(2 * mN);
    gg.setMinDeg(4);
    gg.setMaxDeg(4);
    gg.setProcessor(this);
    gg.sanitizeParams();
    gg.run(false, false, false, 0, 0);
    return Z.valueOf(mMax);
  }
}
