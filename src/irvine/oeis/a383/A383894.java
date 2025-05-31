package irvine.oeis.a383;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A383894 Number of arborescent partitions with exactly n parts.
 * @author Sean A. Irvine
 */
public class A383894 extends ParallelGenerateGraphsSequence {

  private static final Set<String> ARBORESCENT_PARTITIONS = Collections.synchronizedSet(new HashSet<>());

  private static void arborescentPartition(final Graph g, final int root, final List<Integer> p) {
    // This is not a particularly efficient way of generating the partition
    p.add(GraphUtils.markAll(g, new boolean[g.order()], root));
    for (int u = g.nextVertex(root, -1); u >= 0; u = g.nextVertex(root, u)) {
      // Temporarily disconnect the edge
      g.removeEdge(root, u);
      arborescentPartition(g, u, p);
      // Reconnect
      g.addEdge(root, u);
    }
  }

  private static String arborescentPartition(final Graph g, final int root) {
    final ArrayList<Integer> p = new ArrayList<>();
    arborescentPartition(g, root, p);
    Collections.sort(p);
    return p.toString();
  }

  /** Construct the sequence. */
  public A383894() {
    super(0, 0, 0, () -> graph -> {
      // Try rooting the tree at each vertex in turn
      int cnt = 0;
      for (int k = 0; k < graph.order(); ++k) {
        if (ARBORESCENT_PARTITIONS.add(arborescentPartition(graph, k))) {
          ++cnt;
        }
      }
      return cnt;
    });
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN - 1);
    gg.setMinDeg(0);
    gg.setMaxDeg(mN);
    gg.setConnectionLevel(1);
  }

  @Override
  public Z next() {
    ARBORESCENT_PARTITIONS.clear();
    return super.next();
  }
}
