package irvine.oeis.a006;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;

/**
 * A006611.
 * @author Sean A. Irvine
 */
public class A006611 extends A006608 {

  @Override
  public void process(final Graph graph) throws IOException {
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
