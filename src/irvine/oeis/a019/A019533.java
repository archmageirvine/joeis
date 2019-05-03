package irvine.oeis.a019;

import java.io.IOException;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019533 Let <code>I_c(n,d)</code> be the maximal number of independent sets in d-regular simple connected graphs with n vertices; sequence gives <code>I_c(n,4)</code>.
 * @author Sean A. Irvine
 */
public class A019533 implements Sequence, GraphProcessor {

  private long mMax = 0;
  private int mN = 4;

  @Override
  public void process(final Graph graph) throws IOException {
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
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    return Z.valueOf(mMax);
  }
}
