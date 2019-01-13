package irvine.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import irvine.util.Pair;

/**
 * A graph. This implementation should be fast enough for many general
 * purpose graph-theoretic problems and should function adequately for
 * graphs will millions of vertices.
 *
 * @author Sean A. Irvine
 * @param <V> type of vertex labels
 * @param <E> type of edge labels
 */
public class Graph<V, E> {

  private final HashSet<Vertex<V, E>> mVertices = new HashSet<>();
  private final HashMap<V, Vertex<V, E>> mLabelToVertexMap = new HashMap<>();
  private final HashSet<Edge<E, V>> mEdges = new HashSet<>();
  private Decision mIsConnected = Decision.UNKNOWN;

  private void resetStructuralProperties() {
    mIsConnected = Decision.UNKNOWN;
  }

  /**
   * Return a copy of this graph.  The copy can be manipulated independently
   * of this graph without damaging the original.
   *
   * @return copy of graph
   */
  public Graph<V, E> copy() {
    final Graph<V, E> g = new Graph<>();
    // Build vertices and remember the mapping
    final HashMap<Vertex<V, E>, Vertex<V, E>> map = new HashMap<>();
    for (final Vertex<V, E> v : mVertices) {
      map.put(v, g.addVertex(v.label()));
    }
    for (final Edge<E, V> e : mEdges) {
      if (e.isDirected()) {
        g.addDirectedEdge(map.get(e.source()), map.get(e.destination()), e.label());
      } else {
        g.addEdge(map.get(e.source()), map.get(e.destination()), e.label());
      }
    }
    return g;
  }

  /**
   * All the vertices of the graph. Returns a read-only view of all the
   * vertices in the graph. If the graph has no vertices, then the set
   * will be empty.
   * This is an <code>O(1)</code> operation.
   *
   * @return vertex set
   */
  public Set<Vertex<V, E>> vertices() {
    return Collections.unmodifiableSet(mVertices);
  }

  /**
   * All the edges of the graph. Returns a read-only view of all the
   * edges in the graph. If the graph has no edges, then the set will be
   * empty.
   * This is an <code>O(1)</code> operation.
   *
   * @return edge set
   */
  public Set<Edge<E, V>> edges() {
    return Collections.unmodifiableSet(mEdges);
  }

  /**
   * Add a new vertex into the graph and return the vertex.
   * This is an <code>O(1)</code> operation.
   *
   * @param label the label of the vertex
   * @return the vertex
   */
  public Vertex<V, E> addVertex(final V label) {
    final Vertex<V, E> v = new Vertex<>(label);
    mVertices.add(v);
    mLabelToVertexMap.put(label, v);
    resetStructuralProperties();
    return v;
  }

  /**
   * Get a vertex with the specified label.  If there is no such vertex, then
   * null is returned.  If multiple vertices have the label, then the most
   * recently added vertex with the label is returned.
   * This is an <code>O(1)</code> operation.
   *
   * @param label the label
   * @return vertex
   */
  public Vertex<V, E> getVertex(final V label) {
    return mLabelToVertexMap.get(label);
  }

  /**
   * Return a set containing all vertices with a specified label.
   * If there is no such vertex, then an empty set is returned.
   * This is an <code>O(1)</code> operation if every label in the graph is
   * unique and an <code>O(|V|)</code> operation otherwise.
   *
   * @param label the label
   * @return vertex
   */
  public Set<Vertex<V, E>> getVertices(final V label) {
    final HashSet<Vertex<V, E>> r = new HashSet<>();
    if (mLabelToVertexMap.size() == mVertices.size()) {
      r.add(getVertex(label));
    } else if (label == null) {
      for (final Vertex<V, E> v : mVertices) {
        if (v.label() == null) {
          r.add(v);
        }
      }
    } else {
      for (final Vertex<V, E> v : mVertices) {
        if (label.equals(v.label())) {
          r.add(v);
        }
      }
    }
    return r;
  }

  Edge<E, V> addEdge(final Edge<E, V> edge) {
    mEdges.add(edge);
    resetStructuralProperties();
    return edge;
  }

