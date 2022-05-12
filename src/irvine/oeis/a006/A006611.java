package irvine.oeis.a006;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;

/**
 * A006611 Number of n-node forests not determined by their spectra.
 * @author Sean A. Irvine
 */
public class A006611 extends A006608 {

  @Override
  public void process(final Graph graph) {
    if (!graph.isCyclic()) {
      super.process(graph);
    }
  }

  @Override
  protected void init(final GenerateGraphs gg, final int n) {
    gg.setConnectionLevel(0);
    gg.setVertices(n);
    gg.setMinEdges(0);
    gg.setMaxEdges(n - 1);
  }
}
