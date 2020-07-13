package irvine.oeis.a023;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A023637 Vertex-transitive graphs of valency 10 with n nodes.
 * @author Sean A. Irvine
 */
public class A023637 extends ParallelGenerateGraphsSequence {

  // Too slow to be competitive

  private final int mValency;

  /**
   * Construct the sequence.
   * @param valency the valency
   */
  protected A023637(final int valency) {
    super(valency & ~1, 0, false, false, false);
    mValency = valency;
  }

  /** Construct the sequence. */
  public A023637() {
    this(10);
  }

  @Override
  protected long getCount(final Graph graph) {
    return GraphUtils.isTransitive(graph) ? 1 : 0;
  }

  @Override
  protected void init(final int n) {
    mN += mValency & 1; // step by 2 if valency is odd
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mValency * mN / 2);
    gg.setMaxEdges(mValency * mN / 2);
    gg.setMinDeg(mValency);
    gg.setMaxDeg(mValency);
    gg.setConnectionLevel(0);
  }
}
