package irvine.oeis.a048;

import java.util.HashSet;
import java.util.Set;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A048192 Number of connected chordal graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A048192 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A048192() {
    super(0, 0, false, false, false);
  }

  // Chordal testing code loosely based on implementation in
  // https://github.com/networkx/networkx

  // Returns a node in choices that has more connections in graph to nodes in wannaConnect.
  private int maxCardinalityNode(final Graph graph, final Set<Integer> choices, final boolean[] wannaConnect) {
    int maxNumber = -1;
    int maxCardinalityNode = -1;
    for (final int x : choices) {
      int number = 0;
      int y = -1;
      while ((y = graph.nextVertex(x, y)) >= 0) {
        if (wannaConnect[y]) {
          ++number;
        }
      }
      if (number > maxNumber) {
        maxNumber = number;
        maxCardinalityNode = x;
      }
    }
    return maxCardinalityNode;
  }

  private boolean isComplete(final Graph graph, final Set<Integer> cliqueWannaBe) {
    for (final int v : cliqueWannaBe) {
      for (final int u : cliqueWannaBe) {
        if (u == v) {
          break;
        }
        if (!graph.isAdjacent(v, u)) {
          return false;
        }
      }
    }
    return true;
  }

  protected boolean isChordal(final Graph graph) {
    final HashSet<Integer> unnumbered = new HashSet<>();
    for (int k = 1; k < graph.order(); ++k) {
      unnumbered.add(k);
    }
    final boolean[] numbered = new boolean[graph.order()];
    numbered[0] = true;
    while (!unnumbered.isEmpty()) {
      final int v = maxCardinalityNode(graph, unnumbered, numbered);
      unnumbered.remove(v);
      numbered[v] = true;
      final HashSet<Integer> cliqueWannaBe = new HashSet<>();
      int y = -1;
      while ((y = graph.nextVertex(v, y)) >= 0) {
        if (numbered[y]) {
          cliqueWannaBe.add(y);
        }
      }
      if (!isComplete(graph, cliqueWannaBe)) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected long getCount(final Graph graph) {
    return isChordal(graph) ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1));
  }
}

