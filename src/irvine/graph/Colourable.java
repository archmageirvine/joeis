package irvine.graph;

import java.util.HashMap;
import java.util.Map;

/**
 * Test if a graph is edge-colourable with the given number of colours.
 * @author Sean A. Irvine
 */
public final class Colourable {

  private Colourable() { }

  // Use backtracking colouring one edge at a time.
  // This is not very smart, it would be better to first order the edges in some way
  // so that "dense" areas or cycles get considered first.
  private static boolean edgeColourable(final Edge<?, ?>[] edges, final int pos, final Map<Edge<?, ?>, Integer> colouring, final int colours) {
    if (pos == edges.length) {
      return true;
    }
    final Edge<?, ?> e = edges[pos];
    final boolean[] used = new boolean[colours];
    for (final Edge<?, ?> s : e.source().edges()) {
      final Integer col = colouring.get(s);
      if (col != null) {
        used[col] = true;
      }
    }
    for (final Edge<?, ?> s : e.destination().edges()) {
      final Integer col = colouring.get(s);
      if (col != null) {
        used[col] = true;
      }
    }
    for (int k = 0; k < colours; ++k) {
      if (!used[k]) {
        colouring.put(e, k);
        final boolean res = edgeColourable(edges, pos + 1, colouring, colours);
        if (res) {
          return true;
        }
        colouring.remove(e);
      }
    }
    return false;
  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  private static <V, E> boolean isComponentEdgeColourable(final Graph<V, E> graph, final int colours) {
    final Edge<E, V>[] edges = graph.edges().toArray((Edge<E, V>[]) new Edge[graph.size()]);
    return edgeColourable(edges, 0, new HashMap<>(), colours);
  }

  static boolean isEdgeColourable(final Graph<?, ?> graph, final int colours) {
    if (colours < 0) {
      throw new IllegalArgumentException();
    }
    if (colours == 0) {
      return graph.size() == 0;
    }
    // Graph is colourable if each component is colourable
    for (final Graph<?, ?> component : graph.components()) {
      if (!isComponentEdgeColourable(component, colours)) {
        return false;
      }
    }
    return true;
  }
}
