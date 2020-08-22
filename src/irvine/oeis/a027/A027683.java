package irvine.oeis.a027;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027683 Number of independent vertex sets of the n X n torus grid graph.
 * @author Sean A. Irvine
 */
public class A027683 implements Sequence {

  // This is only good for a small number of terms

  private int mN = 0;

  static Graph torus(final int n) {
    final Graph g = GraphFactory.create(n * n);
    if (n == 0) {
      g.addEdge(0, 0);
    } else {
      for (int u = 0; u < n; ++u) {
        for (int v = 0; v < n; ++v) {
          final int w = v * n;
          g.addEdge(w + u, w + ((u + 1) % n));
          g.addEdge(w + u, ((v + 1) % n) * n + u);
        }
      }
    }
    return g;
  }

  @Override
  public Z next() {
    return Z.valueOf(CountIndependentSets.count(torus(++mN)));
  }
}