  /**
   * Add a new undirected edge into the graph and return the edge.
   * This is an <code>O(1)</code> operation.
   *
   * @param v1 first vertex
   * @param v2 second vertex
   * @param label edge label
   * @return the edge
   * @exception NullPointerException if <code>v1</code> or <code>v2</code> is
   * null.
   * @exception IllegalArgumentException if either vertex is not in this graph.
   */
  public Edge<E, V> addEdge(final Vertex<V, E> v1, final Vertex<V, E> v2, final E label) {
    if (v1 == null || v2 == null) {
      throw new NullPointerException();
    }
    if (!mVertices.contains(v1) || !mVertices.contains(v2)) {
      throw new IllegalArgumentException();
    }
    return addEdge(new Edge<>(v1, v2, label, false));
  }

  /**
   * Add a new directed edge into the graph and return the edge.
   * This is an <code>O(1)</code> operation.
   *
   * @param source source vertex
   * @param destination destination vertex
   * @param label edge label
   * @return the edge
   * @exception NullPointerException if <code>source</code> or <code>destination</code> is
   * null.
   * @exception IllegalArgumentException if either vertex is not in this graph.
   */
  public Edge<E, V> addDirectedEdge(final Vertex<V, E> source, final Vertex<V, E> destination, final E label) {
    if (source == null || destination == null) {
      throw new NullPointerException();
    }
    if (!mVertices.contains(source) || !mVertices.contains(destination)) {
      throw new IllegalArgumentException();
    }
    final Edge<E, V> edge = new Edge<>(source, destination, label, true);
    mEdges.add(edge);
    resetStructuralProperties();
    return edge;
  }

  /**
   * Remove the given edge from the graph and from the corresponding vertices.
   * This is an <code>O(1)</code> operation.
   *
   * @param edge the edge to remove
   * @exception IllegalArgumentException if the edge is not in the graph
   */
  public void removeEdge(final Edge<E, V> edge) {
    // Unlink from graph
    if (!mEdges.remove(edge)) {
      throw new IllegalArgumentException();
    }
    // Unlink from nodes
    edge.source().removeEdge(edge);
    edge.destination().removeEdge(edge);
    resetStructuralProperties();
  }

  /**
   * Remove the specified vertex and all its incident edges from the graph.
   * This is an <code>O(|E_vertex|)</code> operation.
   *
   * @param vertex the vertex to remove
   * @exception IllegalArgumentException if the vertex is not in the graph
   */
  public void removeVertex(final Vertex<V, E> vertex) {
    // Unlink from graph
    if (!mVertices.remove(vertex)) {
      throw new IllegalArgumentException();
    }
    mLabelToVertexMap.remove(vertex.label());
    // Unlink all relevant edges
    for (final Edge<E, V> e : vertex.edges()) {
      removeEdge(e);
    }
    resetStructuralProperties();
  }

  /**
   * Return the order of the graph; that is, the total number of vertices.
   * This is an <code>O(1)</code> operation.
   *
   * @return number of vertices
   */
  public int order() {
    return mVertices.size();
  }

  /**
   * Return the size of the graph; that is, the total number of edges.
   * This is an <code>O(1)</code> operation.
   *
   * @return number of edges
   */
  public int size() {
    return mEdges.size();
  }

  /**
   * Construct the subgraph of this graph induced by the given set of vertices.
   * That is, the subgraph will contain all the specified vertices and inherit
   * all edges between this set of vertices.  Except in the special case where
   * the subgraph is the same same, the new graph nodes will not be equal to
   * the nodes of this graph.
   * This is an <code>O(|vertices|+|E|)</code> operation.
   *
   * @param vertices vertices of this graph to be retained
   * @return the induced subgraph
   * @exception IllegalArgumentException if any of the vertices is not in this
   * graph.
   */
  public Graph<V, E> inducedSubgraph(final Set<Vertex<V, E>> vertices) {
    for (final Vertex<V, E> v : vertices) {
      if (!mVertices.contains(v)) {
        throw new IllegalArgumentException();
      }
    }
    // Check special case where subgraph is entire graph
    if (vertices.size() == mVertices.size()) {
      return this;
    }
    // Construct a new graph cloning nodes
    final Graph<V, E> g = new Graph<>();
    // Build vertices and remember the mapping
    final HashMap<Vertex<V, E>, Vertex<V, E>> map = new HashMap<>();
    for (final Vertex<V, E> v : vertices) {
      map.put(v, g.addVertex(v.label()));
    }
    // Build retained edges.  We do this by examining edges from vertices which
    // are to be retained rather than every edge because examining every edge
    // was slow in the case of large graphs.
    final HashSet<Edge<E, V>> done = new HashSet<>();
    for (final Vertex<V, E> v : vertices) {
      for (final Edge<E, V> e : v.edges()) {
        if (!done.contains(e)) {
          done.add(e);
          if (vertices.contains(e.source()) && vertices.contains(e.destination())) {
            if (e.isDirected()) {
              g.addDirectedEdge(map.get(e.source()), map.get(e.destination()), e.label());
            } else {
              g.addEdge(map.get(e.source()), map.get(e.destination()), e.label());
            }
          }
        }
      }
    }
    return g;
  }

