package irvine.oeis.a075;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;

/**
 * A075097 Number of simple graphs g on n nodes with |Aut(g)| = 6.
 * @author Sean A. Irvine
 */
public class A075097 extends A075095 {

  @Override
  protected long getCount(final Graph graph) {
    return Z.SIX.equals(GraphUtils.automorphismSize(graph)) ? 1 : 0;
  }
}
