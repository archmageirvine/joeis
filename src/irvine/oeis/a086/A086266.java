package irvine.oeis.a086;

import java.util.ArrayList;
import java.util.Arrays;
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
 * A086266 Triangle of counts of s-clusters in n X n (0,1)-matrices for s=0, 1, ....
 * @author Sean A. Irvine
 */
public class A086266 extends Sequence1 {

  // This code was used to compute row 6

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads", String.valueOf(Runtime.getRuntime().availableProcessors())));
  private Z[] mRow = {};
  private int mN = 0;
  private int mM = 0;

  private Z[] compute(final int n, final int threads) {
    final int order = n * n;
    final long limit = 1L << order;
    final ExecutorService executor = Executors.newFixedThreadPool(threads);
    final List<Future<long[]>> futures = new ArrayList<>();
    final long chunk = (limit + threads - 1) / threads;
    for (int t = 0; t < threads; ++t) {
      final long start = t * chunk;
      final long end = Math.min(start + chunk, limit);
      if (start >= end) {
        break;
      }
      futures.add(executor.submit(() -> {
        long[] total = new long[(n * n + 1) / 2 + 1];
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
          ++total[g.components().size() - (order - ones)];
        }
        return total;
      }));
    }
    executor.shutdown();
    Z[] total = new Z[(n * n + 1) / 2 + 1];
    Arrays.fill(total, Z.ZERO);
    try {
      for (final Future<long[]> future : futures) {
        final long[] t = future.get();
        for (int k = 0; k < t.length; ++k) {
          total[k] = total[k].add(t[k]);
        }
      }
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException(e);
    } catch (ExecutionException e) {
      throw new RuntimeException(e.getCause());
    }
    return total;
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = compute(++mN, THREADS);
      mM = 0;
    }
    return mRow[mM];
  }
}