  /**
   * Construct the subgraph of this graph induced by the given set of edges.
   * That is, the subgraph will contain all vertices of this graph, but only
   * the specified edges.  Except in the special case where
   * the subgraph is the same same, the new graph nodes will not be equal to
   * the nodes of this graph.
   * This is an <code>O(|V|+|edges|)</code> operation.
   *
   * @param edges edges of this graph to be retained
   * @return the induced subgraph
   * @exception IllegalArgumentException if any of the edges are not in this
   * graph.
   */
  public Graph<V, E> subgraph(final Set<Edge<E, V>> edges) {
    for (final Edge<E, V> e : edges) {
      if (!mEdges.contains(e)) {
        throw new IllegalArgumentException();
      }
    }
    // Check special case where subgraph is entire graph
    if (edges.size() == mEdges.size()) {
      return this;
    }
    // Construct a new graph cloning nodes
    final Graph<V, E> g = new Graph<>();
    // Build vertices and remember the mapping
    final HashMap<Vertex<V, E>, Vertex<V, E>> map = new HashMap<>();
    for (final Vertex<V, E> v : mVertices) {
      map.put(v, g.addVertex(v.label()));
    }
    // Build retained edges.  We do this by examining every edge of this graph.
    for (final Edge<E, V> e : edges) {
      if (e.isDirected()) {
        g.addDirectedEdge(map.get(e.source()), map.get(e.destination()), e.label());
      } else {
        g.addEdge(map.get(e.source()), map.get(e.destination()), e.label());
      }
    }
    return g;
  }

  /**
   * Attempt to construct an isomorphism from this graph to the given graph.
   * If no such isomorphism exists then null is returned, otherwise a graph
   * representing the isomorphism is returned.  In this returned graph vertex
   * labels are pairs, with the left of the pair being the label in
   * this graph and the right of the pair being the label in the given graph.
   * The resulting graph contains only the vertices and not the edges.<p>
   *
   * A number of simple tests are made first before attempting a costly search.<p>
   *
   * This is a HARD operation.
   *
   * @param <U> vertex type of given graph
   * @param <F> edge type of given graph
   * @param g the graph to construct an isomorphism for
   * @return isomorphism graph
   */
  public <U, F> Graph<Pair<V, U>, Pair<E, F>> isomorphism(final Graph<U, F> g) {
    return Isomorphism.isomorphism(this, g);
  }

  /**
   * Test if two graphs are isomorphic.
   * A number of simple tests are made first before attempting a costly search.<p>
   *
   * This is a HARD operation.
   *
   * @param <U> vertex type of given graph
   * @param <F> edge type of given graph
   * @param g the graph to construct an isomorphism for
   * @return true if the graphs are isomorphic
   */
  public <U, F> boolean isIsomorphic(final Graph<U, F> g) {
    return Isomorphism.isIsomorphic(this, g);
  }

