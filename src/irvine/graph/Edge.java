package irvine.graph;

/**
 * An edge in a graph.
 *
 * @author Sean A. Irvine
 * @param <E> type of edge label
 * @param <V> type of vertex label
 */
public class Edge<E, V> {

  private final Vertex<V, E> mSource;
  private final Vertex<V, E> mDestination;
  private final E mLabel;
  private final boolean mDirected;

  Edge(final Vertex<V, E> source, final Vertex<V, E> destination, final E label, final boolean directed) {
    mSource = source;
    mDestination = destination;
    mLabel = label;
    mDirected = directed;
    source.addEdge(this);
    if (source != destination) {
      destination.addEdge(this);
    }
  }

  /**
   * Return the source vertex of the edge or in the case of an undirected edge,
   * return one of the ends.
   *
   * @return source vertex
   */
  public Vertex<V, E> source() {
    return mSource;
  }

  /**
   * Return the destination vertex of the edge or in the case of an undirected
   * edge, return the opposite end to <code>source()</code>.
   *
   * @return source vertex
   */
  public Vertex<V, E> destination() {
    return mDestination;
  }

  /**
   * Is this a directed edge?
   *
   * @return true if this is a directed edge.
   */
  public boolean isDirected() {
    return mDirected;
  }

  /**
   * Return the label of this edge.
   *
   * @return edge label
   */
  public E label() {
    return mLabel;
  }

  /**
   * Test if this edge is adjacent to a given edge.  For undirected edges, two
   * edges are adjacent if they share a vertex. For directed edges, if the head of
   * this edge is at the same vertex as the tail of the given edge, then they are
   * adjacent. The appropriate condition applies if one edge is undirected and
   * the other directed.  An edge is adjacent to itself precisely when it is a
   * loop.
   * This is an <code>O(1)</code> operation.
   *
   * @param edge the edge to test
   * @return true if the given edge is adjacent to this edge
   */
  public boolean isAdjacent(final Edge<E, V> edge) {
    return (!isDirected() && source().isOutIncident(edge)) || destination().isOutIncident(edge);
  }

  @Override
  public String toString() {
    if (isDirected()) {
      return source().label() + " -> " + destination().label();
    } else {
      return source().label() + " -- " + destination().label();
    }
  }
}
