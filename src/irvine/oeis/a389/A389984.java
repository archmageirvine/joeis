package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389978.
 * @author Sean A. Irvine
 */
public class A389984 extends Sequence0 {

  private int mN = -1;

  private Graph[] split(final Graph g, final long vertexSet) {
    final int n = g.order();
    final int size = Long.bitCount(vertexSet);
    final Graph r = GraphFactory.create(size);
    final Graph s = GraphFactory.create(n - size);
    final int[] vertexMap = new int[n]; // maps g vertices to r and s
    int ri = 0;
    int si = 0;
    for (int u = 0; u < n; ++u) {
      if ((vertexSet & (1L << u)) != 0) {
        vertexMap[u] = ri++;
      } else {
        vertexMap[u] = si++;
      }
    }
    for (int u = 0; u < n; ++u) {
      if ((vertexSet & (1L << u)) != 0) {
        for (int v = g.nextVertex(u, u); v >= 0; v = g.nextVertex(u, v)) {
          if ((vertexSet & (1L << v)) != 0) {
            // u and v in same split
            r.addEdge(vertexMap[u], vertexMap[v]);
          }
        }
      } else {
        for (int v = g.nextVertex(u, u); v >= 0; v = g.nextVertex(u, v)) {
          if ((vertexSet & (1L << v)) == 0) {
            // u and v in same split
            s.addEdge(vertexMap[u], vertexMap[v]);
          }
        }
      }
    }
    return new Graph[] {r, s};
  }

  @Override
  public Z next() {
    final Graph g = GraphFactory.hypercube(++mN);
    //System.out.println(g);
    final int v = g.order();
    if (v > Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    long cnt = 0;
    // Do splitting by number of vertices
    final long lim = (1L << v) - 1;
    for (int wt = 1; wt <= v / 2; ++wt) {
      final long add = 2 * wt == v ? 1 : 2;
      for (long set = (1L << wt) - 1; set <= lim; set = Functions.SWIZZLE.l(set)) {
        final Graph[] split = split(g, set);
        if (split[0].isConnected() && split[1].isConnected()) {
          cnt += add;
        }
      }
    }
    return Z.valueOf(cnt / 2);
  }
}

