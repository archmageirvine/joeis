package irvine.oeis.a072;

import irvine.math.graph.Graph;
import irvine.oeis.a006.A006820;

/**
 * A072552 Number of connected planar regular graphs of degree 4 with n nodes.
 * @author Sean A. Irvine
 */
public class A072552 extends A006820 {

  {
    setOffset(6);
    skip(6);
  }

  @Override
  protected long getCount(final Graph graph) {
    return graph.isPlanar() ? 1 : 0;
  }
}
