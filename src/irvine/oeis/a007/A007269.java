package irvine.oeis.a007;

import java.util.List;

import irvine.math.graph.CliqueCoversIterator;
import irvine.math.graph.Graph;
import irvine.math.graph.MaximalCliques;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A007269.
 * @author Sean A. Irvine
 */
public class A007269 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A007269() {
    super(0, 0, false, false, false);
  }

  private Graph simplify(final Graph graph) {
    // Recursively remove any vertex with same neighborhood
    final int n = graph.order();
    if (n == 2) {
      return graph;
    }
    final long[] neighbors = new long[n];
    for (int u = 0; u < n; ++u) {
      long set = 0;
      int v = -1;
      while ((v = graph.nextVertex(u, v)) != -1) {
        set |= 1L << v;
      }
      for (int w = 0; w < u; ++w) {
        if (set == neighbors[w]) {
          return simplify(graph.delete(u));
        }
      }
      neighbors[u] = set;
    }
    return graph;
  }

  private boolean isTriangle(final Graph graph, final long maxIndpSet, final int u, final int v) {
    // Try and find m in indp set such that (u,m) and (v,m) in graph
    int m = 0;
    long s = maxIndpSet;
    while (s != 0) {
      if ((s & 1) == 1 && graph.isAdjacent(u, m) && graph.isAdjacent(v, m)) {
        return true;
      }
      s >>>= 1;
      ++m;
    }
    return false;
  }

  private boolean checkTriangleCondition(final Graph graph, final long maxIndpSet) {
    final int n = graph.order();
    for (int u = 0; u < n; ++u) {
      if ((maxIndpSet & (1L << u)) == 0) {
        // u not in max indp set
        int v = u;
        while ((v = graph.nextVertex(u, v)) != -1) {
          if ((maxIndpSet & (1L << v)) == 0) {
            // v not in max indp set => edge (u,v) not in indp set
            if (!isTriangle(graph, maxIndpSet, u, v)) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }

  private boolean checkIncidenceCondition(final long[] cover, final long set) {
    for (final long c : cover) {
      if ((c & set) == 0) {
        return false;
      }
    }
    return true;
  }

  private boolean checkIncidenceCondition(final long[] cover, final List<Long> sets) {
    for (final long m : sets) {
      if (!checkIncidenceCondition(cover, m)) {
        return false;
      }
    }
    return true;
  }

  protected boolean neighborCheck(final Graph graph) {
    return true;
  }

  @Override
  protected boolean accept(final Graph graph) {
    final Graph simplifiedGraph = simplify(graph);
    if (neighborCheck(simplifiedGraph)) {
      final List<Long> maxIndpSets = MaximalCliques.maximalIndependentSets(simplifiedGraph);
      for (final long maxIndpSet : maxIndpSets) {
        if (!checkTriangleCondition(simplifiedGraph, maxIndpSet)) {
          return false;
        }
      }
      final CliqueCoversIterator cci = new CliqueCoversIterator(simplifiedGraph);
      long[] cc;
      while ((cc = cci.next()) != null) {
        if (checkIncidenceCondition(cc, maxIndpSets)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1));
  }
}

