package irvine.oeis.a046;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.MemoryFunction2;
import irvine.math.graph.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046752 Triangle of number of homeomorphically irreducible stars with n edges and m nodes.
 * @author Sean A. Irvine
 */
public class A046752 extends MemoryFunction2<Integer, Set<Multigraph>> implements Sequence {

  private int mN = 1;
  private int mM = 2;

  @Override
  protected Set<Multigraph> compute(final Integer n, final Integer m) {
    if (n < 2 || m < 3 || n > 2 * m / 3) {
      return Collections.emptySet();
    }
    if (n == 2 && m == 3) {
      final Multigraph g = new Multigraph(2);
      g.addEdge(0, 1);
      g.addEdge(0, 1);
      g.addEdge(0, 1);
      return Collections.singleton(g);
    }
    final HashSet<Multigraph> newStars = new HashSet<>();
    for (final Multigraph g : get(n, m - 1)) {
      // (a) join any two distinct vertices by an edge
      for (int u = 0; u < n; ++u) {
        for (int v = u + 1; v < n; ++v) {
          final Multigraph h = g.copy();
          h.addEdge(u, v);
          newStars.add(h.canon());
        }
      }
    }
    for (final Multigraph g : get(n - 1, m - 2)) {
      // (b) insert a second-degree vertex on any edge and join to any vertex
      final int o = g.order();
      for (int u = 0; u < o; ++u) {
        for (int v = u + 1; v < o; ++v) {
          if (g.edge(u, v) > 0) {
            // Found an edge (it might have multiplicity, but all are equivalent
            // Choose another vertex
            for (int w = 0; w < o; ++w) {
              final Multigraph h = g.copy(o + 1);
              h.removeEdge(u, v);
              h.addEdge(u, o);
              h.addEdge(v, o);
              h.addEdge(w, o);
              newStars.add(h.canon());
            }
          }
        }
      }
    }
    for (final Multigraph g : get(n - 2, m - 3)) {
      // (c) insert two second-degree vertices on (not necessarily distinct) edges and join by an edge
      final int o = g.order();
      for (int u = 0; u < o; ++u) {
        for (int v = u + 1; v < o; ++v) {
          final int e = g.edge(u, v);
          if (e > 0) {
            for (int w = u; w < o; ++w) {
              for (int x = w + 1; x < o; ++x) {
                if (g.edge(w, x) > 0) {
                  if (u == w && v == x) {
                    // Special case where both new vertices on same edge
                    final Multigraph h = g.copy(o + 2);
                    h.removeEdge(u, v);
                    h.addEdge(u, o);
                    h.addEdge(v, o + 1);
                    h.addEdge(o, o + 1);
                    h.addEdge(o, o + 1); // this edge has multiplicity 2
                    newStars.add(h.canon());
                  }
                  if (u != w || v != x || e > 1) {
                    // We might have (u,v) = (w,x), but still different edges!
                    final Multigraph h = g.copy(o + 2);
                    h.removeEdge(u, v);
                    h.removeEdge(w, x);
                    h.addEdge(u, o);
                    h.addEdge(v, o);
                    h.addEdge(w, o + 1);
                    h.addEdge(x, o + 1);
                    h.addEdge(o, o + 1);
                    newStars.add(h.canon());
                  }
                }
              }
            }
          }
        }
      }
    }
    return newStars;
  }

  @Override
  public Z next() {
    if (++mN > 2 * mM / 3) {
      ++mM;
      mN = 2;
    }
    return Z.valueOf(get(mN, mM).size());
  }
}
