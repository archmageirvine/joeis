package irvine.oeis.a243;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A243321 Number of simple connected graphs with n nodes that are bipartite and planar.
 * @author Sean A. Irvine
 */
public class A243321 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A243321() {
    super(0, 0, GenerateGraphs.BIPARTITE, () -> Counter.ONE);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(0);
    gg.setMaxDeg(mN);
    gg.setConnectionLevel(1);
    gg.setPruner((graph, n) -> !graph.isPlanar());
  }

  @Override
  public Z next() {
    return super.next();
  }
}
