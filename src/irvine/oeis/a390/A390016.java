package irvine.oeis.a390;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import irvine.math.wolfram.TuringMachine;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A390016 Maximum halting time across all Wolfram 3-state 2-symbol Turning machines started with n on the tape.
 * @author Sean A. Irvine
 */
public class A390016 extends Sequence1 implements Conjectural {

  private static final int MACHINES = 2985984; // =2^12 * 3^6
  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private long mHeuristicLimit = 100;
  private int mN = 0;

  private long countSteps(final TuringMachine tm, final long input, final long maxSteps) {
    tm.initialTape(input);
    long steps = 1;
    while (tm.step() >= 0) {
      if (++steps > maxSteps) {
        return -1;
      }
    }
    return steps;
  }

  @Override
  public Z next() {
    ++mN;
    final ExecutorService exec = Executors.newFixedThreadPool(THREADS);
    final List<Callable<Long>> tasks = new ArrayList<>();

    // Split MACHINES into THREADS roughly equal chunks
    final int chunk = (MACHINES + THREADS - 1) / THREADS;
    for (int t = 0; t < THREADS; ++t) {
      final int start = t * chunk;
      final int end = Math.min(start + chunk, MACHINES);
      tasks.add(() -> {
        long localMax = 0;
        for (int machine = start; machine < end; ++machine) {
          final TuringMachine tm = new TuringMachine(machine, 3, 2);
          if (tm.neverHalts()) {
            continue;
          }
          final long steps = countSteps(tm, mN, mHeuristicLimit);
          if (steps > localMax) {
            localMax = steps;
          }
        }
        return localMax;
      });
    }

    long max = 0;
    try {
      final List<Future<Long>> results = exec.invokeAll(tasks);
      for (final Future<Long> f : results) {
        max = Math.max(max, f.get());
      }
    } catch (final InterruptedException | ExecutionException e) {
      throw new RuntimeException(e);
    } finally {
      exec.shutdown();
    }

    // Update maximum observed halt for next number
    mHeuristicLimit = Math.max(5 * max, mHeuristicLimit);
    return Z.valueOf(max);
  }
}
