package irvine.graph;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import irvine.util.Pair;

/**
 * Test graphs for isomorphism.
 *
 * @author Sean A. Irvine
 */
final class Isomorphism {

  private Isomorphism() { }

  /*
   * This implementation should really be retired and the nauty based approach
   * used instead.
   */

  /*
    There are several special cases of the isomorphism problem for which efficient
    algorithms are known.  These include trees, planar graphs, interval graphs,
    permutation graphs, partial <i>k</i>-trees, graphs with bounded genus,
    graphs with bounded degree, graphs with bounded eigenvalue multiplicity,
    <i>k</i>-contractible graphs.

    TODO implement some of these
  */

  /* Generate the identity isomorphism. */
  static <V, E, U, F> Graph<Pair<V, U>, Pair<E, F>> identityIsomorphism(final Graph<V, E> g) {
    final Graph<Pair<V, U>, Pair<E, F>> r = new Graph<>();
    for (final Vertex<V, E> v : g.vertices()) {
      // Following cast is safe because g == h
      @SuppressWarnings("unchecked")
      final Pair<V, U> p = new Pair<>(v.label(), (U) v.label());
      r.addVertex(p);
    }
    return r;
  }

  private static class MyComparator implements Comparator<Graph<?, ?>>, Serializable {
    @Override
    public int compare(final Graph<?, ?> a, final Graph<?, ?> b) {
      final int o = a.order() - b.order();
      if (o != 0) {
        return o;
      }
      final int s = a.size() - b.size();
      if (s != 0) {
        return s;
      }
      return System.identityHashCode(a) - System.identityHashCode(b);
    }
  }

  private static void checkSimple(final Graph<?, ?> g) {
    for (final Vertex<?, ?> v : g.vertices()) {
      if (!v.mInEdges.isEmpty() || !v.mOutEdges.isEmpty()) {
        throw new UnsupportedOperationException("too hard");
      }
    }
  }

  private static long[] sortedDegrees(final Graph<?, ?> g) {
    final long[] d = new long[g.order()];
    int p = 0;
    for (final Vertex<?, ?> v : g.vertices()) {
      d[p++] = v.isomorphismConstant();
    }
    Arrays.sort(d);
    return d;
  }

  static <V, E, U, F> Graph<Pair<V, U>, Pair<E, F>> isomorphism(final Graph<V, E> g, final Graph<U, F> h) {
    if (g == null || h == null) {
      return null;
    }
    if (g == h) {
      return identityIsomorphism(g);
    }
    if (g.order() != h.order() || g.size() != h.size()) {
      return null;
    }
    checkSimple(g);
    checkSimple(h);
    // Check degrees of vertices match
    if (!Arrays.equals(sortedDegrees(g), sortedDegrees(h))) {
      return null;
    }
    // Split into components
    final List<Graph<V, E>> cg = g.components();
    final List<Graph<U, F>> ch = h.components();
    if (cg.size() != ch.size()) {
      return null;
    }
    // Produce canonical order of components and check orders and sizes match
    final MyComparator com = new MyComparator();
    cg.sort(com);
    ch.sort(com);
    for (int k = 0; k < cg.size(); ++k) {
      if (cg.get(k).order() != ch.get(k).order()
          || cg.get(k).size() != ch.get(k).size()) {
        return null;
      }
    }
    final Graph<Pair<V, U>, Pair<E, F>> r = new Graph<>();
    // Handle isolated vertices
    while (!cg.isEmpty() && cg.get(0).order() == 1 && cg.get(0).size() == 0) {
      r.addVertex(new Pair<>(cg.remove(0).vertices().iterator().next().label(),
          ch.remove(0).vertices().iterator().next().label()));
    }
    if (cg.isEmpty()) {
      return r;
    }
    // Attempt to pair off components
    for (final Graph<V, E> comp : cg) {
      for (final Graph<U, F> compare : ch) {
        if (compare.size() != comp.size() || compare.order() != comp.order()) {
          return null;
        }
        final Graph<Pair<V, U>, Pair<E, F>> iso = Lau.isomorphism(comp, compare);
        if (iso != null) {
          r.merge(iso);
          ch.remove(compare);
          break;
        }
      }
    }
    return ch.isEmpty() ? r : null;
  }

  static <V, E, U, F> boolean isIsomorphic(final Graph<V, E> g, final Graph<U, F> h) {
    if (g == h) {
      return true;
    }
    if (g == null || h == null) {
      return false;
    }
    if (g.order() != h.order() || g.size() != h.size()) {
      return false;
    }
    checkSimple(g);
    checkSimple(h);
    // Check degrees of vertices match
    if (!Arrays.equals(sortedDegrees(g), sortedDegrees(h))) {
      return false;
    }
    // Split into components
    final List<Graph<V, E>> cg = g.components();
    final List<Graph<U, F>> ch = h.components();
    if (cg.size() != ch.size()) {
      return false;
    }
    // Produce canonical order of components and check orders and sizes match
    final MyComparator com = new MyComparator();
    cg.sort(com);
    ch.sort(com);
    for (int k = 0; k < cg.size(); ++k) {
      if (cg.get(k).order() != ch.get(k).order()
          || cg.get(k).size() != ch.get(k).size()) {
        return false;
      }
    }
    // Handle isolated vertices
    while (!cg.isEmpty() && cg.get(0).order() == 1 && cg.get(0).size() == 0) {
      cg.remove(0);
      ch.remove(0);
    }
    if (cg.isEmpty()) {
      return true;
    }
    // Attempt to pair off components
    for (final Graph<V, E> comp : cg) {
      for (final Graph<U, F> compare : ch) {
        if (compare.size() != comp.size() || compare.order() != comp.order()) {
          return false;
        }
        if (Lau.isIsomorphic(comp, compare)) {
          ch.remove(compare);
          break;
        }
      }
    }
    return ch.isEmpty();
  }

}

