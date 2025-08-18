package irvine.oeis.a385;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.graph.MaximalCliques;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A385156 The number of undirected, simple, unlabeled graphs G on n vertices which are prime, not split, and do not contain a vertex of degree 1 in G or in the complement of G, and has no induced P5 in G or in the complement of G.
 * @author Sean A. Irvine
 */
public class A385156 extends ParallelGenerateGraphsSequence {

  private static boolean isIndependent(final Graph graph, final Z set) {
    // Note set is complement here, check complement of set is independent
    final int n = graph.order();
    for (int u = 0; u < n; ++u) {
      if (!set.testBit(u)) {
        for (int v = graph.nextVertex(u, u); v >= 0; v = graph.nextVertex(u, v)) {
          if (!set.testBit(v)) {
            return false;
          }
        }
      }
    }
    return true;
  }

  private static boolean isSplit(final Graph graph) {
    for (final Z clique : MaximalCliques.maximalCliques(graph)) {
      if (isIndependent(graph, clique)) {
        return true;
      }
    }
    return false;
  }

  private static boolean isComplementDegreeOk(final Graph graph) {
    // Check that the complement would have no vertex of degree 1
    final int n = graph.order();
    for (int u = 0; u < graph.order(); ++u) {
      if (graph.degree(u) == n - 2) {
        return false;
      }
    }
    return true;
  }

  /** Construct the sequence. */
  public A385156() {
    // House is complement of P5
    super(0, 0, 0, () -> graph -> isComplementDegreeOk(graph) && GraphUtils.p5Free(graph) && GraphUtils.houseFree(graph) && GraphUtils.isPrime(graph) && !isSplit(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(2);
    gg.setMaxDeg(mN - 1);
    gg.setConnectionLevel(1);
  }
}
