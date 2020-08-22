package irvine.oeis.a027;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027685 Number of independent subsets of 4^n torus graph.
 * @author Sean A. Irvine
 */
public class A027685 implements Sequence {

  // This is only good for a small number of terms

  private int mN = -1;

  // C_4
  protected int cycleLength() {
    return 4;
  }

  private Graph torusGraph(final int n) {
    final int m = Z.valueOf(cycleLength()).pow(n).intValueExact();
    final Graph g = GraphFactory.create(m);
    if (n == 0) {
      g.addEdge(0, 0);
    } else {
      for (int u = 0; u < g.order(); ++u) {
        final int[] v = GraphFactory.unpack(u, mN, cycleLength());
        for (int k = 0; k < v.length; ++k) {
          final int t = v[k];
          v[k] = (t + 1) % cycleLength();
          g.addEdge(u, GraphFactory.pack(v, cycleLength()));
          v[k] = t;
        }
      }
    }
    return g;
  }

  @Override
  public Z next() {
    return Z.valueOf(CountIndependentSets.count(torusGraph(++mN)));
  }
}
