package irvine.oeis.a081;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A081809 Number n-cyclic graphs.
 * @author Sean A. Irvine
 */
public class A081809 extends Sequence3 {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private int mN = 2;

  private Collection<Graph> process(final Graph g, final int k) {
    final HashSet<Graph> res = new HashSet<>();
    for (int u = 0; u < k; ++u) {
      for (int v = u + 1; v < k; ++v) {
        if (!g.isAdjacent(u, v)) { // Avoid introducing self-loops
          res.add(GraphUtils.canon(g.contraction(u, v)));
        }
      }
    }
    return res;
  }

  @Override
  public Z next() {
    final ForkJoinPool pool = new ForkJoinPool(THREADS);
    Collection<Graph> graphs = Collections.singletonList(GraphFactory.cycle(++mN));
    Z count = Z.ONE;
    // Each iteration here reduces the number of vertices by 1
    for (int k = mN; k > 2; --k) {
      final int j = k;
      final Collection<Graph> current = graphs;
      graphs = pool.submit(() -> current
        .parallelStream()
        .flatMap(g -> process(g, j).stream())
        .collect(Collectors.toSet())
      ).join();
      count = count.add(graphs.size());
    }
    pool.shutdown();
    return count;
  }
}
