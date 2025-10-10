package irvine.oeis.a081;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.group.GaloisField;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A081080 Number of n X n ortho-projection matrices over GF(2). Also, the number of labeled ortho-projection graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A081080 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A081080() {
    super(0, 0, 0, () -> graph -> {
      //System.out.println("Graph: " + graph);
      final int n = graph.order();
      // Convert to adjacency matrix
      final MatrixRing<Z> ring = new MatrixRing<>(n, new GaloisField(2));
      final DefaultMatrix<Z> m = new DefaultMatrix<>(n, n, Z.ZERO);
      for (int u = 0; u < n; ++u) {
        for (int v = graph.nextVertex(u, -1); v >= 0; v = graph.nextVertex(u, v)) {
          m.set(u, v, Z.ONE);
        }
      }
      long cnt = 0;
      // Add loops in all possible ways
      final HashSet<Graph> set = new HashSet<>();
      for (long s = 0; s < 1L << n; ++s) {
        final Graph g = graph.copy();
        long t = s;
        for (int k = 0; t != 0; ++k, t >>>= 1) {
          if ((t & 1) == 1) {
            g.addEdge(k, k);
          }
        }
        // Check if this is a new graph
        if (set.add(GraphUtils.canon(g))) {
          for (int u = 0; u < n; ++u) {
            m.set(u, u, g.degree(u) > graph.degree(u) ? Z.ONE : Z.ZERO);
          }
          if (ring.isIdempotent(m)) {
            cnt += Functions.FACTORIAL.z(n).divide(GraphUtils.automorphismSize(g)).longValueExact();
          }
        }
      }
      return cnt;
    });
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(0);
  }
}