  /**
   * Return the complement of this graph.  That is, return a graph having the
   * same vertices, but where two vertices in the complement are adjacent
   * precisely when they are not adjacent in this graph. Understands about
   * loops, undirected, and directed edges.  Thus, if a vertex in this graph
   * has a loop, then the complement will not, and vice versa.  If this graph
   * has a directed edge from one vertex to another, then the complement with
   * have a directed edge from the other to this.  Multiplicity of edges is
   * not accounted for.  All edges in the complement have null labels.
   * This is an <code>O(|V|^2)</code> operation.
   *
   * @return the complement of this graph
   */
  public Graph<V, E> complement() {
    // Construct a new graph cloning nodes
    final Graph<V, E> g = new Graph<>();
    // Build vertices and remember the mapping
    final HashMap<Vertex<V, E>, Vertex<V, E>> map = new HashMap<>();
    for (final Vertex<V, E> v : mVertices) {
      map.put(v, g.addVertex(v.label()));
    }
    // Consider every pair of edges
    for (final Vertex<V, E> v : mVertices) {
      for (final Vertex<V, E> u : mVertices) {
        final boolean vu = v.isAdjacent(u);
        final boolean uv = u.isAdjacent(v);
        final Vertex<V, E> vv = map.get(v);
        final Vertex<V, E> uu = map.get(u);
        if (vu) {
          if (!uv) {
            // this has v -> u, complement needs u -> v, but check not already present
            if (!uu.isAdjacent(vv)) {
              g.addDirectedEdge(uu, vv, null);
            }
          }
        } else {
          if (uv) {
            // this has u -> v, complement needs v -> u, but check not already present
            if (!vv.isAdjacent(uu)) {
              g.addDirectedEdge(vv, uu, null);
            }
          } else {
            // complement needs u --v, but check not already present
            if (!vv.isAdjacent(uu)) {
              g.addEdge(vv, uu, null);
            }
          }
        }
      }
    }
    return g;
  }

