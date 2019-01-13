package irvine.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Perform a topological order of a partially directed acyclic graph.
 *
 * @author Sean A. Irvine
 */
final class OrderChainGraph {

  private OrderChainGraph() { }

  // Identify components using only undirected edges
  private static <V, E> List<Set<Vertex<V, E>>> components(final Graph<V, E> graph) {
    final ArrayList<Set<Vertex<V, E>>> componentSets = new ArrayList<>();
    final HashSet<Vertex<V, E>> todo = new HashSet<>();
    final HashSet<Vertex<V, E>> done = new HashSet<>();
    final HashSet<Vertex<V, E>> notYetUsed = new HashSet<>(graph.vertices());
    while (!notYetUsed.isEmpty()) {
      // Look for a new vertex and update component number for all vertices
      // reachable from it
      final HashSet<Vertex<V, E>> seen = new HashSet<>();
      done.clear();
      todo.clear();
      todo.add(notYetUsed.iterator().next());
      componentSets.add(seen);
      while (!todo.isEmpty()) {
        final Vertex<V, E> v = todo.iterator().next();
        todo.remove(v);
        notYetUsed.remove(v);
        seen.add(v);
        done.add(v);
        for (final Edge<E, V> e : v.edges()) {
          if (!e.isDirected()) {
            final Vertex<V, E> s = e.source();
            final Vertex<V, E> d = e.destination();
            seen.add(s);
            seen.add(d);
            if (!done.contains(s)) {
              todo.add(s);
            }
            if (!done.contains(d)) {
              todo.add(d);
            }
          }
        }
      }
    }
    return componentSets;
  }

  static <V, E> List<Set<Vertex<V, E>>> sort(final Graph<V, E> graph) {
    final List<Set<Vertex<V, E>>> components = components(graph);
    // Create a map from vertex to component
    final HashMap<Vertex<V, E>, Integer> whichComponent = new HashMap<>();
    for (int k = 0; k < components.size(); ++k) {
      for (final Vertex<V, E> v : components.get(k)) {
        whichComponent.put(v, k);
      }
    }
    // Topological sort algorithm
    final HashSet<Vertex<V, E>> unused = new HashSet<>(graph.vertices());
    final HashSet<Vertex<V, E>> used = new HashSet<>();
    final ArrayList<Set<Vertex<V, E>>> res = new ArrayList<>();
    while (!unused.isEmpty()) {
      Set<Vertex<V, E>> c = null;
      for (final Vertex<V, E> v : unused) {
        boolean ok = true;
        for (final Edge<E, V> edge : v.mInEdges) {
          if (!used.contains(edge.source())) {
            ok = false;
            break;
          }
        }
        if (ok) {
          c = components.get(whichComponent.get(v));
          break;
        }
      }
      if (c == null) {
        throw new IllegalArgumentException();
      }
      res.add(c);
      used.addAll(c);
      unused.removeAll(c);
    }
    return res;
  }
}
