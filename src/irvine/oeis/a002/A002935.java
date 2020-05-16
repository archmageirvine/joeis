package irvine.oeis.a002;

import java.util.HashSet;
import java.util.Set;

import irvine.math.graph.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002935.
 * @author Sean A. Irvine
 */
public class A002935 implements Sequence {

  private Set<Multigraph> mStars = new HashSet<>();

  @Override
  public Z next() {
    if (mStars.isEmpty()) {
      final Multigraph m = new Multigraph(2);
      m.addEdge(0, 1);
      m.addEdge(0, 1);
      m.addEdge(0, 1);
      mStars.add(m);
    } else {
      final HashSet<Multigraph> newStars = new HashSet<>();
      for (final Multigraph g : mStars) {
        // (a) join any two distinct vertices by an edge
        final int n = g.order();
        for (int u = 0; u < n; ++u) {
          for (int v = u + 1; v < n; ++v) {
            final Multigraph h = g.copy();
            h.addEdge(u, v);
            newStars.add(h.canon());
          }
        }
        // (b) insert a second-degree vertex on any edge and join to any vertex
        for (int u = 0; u < n; ++u) {
          for (int v = u + 1; v < n; ++v) {
            if (g.edge(u, v) > 0) {
              // Found an edge (it might have multiplicity, but all are equivalent
              // Choose another vertex
              for (int w = 0; w < n; ++w) {
                final Multigraph h = g.copy(n + 1);
                h.removeEdge(u, v);
                h.addEdge(u, n);
                h.addEdge(v, n);
                h.addEdge(w, n);
                newStars.add(h.canon());
              }
            }
          }
        }
        // (c) insert two second-degree vertices on (not necessarily distinct) edges and join by an edge
        for (int u = 0; u < n; ++u) {
          for (int v = u + 1; v < n; ++v) {
            final int e = g.edge(u, v);
            if (e > 0) {
              for (int w = u; w < n; ++w) {
                for (int x = w + 1; x < n; ++x) {
                  if (g.edge(w, x) > 0) {
                    if (u == w && v == x) {
                      // Special case where both new vertices on same edge
                      final Multigraph h = g.copy(n + 2);
                      h.removeEdge(u, v);
                      h.addEdge(u, n);
                      h.addEdge(v, n + 1);
                      h.addEdge(n, n + 1);
                      h.addEdge(n, n + 1); // this edge has multiplicity 2
                      newStars.add(h.canon());
                    }
                    if (u != w || v != x || e > 1) {
                      // We might have (u,v) = (w,x), but still different edges!
                      final Multigraph h = g.copy(n + 2);
                      h.removeEdge(u, v);
                      h.removeEdge(w, x);
                      h.addEdge(u, n);
                      h.addEdge(v, n);
                      h.addEdge(w, n + 1);
                      h.addEdge(x, n + 1);
                      h.addEdge(n, n + 1);
                      newStars.add(h.canon());
                    }
                  }
                }
              }
            }
          }
        }
      }
      mStars = newStars;
    }
    //System.out.println(mStars);
    return Z.valueOf(mStars.size());
  }
}
