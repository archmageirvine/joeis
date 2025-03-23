package irvine.oeis.a019;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A019535 Let I_c(n,d) be the maximal number of independent sets in d-regular simple connected graphs with n nodes; sequence gives I_c(n,6).
 * @author Sean A. Irvine
 */
public class A019535 extends AbstractSequence implements GraphProcessor {

  private long mMax = 0;
  private int mN = 6;

  /** Construct the sequence. */
  public A019535() {
    super(7);
  }

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
    gg.setMinEdges(3 * mN);
    gg.setMaxEdges(3 * mN);
    gg.setMinDeg(6);
    gg.setMaxDeg(6);
    gg.setProcessor(this);
    gg.sanitizeParams();
    gg.run(0, 0, 0);
    return Z.valueOf(mMax);
  }
}
