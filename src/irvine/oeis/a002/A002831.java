package irvine.oeis.a002;

import irvine.graph.CubicGenerator;
import irvine.graph.EdgeThreeColouring;
import irvine.graph.Graph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Collection;

/**
 * A002831 Number of <code>3-edge-colored</code> connected trivalent graphs with <code>2n</code> nodes.
 * @author Sean A. Irvine
 */
public class A002831 implements Sequence {

  private final CubicGenerator mCubicGraphs = new CubicGenerator();

  @Override
  public Z next() {
    Z cnt = Z.ZERO;
    final Collection<Graph<Integer, String>> graphs = mCubicGraphs.next();
    for (final Graph<Integer, String> g : graphs) {
      if (g.isEdgeColourable(3)) {
        final EdgeThreeColouring ci = new EdgeThreeColouring(g);
        ci.run();
        cnt = cnt.add(ci.getCount());
      }
    }
    return cnt;
  }
}
