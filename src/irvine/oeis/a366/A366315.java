package irvine.oeis.a366;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A366315 Number of Harris graphs with n vertices. Harris graphs are 1-tough, Eulerian graphs that are non-Hamiltonian.
 * @author Sean A. Irvine
 */
public class A366315 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A366315() {
    super(0, 0, false, false, false);
  }

  @Override
  protected long getCount(final Graph graph) {
    return graph.isEulerian() && !graph.isHamiltonian() && GraphUtils.isOneTough(graph) ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges((mN - 1) * mN / 2);
    gg.setMinDeg(2);
    gg.setMaxDeg(mN);
    gg.setConnectionLevel(1);
  }
}
