package irvine.math.graph;

import java.util.Collection;

/**
 * Define methods for a simple graph with integer number vertices.
 * @author Sean A. Irvine
 */
public interface Graph {

  /**
   * The number of vertices in the graph.
   * @return degree of graph
   */
  int order();

  /**
   * The number of edges in the graph.
   * @return size of graph
   */
  int size();

  /**
   * Test if two vertices are adjacent. Implementations may assume that the supplied vertex
   * numbers are valid for the graph.
   * @param v1 first vertex
   * @param v2 second vertex
   * @return true iff there is an edge connected <code>v1</code> to <code>v2</code>
   */
  boolean isAdjacent(final int v1, final int v2);

  /**
   * Add the specified undirected edge.
   * @param v1 first vertex
   * @param v2 second vertex
   */
  void addEdge(final int v1, final int v2);

  /**
   * Remove the specified undirected edge.
   * @param v1 first vertex
   * @param v2 second vertex
   */
  void removeEdge(final int v1, final int v2);

  /**
   * Return the least vertex bigger than <code>v2</code> adjacent to <code>v1</code>.
   * @param v1 vertex to consult
   * @param v2 next vertex
   * @return index of vertex connected to or -1 if there are no further vertices
   */
  int nextVertex(final int v1, final int v2);

  /**
   * Test if the graph is connected.
   * @return true iff the graph is connected
   */
  boolean isConnected();

  /**
   * Test if the graph is biconnected.  That is, test that if any single vertex is
   * removed that the graph remains connected.
   * @return true iff the graph is biconnected
   */
  boolean isBiconnected();

  /**
   * Test if the graph is minimally biconnected.  That is, if the graph is biconnected,
   * but the removal of any vertex destroys that property.
   * @return true iff the graph is minimally biconnected
   */
  boolean isMinimallyBiconnected();

  /**
   * The number of components in this graph.
   * @return the number of components
   */
  int numberOfComponents();

  /**
   * Return the degree of the specified vertex.  For a directed graph this is the
   * out degree.
   * @param v vertex to get degree of
   * @return degree of vertex
   */
  long degree(final int v);

  /**
   * The in degree of the specified vertex.
   * @param v vertex
   * @return in degree (same as degree for undirected graphs)
   */
  long inDegree(final int v);

  /**
   * Return the edge-complement of this graph.  Does not introduce loops.
   * @return complement graph
   */
  Graph complement();

  /**
   * Return the converse of this graph. That is, this graph with all edges reversed.
   * For undirected graphs, this is simply this graph.
   * @return converse graph
   */
  Graph converse();

  /**
   * Return a copy of this graph.
   * @return copy of the graph
   */
  Graph copy();

  /**
   * Return a copy of this graph but possibly with additional isolated vertices.
   * @param order new order
   * @return copy of the graph
   */
  Graph copy(final int order);

  /**
   * Return the subgraph of this graph with the specified vertex and any
   * associated edges deleted.
   * @param v vertex to delete
   * @return graph with one vertex removed
   */
  Graph delete(final int v);

  /**
   * Return the biconnected components of this graph.
   * @return collection of biconnected components
   */
  Collection<Graph> biconnectedComponents();

  /**
   * Return the components of this graph.
   * @return collection of components
   */
  Collection<Graph> components();

  /**
   * Test if the graph is planar.
   * @return true iff the graph is planar
   */
  boolean isPlanar();

  /**
   * Test if the graph contains at least one cycle.
   * @return true iff the graph contains a cycle
   */
  boolean isCyclic();

  /**
   * Test if the graph is Hamiltonian.
   * @return true iff graph is Hamiltonian
   */
  boolean isHamiltonian();

  /**
   * Compute the girth of the graph.  That is, compute the length of the smallest
   * cycle in the graph, or 0 if the graph is acyclic.
   * @return the girth
   */
  int girth();

  /**
   * Test if the graph is 2-edge-connected.
   * @return true iff the graph is 2-edge-connected
   */
  boolean isTwoEdgeConnected();

  /**
   * Test if the graph is minimally 2-edge-connected.  That is, if the graph is 2-edge connected,
   * but the removal of any edge destroys that property.
   * @return true iff the graph is minimally 2-edge-connected
   */
  boolean isMinimallyTwoEdgeConnected();
}
