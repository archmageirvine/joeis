package irvine.oeis.a033;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.oeis.a002.A002851;

/**
 * A033700 Number of connected transitive 4-valent (or quartic) graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A033700 extends A002851 {

  {
    setOffset(5);
    for (int k = 0; k <= degree(); ++k) {
      next();
    }
  }

  @Override
  protected long getCount(final Graph graph) {
    return GraphUtils.isTransitive(graph) ? 1 : 0;
  }

  @Override
  protected int degree() {
    return 4;
  }
}
