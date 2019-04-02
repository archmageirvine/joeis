package irvine.oeis.a007;

import irvine.math.graph.Graph;

/**
 * A007268 Number of partition graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A007268 extends A007269 {

  @Override
  protected boolean neighborCheck(final Graph graph) {
    return graph.order() == mN && graph.order() != 2;
  }
}

