package irvine.graph;

import java.util.HashSet;
import java.util.Set;

/**
 * A vertex in a graph.
 *
 * @author Sean A. Irvine
 * @param <V> type of vertex label
 * @param <E> type of edge label
 */
public class Vertex<V, E> {

  private final V mLabel;

  /** Undirected edges which are not loops. */
  private final HashSet<Edge<E, V>> mUndirectedEdges = new HashSet<>();
  private final HashSet<Edge<E, V>> mUndirectedLoops = new HashSet<>();
  /** Directed edges arriving at this vertex. */
  final HashSet<Edge<E, V>> mInEdges = new HashSet<>();
  /** Directed edges leaving this vertex. */
  final HashSet<Edge<E, V>> mOutEdges = new HashSet<>();

  Vertex(final V label) {
    mLabel = label;
  }

  void addEdge(final Edge<E, V> e) {
    if (e.source() != this && e.destination() != this) {
      // Huh? This vertex does not appear in the edge
      throw new IllegalStateException();
    }
    if (e.isDirected()) {
      // Careful to handle loops
      if (e.source() == this) {
        mOutEdges.add(e);
      }
      if (e.destination() == this) {
        mInEdges.add(e);
      }
    } else {
      if (e.source() == e.destination()) {
        mUndirectedLoops.add(e);
      } else {
        mUndirectedEdges.add(e);
      }
    }
  }

  void removeEdge(final Edge<E, V> e) {
    mOutEdges.remove(e);
    mInEdges.remove(e);
    mUndirectedEdges.remove(e);
    mUndirectedLoops.remove(e);
  }

  /**
   * Return the label for this node.
   *
   * @return node label.
   */
  public V label() {
    return mLabel;
  }

  private void addVerticesFromEdges(final Set<Vertex<V, E>> v, final Set<Edge<E, V>> edges) {
    for (final Edge<E, V> e : edges) {
      v.add(e.destination());
    }
  }

  /**
   * Return all vertices reachable from a single edge traversal from this vertex.
   * The result will contain this vertex if there is a loop for this vertex.  The
   * result will be empty if this vertex has no undirected edges and no out-going
   * edges.
   * This is an <code>O(|E_this|)</code> operation.
   *
   * @return neighbours of this vertex
   */
  public Set<Vertex<V, E>> neighbours() {
    final HashSet<Vertex<V, E>> v = new HashSet<>();
    addVerticesFromEdges(v, mUndirectedLoops);
    addVerticesFromEdges(v, mOutEdges);
    for (final Edge<E, V> e : mUndirectedEdges) {
      final Vertex<V, E> d = e.destination();
      v.add(d == this ? e.source() : d);
    }
    return v;
  }

  /**
   * Test if this vertex is adjacent to the given vertex. Returns true if
   * <code>v</code> can be reached by a single edge-traversal from this vertex.
   * A vertex is adjacent to itself only if it has at least one loop.
   * This is an <code>O(|E_this|)</code> operation.
   *
   * @param v vertex to test adjacency of
   * @return true is <code>v</code> is adjacent to this node
   */
  public boolean isAdjacent(final Vertex<V, E> v) {
    // Check out-edges first (this includes directed loops)
    for (final Edge<E, V> e : mOutEdges) {
      if (e.destination() == v) {
        return true;
      }
    }
    if (v == this) {
      return !mUndirectedLoops.isEmpty();
    }
    for (final Edge<E, V> e : mUndirectedEdges) {
      if (e.destination() == v || e.source() == v) {
        return true;
      }
    }
    return false;
  }

  /**
   * Return the set of edges incident with this vertex.
   * @return incident edges
   */
  public Set<Edge<E, V>> edges() {
    final HashSet<Edge<E, V>> edges = new HashSet<>();
    edges.addAll(mUndirectedEdges);
    edges.addAll(mUndirectedLoops);
    edges.addAll(mInEdges);
    edges.addAll(mOutEdges);
    return edges;
  }

  /**
   * Test if the given edge is incident with this vertex.
   * This is an <code>O(1)</code> operation.
   *
   * @param edge the edge to test
   * @return true if the node is incident
   */
  public boolean isIncident(final Edge<E, V> edge) {
    return mUndirectedEdges.contains(edge) || mUndirectedLoops.contains(edge) || mOutEdges.contains(edge) || mInEdges.contains(edge);
  }

  /**
   * Test if it is possible to leave this vertex by the given edge.  That is,
   * test if the given edge is incident with this node and if directed that it
   * is pointing away from this node.
   * This is an <code>O(1)</code> operation.
   *
   * @param edge the edge to test
   * @return true if the node is outwards incident
   */
  public boolean isOutIncident(final Edge<E, V> edge) {
    return mUndirectedEdges.contains(edge) || mUndirectedLoops.contains(edge) || mOutEdges.contains(edge);
  }

  /**
   * Test if it is possible to arrive at this vertex by the given edge.  That is,
   * test if the given edge is incident with this node and if directed that it
   * is pointing towards this node.
   * This is an <code>O(1)</code> operation.
   *
   * @param edge the edge to test
   * @return true if the node is inwards incident
   */
  public boolean isInIncident(final Edge<E, V> edge) {
    return mUndirectedEdges.contains(edge) || mUndirectedLoops.contains(edge) || mInEdges.contains(edge);
  }

  /**
   * Simple degree of this vertex. The sum total of all edges incident with this vertex.
   * @return degree
   */
  public int degree() {
    return mUndirectedLoops.size() + mUndirectedEdges.size() + mOutEdges.size() + mInEdges.size();
  }

  /* An invariant used for quick rejection in isomorphism testing. */
  long isomorphismConstant() {
    return (((long) mUndirectedEdges.size()) << 36)
      ^ (((long) mUndirectedLoops.size()) << 32)
      ^ ((long) mInEdges.size() << 16)
      ^ mOutEdges.size();
  }

}
