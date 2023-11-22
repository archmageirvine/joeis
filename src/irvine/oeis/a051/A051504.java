package irvine.oeis.a051;

import irvine.math.graph.Graph;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A051504 Number of asymmetric digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A051504 extends ParallelGenerateGraphsSequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;

  /** Construct the sequence. */
  public A051504() {
    super(-1, -1, false, false, false);
  }

  private static final class DigraphCheck extends DirectedGraph {
    private long mCount = 0;

    @Override
    protected void process(final Graph g) {
      //System.out.println(g + " auto=" + mNewGroupSize);
      if (groupSize() == 1) {
        ++mCount;
      }
    }
  }

  @Override
  protected long getCount(final Graph graph) {
    final DigraphCheck check = new DigraphCheck();
    check.direct(graph, 0, 0, Multigraph.NOLIMIT, false, false);
    return check.mCount;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(0);
    gg.sanitizeParams();
  }

  @Override
  public Z next() {
    // I do not understand why this apparently requires -a(n-2).
    final Z t = mA;
    mA = mB;
    mB = super.next().max(Z.ONE);
    //System.out.println("raw = " + mB);
    return mB.subtract(t);
  }
}
