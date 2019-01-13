package irvine.graph;

import java.util.HashMap;
import java.util.Map;

/**
 * Iterate through all possible edge colourings of a graph.
 * @author Sean A. Irvine
 * @param <V> vertex type
 * @param <E> edge type
 */
public abstract class AbstractEdgeColouring<V, E> {

  protected final Graph<V, E> mGraph;
  private final int mColours;

  /**
   * Provide mechanics of colouring for a graph.
   * @param graph the graph
   * @param colours number of colours
   */
  public AbstractEdgeColouring(final Graph<V, E> graph, final int colours) {
    if (colours <= 0) {
      throw new IllegalArgumentException();
    }
    mGraph = graph;
    mColours = colours;
  }

  /**
   * The number of colours.
   * @return the number of colours
   */
  public int getColours() {
    return mColours;
  }

  protected abstract void process(final Map<Edge<E, V>, Integer> colouring);

  // Use backtracking colouring one edge at a time.
  private void edgeColour(final Edge<E, V>[] edges, final int pos, final Map<Edge<E, V>, Integer> colouring) {
    if (pos == edges.length) {
      process(colouring);
      return;
    }
    final Edge<E, V> e = edges[pos];
    final boolean[] used = new boolean[mColours];
    for (final Edge<E, V> s : e.source().edges()) {
      final Integer col = colouring.get(s);
      if (col != null) {
        used[col] = true;
      }
    }
    for (final Edge<E, V> s : e.destination().edges()) {
      final Integer col = colouring.get(s);
      if (col != null) {
        used[col] = true;
      }
    }
    for (int k = 0; k < mColours; ++k) {
      if (!used[k]) {
        colouring.put(e, k);
        edgeColour(edges, pos + 1, colouring);
        colouring.remove(e);
      }
    }
  }

  /**
   * Run the colouring.
   */
  @SuppressWarnings({"unchecked", "rawtypes"})
  public void run() {
    final Edge<E, V>[] edges = mGraph.edges().toArray((Edge<E, V>[]) new Edge[mGraph.size()]);
    edgeColour(edges, 0, new HashMap<>());
  }
}
