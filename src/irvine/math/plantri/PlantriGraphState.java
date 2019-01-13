package irvine.math.plantri;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;

/**
 * Current state of the graph.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class PlantriGraphState {

  /** Number of defined vertices; they are <code>0...mNumVertices-1</code>. */
  int mNumVertices;
  int mNumEdges;           // Number of directed edges
  final Edge[] mEdges;
  final int[] mDegree;     // The degrees of the vertices
  final Edge[] mFirstEdge;

  static Edge[] initEdgeArray(final EdgeFactory edgeFactory, final int n) {
    final Edge[] e = new Edge[n];
    for (int k = 0; k < e.length; ++k) {
      e[k] = edgeFactory.createEdge();
    }
    return e;
  }

  PlantriGraphState(final EdgeFactory edgeFactory, final int maxVertices, final int maxEdges) {
    mDegree = new int[maxVertices];
    mEdges = initEdgeArray(edgeFactory, maxEdges);
    mFirstEdge = initEdgeArray(edgeFactory, maxVertices);
  }

  /**
   * Return the number of vertices.
   * @return order of state
   */
  public int order() {
    return mNumVertices;
  }

  /**
   * The degree of the specified vertex
   * @param v vertex
   * @return degree
   */
  public int degree(final int v) {
    return mDegree[v];
  }

  /**
   * Convert the state into a graph.
   * @return graph for current state
   */
  public Graph toGraph() {
    final Graph g = GraphFactory.create(mNumVertices);
    for (int k = 0; k < mNumVertices; ++k) {
      Edge e = mFirstEdge[k];
      for (int j = 0; j < mDegree[k]; ++j) {
        g.addEdge(k, e.mEnd);
        e = e.mNext;
      }
    }
    return g;
  }
}
