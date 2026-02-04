package irvine.oeis.a392;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A392406 allocated for Frederik G. Faye.
 * @author Sean A. Irvine
 */
public class A392406 extends Sequence1 {

  // After Frederik G. Faye

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private static final int CYCLE_LIMIT = 1000; // will exception if this is exceeded
  private int mN = 0;

  private static List<Integer> getRunLengths(final List<Integer> seq) {
    final int n = seq.size();
    if (n == 0) {
      return Collections.emptyList();
    }
    final List<Integer> res = new ArrayList<>(n); // upper bound on length
    int prev = seq.get(0);
    int count = 1;
    for (int i = 1; i < n; ++i) {
      final int cur = seq.get(i);
      if (cur == prev) {
        ++count;
      } else {
        res.add(count);
        prev = cur;
        count = 1;
      }
    }
    res.add(count);
    return res;
  }

  private static int getRunsResistance(final List<Integer> seq) {
    if (seq.size() == 1) {
      return 0;
    }
    List<Integer> runLengths = getRunLengths(seq);
    int counter = 1;
    while (runLengths.size() > 1) {
      runLengths = getRunLengths(runLengths);
      ++counter;
    }
    return counter;
  }

  private static boolean isCycle(final List<Integer> seq) {
    if (seq.size() <= 2 || !seq.get(seq.size() - 1).equals(seq.get(seq.size() - 2))) {
      return false;
    }
    final List<Integer> runLengths = getRunLengths(seq.subList(0, seq.size() - 1));
    return runLengths.size() == 1 || runLengths.get(runLengths.size() - 2) < runLengths.get(runLengths.size() - 1);
  }

  private static List<Integer> getSeqUntilCycle(final List<Integer> seq) {
    final int n = seq.size();
    while (!isCycle(seq)) {
      seq.add(getRunsResistance(seq));
      if (seq.size() > n + CYCLE_LIMIT) {
        throw new RuntimeException("Not halting after " + CYCLE_LIMIT + " extensions: " + seq);
      }
    }
    return seq;
  }

  private static List<Integer> inverseRunLength(final int[] runLengths) {
    final List<Integer> res = new ArrayList<>();
    // Used negative numbers as symbols to avoid conflicts with run lengths
    int symbol = -1;
    for (final int len : runLengths) {
      for (int i = 0; i < len; ++i) {
        res.add(symbol);
      }
      --symbol;
    }
    return res;
  }

  private static int getExtensions(final List<Integer> seedSeq) {
    final int seedLength = seedSeq.size();
    final List<Integer> seq = new ArrayList<>(seedSeq);
    final List<Integer> extended = getSeqUntilCycle(seq);
    final List<Integer> runs = getRunLengths(extended);
    final int repeating = runs.get(runs.size() - 1);
    final int compressedLength = extended.size() - (repeating - 1);
    return Math.max(0, compressedLength - (seedLength - 1));
  }

  private static int getMaxForComposition(final int[] composition) {
    final List<Integer> base = inverseRunLength(composition);
    final int next = getRunsResistance(base);
    final List<Integer> work = new ArrayList<>(base.size() + 1);
    work.addAll(base);
    work.add(next);
    final int w = getExtensions(work);
    // Mutate work in-place instead of allocating a new list
    final int last = base.get(base.size() - 1);
    for (int i = 0; i < base.size(); ++i) {
      if (base.get(i) == last) {
        work.set(i, next);
      }
    }
    // Last element already == next
    return Math.max(w, getExtensions(work));
  }

  private List<int[]> partitions(final int n) {
    final ArrayList<int[]> res = new ArrayList<>();
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      res.add(p.clone());
    }
    return res;
  }

  @Override
  public Z next() {
    ++mN;
    final ExecutorService executor = Executors.newFixedThreadPool(THREADS);
    final List<int[]> partitions = partitions(mN);
    final AtomicInteger best = new AtomicInteger(0);
    for (final int[] partition : partitions) {
      executor.submit(() -> {
        int localBest = 0;
        final Permutation perm = new Permutation(partition);
        int[] composition;
        while ((composition = perm.next()) != null) {
          final int ext = getMaxForComposition(composition);
          if (ext > localBest) {
            localBest = ext;
          }
        }
        best.accumulateAndGet(localBest, Math::max);
      });
    }
    executor.shutdown();
    try {
      // Ten years!
      if (!executor.awaitTermination(3650, TimeUnit.DAYS)) {
        throw new RuntimeException("Timeout");
      }
    } catch (final InterruptedException e) {
      Thread.currentThread().interrupt();  // Restore interrupt status
      throw new RuntimeException(e);
    }
    return Z.valueOf(best.get());
  }
}
