package irvine.oeis.a392;

import java.util.ArrayList;
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
 * A392406
 * @author Sean A. Irvine
 */
public class A392406 extends Sequence1 {

  // After Frederik G. Faye

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private int mN = 0;

  private static List<Integer> getRunLengths(final List<?> seq) {
    final List<Integer> res = new ArrayList<>();
    if (seq.isEmpty()) {
      return res;
    }
    Object prev = seq.get(0);
    int count = 1;
    for (int i = 1; i < seq.size(); ++i) {
      final Object cur = seq.get(i);
      if (cur.equals(prev)) {
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

  private static int getRunsResistance(final List<?> seq) {
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

  /* Determine if seq has entered a cycle */
  private static boolean stoppingCrit(final List<?> seq) {
    if (seq.size() <= 2) {
      return false;
    }
    if (!seq.get(seq.size() - 1).equals(seq.get(seq.size() - 2))) {
      return false;
    }
    final List<Integer> runLengths = getRunLengths(seq.subList(0, seq.size() - 1));
    return runLengths.size() == 1 || runLengths.get(runLengths.size() - 2) < runLengths.get(runLengths.size() - 1);
  }

  private static List<Object> getSeqUntilCycle(final List<Object> seq) {
    final int n = seq.size();
    while (!stoppingCrit(seq)) {
      seq.add(getRunsResistance(seq));
      if (seq.size() > n + 1000) {
        throw new RuntimeException("Not halting after 1000 extensions: " + seq);
      }
    }
    return seq;
  }

  private static List<Character> inverseRunLength(final int[] runLengths) {
    if (runLengths.length > ALPHABET.length()) {
      throw new IllegalArgumentException("Alphabet too short");
    }
    final List<Character> res = new ArrayList<>();
    for (int i = 0; i < runLengths.length; ++i) {
      final char c = ALPHABET.charAt(i);
      for (int k = 0; k < runLengths[i]; ++k) {
        res.add(c);
      }
    }
    return res;
  }

  private static List<List<Object>> getCases(final int[] composition) {
    final List<List<Object>> res = new ArrayList<>();
    final List<Character> genSeq = inverseRunLength(composition);
    final int next = getRunsResistance(genSeq);
    final List<Object> unequal = new ArrayList<>(genSeq);
    unequal.add(next);
    final List<Object> equal = new ArrayList<>();
    final Object last = genSeq.get(genSeq.size() - 1);
    for (final Object o : genSeq) {
      equal.add(o.equals(last) ? next : o);
    }
    equal.add(next);
    res.add(unequal);
    res.add(equal);
    return res;
  }

  private static int getExtensions(final List<Object> seedSeq, final boolean seedInclFirstExt) {
    final int seedLength = seedSeq.size();
    final List<Object> seq = new ArrayList<>(seedSeq);
    final List<Object> extended = getSeqUntilCycle(seq);
    final List<Integer> runs = getRunLengths(extended);
    final int repeating = runs.get(runs.size() - 1);
    final Object last = extended.get(extended.size() - 1);
    for (int i = 0; i < repeating; ++i) {
      extended.remove(extended.size() - 1);
    }
    extended.add(last + "s");
    final int start = seedLength - (seedInclFirstExt ? 1 : 0);
    return Math.max(0, extended.size() - start);
  }

  private List<int[]> compositions(final int n) {
    final ArrayList<int[]> res = new ArrayList<>();
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      final Permutation perm = new Permutation(p);
      int[] composition;
      while ((composition = perm.next()) != null) {
        res.add(composition.clone());
      }
    }
    return res;
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
          for (final List<Object> c : getCases(composition)) {
            final int ext = getExtensions(c, true);
            if (ext > localBest) {
              localBest = ext;
            }
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