  /**
   * Test if the graph is connected. That is, test if there are edges connecting
   * all the vertices ignoring whether or not they are directed.
   * This is an <code>O(|V|)</code> operation.
   *
   * @return true if graph is connected
   */
  public boolean isConnected() {
    if (mIsConnected == Decision.UNKNOWN) {
      if (mVertices.size() < 2) {
        mIsConnected = Decision.YES;
      } else {
        final HashSet<Vertex<V, E>> done = new HashSet<>();
        final HashSet<Vertex<V, E>> seen = new HashSet<>();
        final HashSet<Vertex<V, E>> todo = new HashSet<>();
        todo.add(mVertices.iterator().next());
        while (!todo.isEmpty()) {
          final Vertex<V, E> v = todo.iterator().next();
          todo.remove(v);
          seen.add(v);
          done.add(v);
          for (final Edge<E, V> e : v.edges()) {
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
        mIsConnected = seen.size() == order() ? Decision.YES : Decision.NO;
      }
    }
    return mIsConnected == Decision.YES;
  }

  /**
   * Return the connected components of this graph.  If the graph is connected,
   * then the result will be a singleton set containing this graph; otherwise
   * the set will contain new graphs isomorphic to the connected components of
   * this graph.
   * This is an <code>O(|V| + |E|)</code> operation.
   *
   * @return the connected components of this graph
   */
  public List<Graph<V, E>> components() {
    final ArrayList<Graph<V, E>> c = new ArrayList<>();
    if (mIsConnected == Decision.YES) {
      c.add(this);
    } else {
      final ArrayList<Set<Vertex<V, E>>> componentSets = new ArrayList<>();
      final HashSet<Vertex<V, E>> todo = new HashSet<>();
      final HashSet<Vertex<V, E>> done = new HashSet<>();
      final HashSet<Vertex<V, E>> notYetUsed = new HashSet<>(mVertices);
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
      for (final Set<Vertex<V, E>> s : componentSets) {
        c.add(inducedSubgraph(s));
      }
    }
    return c;
  }

  /**
   * Merge the given graph as a separate component in this graph.
   *
   * @param g graph to merge
   */
  public void merge(final Graph<V, E> g) {
    mVertices.addAll(g.mVertices);
    mEdges.addAll(g.mEdges);
    mLabelToVertexMap.putAll(g.mLabelToVertexMap);
    resetStructuralProperties();
  }

  /**
   * Return an ordered list of vertices from a directed graph, in which no node
   * appears in the list before it parents.
   * @return topological sort of vertices in a directed graph
   * @throws IllegalArgumentException if the graph contains undirected edges or
   * cannot be resolved due to loops.
   */
  public List<Vertex<V, E>> topologicalOrdering() {
    for (final Edge<E, V> e : mEdges) {
      if (!e.isDirected()) {
        throw new IllegalArgumentException();
      }
    }
    // Can now assume that all edges are directed
    final HashSet<Vertex<V, E>> unused = new HashSet<>(mVertices);
    final HashSet<Vertex<V, E>> used = new HashSet<>();
    final ArrayList<Vertex<V, E>> res = new ArrayList<>();
    while (!unused.isEmpty()) {
      boolean found = false;
      for (final Iterator<Vertex<V, E>> it = unused.iterator(); it.hasNext();) {
        final Vertex<V, E> v = it.next();
        boolean ok = true;
        for (final Edge<E, V> e : v.mInEdges) {
          if (!used.contains(e.source())) {
            ok = false;
            break;
          }
        }
        if (ok) {
          found = true;
          res.add(v);
          used.add(v);
          it.remove();
        }
      }
      if (!found) {
        // Graph must contain loops
        throw new IllegalArgumentException();
      }
    }
    return res;
  }

  /**
   * Compute a topological ordering of the chain components in a partially
   * directed acyclic graph.  That is, returns a list of connected subgraphs
   * such that every node appears in exactly one subgraph and for any pair
   * of nodes X and Y, if there is a directed edge from X to Y, then the
   * subgraph containing X comes before the subgraph containing Y.
   *
   * @return topological sort of chain components
   * @throws IllegalArgumentException if the graph contains undirected edges or
   * cannot be resolved due to loops.
   */
  public List<Set<Vertex<V, E>>> topologicalChainOrdering() {
    return OrderChainGraph.sort(this);
  }

  /**
   * Test if the graph contains at least one cycle.
   *
   * @return true iff the graph is cyclic
   */
  public boolean isCyclic() {
    final HashSet<Vertex<V, E>> done = new HashSet<>();
    final HashSet<Vertex<V, E>> visited = new HashSet<>();
    final LinkedList<Vertex<V, E>> queue = new LinkedList<>();
    while (done.size() != order()) {
      // Find first unvisited node -- there must be at least one
      for (final Vertex<V, E> v : mVertices) {
        if (!done.contains(v)) {
          visited.clear();
          queue.add(v);
          // Explore everywhere reachable from v
          while (!queue.isEmpty()) {
            final Vertex<V, E> u = queue.pollFirst();
            if (done.contains(u)) {
              continue; // Already determined status of this node
            }
            if (!visited.add(u)) {
              return true; // cycle detected
            }
            queue.addAll(u.neighbours());
          }
          done.addAll(visited);
        }
      }
    }
    return false;
  }

  /**
   * Test if this graph is actually a tree.
   * @return true if the graph is a tree
   */
  public boolean isTree() {
    return isConnected() && !isCyclic();
  }

  @Override
  public String toString() {
    // todo: this does nothing with isolated vertices
    final String[] strEdges = new String[mEdges.size()];
    int k = 0;
    for (final Edge<E, V> e : mEdges) {
      strEdges[k++] = e.toString();
    }
    Arrays.sort(strEdges);
    return Arrays.toString(strEdges) + " order=" + order() + " size=" + size();
  }

  GraphCode mGraphCode = null;

  void setGraphCode(final GraphCode graphCode) {
    mGraphCode = graphCode;
  }

  GraphCode getGraphCode() {
    return mGraphCode;
  }

  /**
   * Test if the graph can be edge-coloured in the specified number of colours.
   * @param colours number of colours
   * @return true if graph can be coloured
   */
  public boolean isEdgeColourable(final int colours) {
    return Colourable.isEdgeColourable(this, colours);
  }

  /**
   * Test if the graph is simple.  That is, contains no loops or multiple edges and is undirected
   * @return true if the graph is simple
   */
  public boolean isSimple() {
    final HashSet<Pair<Vertex<V, E>, Vertex<V, E>>> seen = new HashSet<>();
    for (final Edge<E, V> e : mEdges) {
      if (e.isDirected()) {
        return false;
      }
      final Vertex<V, E> s = e.source();
      final Vertex<V, E> d = e.destination();
      if (s.equals(d)) {
        return false;
      }
      if (!seen.add(new Pair<>(s, d)) || !seen.add(new Pair<>(d, s))) {
        return false;
      }
    }
    return true;
  }

}
