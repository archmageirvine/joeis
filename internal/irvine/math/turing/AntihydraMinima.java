package irvine.math.turing;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/**
 * Regenerate A385150 minima, without consulting the sequence's cache.
 * @author Gregory Morse
 */
public final class AntihydraMinima {

  private AntihydraMinima() { }

  /**
   * Scan disjoint ranges of starting values and print the first minima.
   * @param args last index, maximum starting value, and worker count
   * @throws InterruptedException if interrupted while awaiting a result
   * @throws ExecutionException if a worker fails
   */
  public static void main(final String[] args) throws InterruptedException, ExecutionException {
    final int last = Integer.parseInt(args[0]);
    final long maxStart = Long.parseLong(args[1]);
    final int workers = Integer.parseInt(args[2]);
    if (last < 0 || last > 10000 || maxStart < 1 || maxStart >= 1L << 61 || workers < 1 || workers > 64) {
      throw new IllegalArgumentException("Invalid finite scan bounds");
    }
    final int steps = 3 * last + 1;
    final AtomicLongArray minima = new AtomicLongArray(last + 1);
    minima.set(0, 1);
    final AtomicLong limit = new AtomicLong(maxStart);
    final AtomicLong next = new AtomicLong(2);
    final long span = 1L << 20;
    final var pool = Executors.newFixedThreadPool(workers);
    final List<Future<?>> jobs = new ArrayList<>();
    try {
      for (int worker = 0; worker < workers; ++worker) {
        jobs.add(pool.submit(() -> {
          for (long lo; !Thread.currentThread().isInterrupted() && (lo = next.getAndAdd(span)) <= limit.get();) {
            final long hi = Math.min(lo + span - 2, limit.get());
            for (long k = lo; k <= hi; k += 2) {
              final int t = Antihydra.haltingTime(k, steps);
              if (t > 0) {
                final int n = (t - 1) / 3;
                final long prior = minima.get(n);
                if (prior == 0 || k < prior) {
                  final long witness = k;
                  minima.getAndUpdate(n, old -> old == 0 || witness < old ? witness : old);
                  long bound = 0;
                  for (int i = 0; i <= last; ++i) {
                    final long v = minima.get(i);
                    if (v == 0) {
                      bound = maxStart;
                      break;
                    }
                    bound = Math.max(bound, v);
                  }
                  limit.accumulateAndGet(bound, Math::min);
                }
              }
            }
          }
        }));
      }
      // A smaller limit excludes only candidates larger than witnessed
      // starts for every requested time. All issued ranges finish first.
      for (final Future<?> job : jobs) {
        job.get();
      }
    } finally {
      pool.shutdownNow();
    }
    for (int n = 0; n <= last; ++n) {
      if (minima.get(n) == 0) {
        throw new IllegalStateException("Search bound reached before finding a minimum at " + n);
      }
      System.out.println(n + " " + minima.get(n));
    }
  }
}
