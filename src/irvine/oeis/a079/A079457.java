package irvine.oeis.a079;

import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079457 Number of unlabeled and connected graphs which are weakly chordal. (G is weakly chordal iff there are no induced cycles of size 5 or more in G nor in its complement.).
 * @author Sean A. Irvine
 */
public class A079457 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079457() {
    super(0, 0, 0, () -> graph -> !graph.hasHole(5) && !graph.complement().hasHole(5) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
