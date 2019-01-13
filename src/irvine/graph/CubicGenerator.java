package irvine.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Generate all cubic multigraphs.
 * @author Sean A. Irvine
 */
public class CubicGenerator {

  private Collection<Graph<Integer, String>> mGraphs = null;
  private int mNextVertex = -1;
  private final boolean mIncludeDisconnected;

  /**
   * Generate cubic multigraphs.
   * @param includeDisconnected should disconnected cases be included
   */
  public CubicGenerator(final boolean includeDisconnected) {
    mIncludeDisconnected = includeDisconnected;
  }

  /** Generate connected cubic multigraphs. */
  public CubicGenerator() {
    this(false);
  }

  private void addIfNotIsomorphic(final Collection<Graph<Integer, String>> res, final Graph<Integer, String> g) {
    boolean ok = true;
    for (final Graph<Integer, String> iso : res) {
      if (g.isIsomorphic(iso)) {
        ok = false;
        break;
      }
    }
    if (ok) {
      res.add(g);
    }

  }

  private Collection<Graph<Integer, String>> augment() {
    final ArrayList<Graph<Integer, String>> res = new ArrayList<>();
    final int u = ++mNextVertex;
    final int v = ++mNextVertex;
    for (final Graph<Integer, String> g : mGraphs) {
      if (mIncludeDisconnected) {
        final Graph<Integer, String> copy = g.copy();
        copy.addVertex(u);
        copy.addVertex(v);
        final Vertex<Integer, String> vu = copy.getVertex(u);
        final Vertex<Integer, String> vv = copy.getVertex(v);
        copy.addEdge(vu, vv, "");
        copy.addEdge(vu, vv, "");
        copy.addEdge(vu, vv, "");
        addIfNotIsomorphic(res, copy);
      }

      // Do all possible single edge replacements
      final ArrayList<Edge<String, Integer>> copyOfEdges = new ArrayList<>(g.edges());
      for (final Edge<String, Integer> e : copyOfEdges) {
        final int a = e.source().label();
        final int b = e.destination().label();
        g.removeEdge(e); // temporary removal
        final Graph<Integer, String> copy = g.copy();
        g.addEdge(e); // restore edge
        copy.addVertex(u);
        copy.addVertex(v);
        final Vertex<Integer, String> vu = copy.getVertex(u);
        final Vertex<Integer, String> vv = copy.getVertex(v);
        copy.addEdge(vu, vv, "");
        copy.addEdge(vu, vv, "");
        copy.addEdge(vu, copy.getVertex(a), "");
        copy.addEdge(vv, copy.getVertex(b), "");
        addIfNotIsomorphic(res, copy);
      }

      // Do all possible double edge replacements
      for (final Edge<String, Integer> e : copyOfEdges) {
        g.removeEdge(e);
        final int a = e.source().label();
        final int b = e.destination().label();
        for (final Edge<String, Integer> f : copyOfEdges) {
          if (!e.equals(f)) {
            g.removeEdge(f);
            final int c = f.source().label();
            final int d = f.destination().label();
            final Graph<Integer, String> copy = g.copy();
            copy.addVertex(u);
            copy.addVertex(v);
            final Vertex<Integer, String> vu = copy.getVertex(u);
            final Vertex<Integer, String> vv = copy.getVertex(v);
            copy.addEdge(vu, vv, "");
            copy.addEdge(vu, copy.getVertex(a), "");
            copy.addEdge(vv, copy.getVertex(b), "");
            copy.addEdge(vu, copy.getVertex(c), "");
            copy.addEdge(vv, copy.getVertex(d), "");
            addIfNotIsomorphic(res, copy);
            final Graph<Integer, String> copy2 = g.copy();
            copy2.addVertex(u);
            copy2.addVertex(v);
            final Vertex<Integer, String> vu2 = copy2.getVertex(u);
            final Vertex<Integer, String> vv2 = copy2.getVertex(v);
            copy2.addEdge(vu2, vv2, "");
            copy2.addEdge(vu2, copy2.getVertex(a), "");
            copy2.addEdge(vv2, copy2.getVertex(c), "");
            copy2.addEdge(vu2, copy2.getVertex(b), "");
            copy2.addEdge(vv2, copy2.getVertex(d), "");
            addIfNotIsomorphic(res, copy2);
            g.addEdge(f);
          }
        }
        g.addEdge(e);
      }

    }
    return res;
  }

  /**
   * Generate the set of non-isomorphic graphs of the next larger size.
   * @return set of graphs
   */
  public Collection<Graph<Integer, String>> next() {
    if (mGraphs == null) {
      // n == 2 case
      final Graph<Integer, String> g0 = new Graph<>();
      g0.addVertex(++mNextVertex);
      g0.addVertex(++mNextVertex);
      final Vertex<Integer, String> v0 = g0.getVertex(0);
      final Vertex<Integer, String> v1 = g0.getVertex(1);
      g0.addEdge(v0, v1, "");
      g0.addEdge(v0, v1, "");
      g0.addEdge(v0, v1, "");
      mGraphs = Collections.singleton(g0);
    } else {
      mGraphs = augment();
    }
    return mGraphs;
  }

  /**
   * Count cubic graphs.
   * @param args number of colours
   */
  public static void main(final String[] args) {
    final CubicGenerator cg = new CubicGenerator();
    for (int k = 0; k < 6; ++k) {
      final Collection<Graph<Integer, String>> set = cg.next();
      System.out.println(set.size());
    }
  }
}
