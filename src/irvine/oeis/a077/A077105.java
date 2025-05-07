package irvine.oeis.a077;

import java.util.HashSet;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A077105 Number of nonisomorphic generalized Petersen P(n,k) graphs on 2n nodes for 1&lt;=k&lt;=floor((n-1)/2).
 * @author Sean A. Irvine
 */
public class A077105 extends Sequence3 {

  private int mN = 2;

  private irvine.graph.Graph<Integer, Integer> graphToGraph(final Graph g) {
    // Nasty conversion between graph formats
    final irvine.graph.Graph<Integer, Integer> h = new irvine.graph.Graph<>();
    for (int k = 0; k < g.order(); ++k) {
      h.addVertex(k);
    }
    for (int k = 0; k < g.order(); ++k) {
      for (int u = g.nextVertex(k, k); u != -1; u = g.nextVertex(k, u)) {
        h.addEdge(h.getVertex(k), h.getVertex(u), 0);
      }
    }
    return h;
  }

  @Override
  public Z next() {
    if (++mN > 32) {
      // Nauty canonicalization only supports up to 64 vertices -- so use an ugly method
      final HashSet<irvine.graph.Graph<Integer, Integer>> canons = new HashSet<>();
      for (int k = 1; k <= (mN - 1) / 2; ++k) {
        final irvine.graph.Graph<Integer, Integer> g = graphToGraph(GraphFactory.petersen(mN, k));
        boolean ok = true;
        for (final irvine.graph.Graph<Integer, Integer> h : canons) {
          if (h.isIsomorphic(g)) {
            ok = false;
            break;
          }
        }
        if (ok) {
          canons.add(g);
        }
      }
      return Z.valueOf(canons.size());
    } else {
      final HashSet<Graph> canons = new HashSet<>();
      for (int k = 1; k <= (mN - 1) / 2; ++k) {
        final Graph g = GraphFactory.petersen(mN, k);
        canons.add(GraphUtils.canon(g));
      }
      return Z.valueOf(canons.size());
    }
  }
}

