package irvine.oeis.a027;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027667 Number of independent subsets of nodes of <code>3^n</code> cube <code>(P_3</code> X ... X <code>P_3)</code>.
 * @author Sean A. Irvine
 */
public class A027667 implements Sequence {

  private int mN = -1;

  // P_3 (cf. A027667 where this is P_4)
  protected int pathLength() {
    return 3;
  }

  private Graph pathPowerGraph(final int n) {
    final int m = Z.valueOf(pathLength()).pow(n).intValueExact();
    final Graph g = GraphFactory.create(m);
    if (n > 0) {
      for (int u = 0; u < g.order(); ++u) {
        final int[] v = GraphFactory.unpack(u, mN, pathLength());
        for (int k = 0; k < v.length; ++k) {
          if (v[k] != 0 && v[k] != pathLength() - 1) {
            --v[k];
            g.addEdge(u, GraphFactory.pack(v, pathLength()));
            v[k] += 2;
            g.addEdge(u, GraphFactory.pack(v, pathLength()));
            --v[k];
          }
        }
      }
    }
    return g;
  }

  @Override
  public Z next() {
    return Z.valueOf(CountIndependentSets.count(pathPowerGraph(++mN)));
  }
}
