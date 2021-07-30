package irvine.oeis.a049;

import irvine.math.graph.Graph;
import irvine.oeis.a024.A024607;

/**
 * A049368 Number of connected triangle-free planar graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A049368 extends A024607 {

  @Override
  public long getCount(final Graph graph) {
    return graph.isPlanar() ? 1 : 0;
  }
}
