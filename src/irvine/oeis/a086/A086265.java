package irvine.oeis.a086;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086265 Total number of s-clusters in all n X n (0,1)-matrices.
 * @author Sean A. Irvine
 */
public class A086265 extends Sequence1 {

  // This code was used to compute a(6)

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads", String.valueOf(Runtime.getRuntime().availableProcessors())));
  private int mN = 0;

  private Z compute(final int n, final int threads) {
    final int order = n * n;
    final long limit = 1L << order;
    final ExecutorService executor = Executors.newFixedThreadPool(threads);
    final List<Future<Z>> futures = new ArrayList<>();
    final long chunk = (limit + threads - 1) / threads;
    for (int t = 0; t < threads; ++t) {
      final long start = t * chunk;
      final long end = Math.min(start + chunk, limit);
      if (start >= end) {
        break;
      }
      futures.add(executor.submit(() -> {
        Z total = Z.ZERO;
        for (long mask = start; mask < end; ++mask) {
          final Graph g = GraphFactory.create(order);
          for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
              final int v = i * n + j;
              if (((mask >>> v) & 1) == 0) {
                continue;
              }
              if (j + 1 < n && ((mask >>> (v + 1)) & 1) != 0) {
                g.addEdge(v, v + 1);
              }
              if (i + 1 < n && ((mask >>> (v + n)) & 1) != 0) {
                g.addEdge(v, v + n);
              }
            }
          }
          final int ones = Long.bitCount(mask);
          total = total.add(g.components().size() - (order - ones));
        }
        return total;
      }));
    }
    executor.shutdown();
    Z total = Z.ZERO;
    try {
      for (final Future<Z> future : futures) {
        total = total.add(future.get());
      }
    } catch (final InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException(e);
    } catch (final ExecutionException e) {
      throw new RuntimeException(e.getCause());
    }
    return total;
  }

  @Override
  public Z next() {
    ++mN;
    return compute(mN, THREADS).makeOdd();
  }
}
