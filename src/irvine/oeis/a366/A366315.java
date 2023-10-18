package irvine.oeis.a366;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A366315.
 * @author Sean A. Irvine
 */
public class A366315 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A366315() {
    super(0, 0, false, false, false);
  }

  private boolean isEulerian(final Graph graph) {
    int odd = 0;
    for (int k = 0; k < graph.order(); ++k) {
      if ((graph.degree(k) & 1) == 1 && ++odd > 2) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected long getCount(final Graph graph) {
    return isEulerian(graph) && !graph.isHamiltonian() && GraphUtils.isOneTough(graph) ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges((mN - 1) * mN / 2);
    gg.setMinDeg(0);
    gg.setMaxDeg(mN);
    gg.setConnectionLevel(1);
  }
}
