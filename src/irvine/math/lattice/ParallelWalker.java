package irvine.math.lattice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import irvine.util.string.StringUtils;

/**
 * Count the number of self-avoiding walks (and similar concepts) on a specified lattice.
 * @author Sean A. Irvine
 */
public class ParallelWalker {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));

  private static class SeedWalk {
    long[] mSeeds;
    int mWeight;
    int mAxesMask;

    SeedWalk(final int weight, final int axesMask, final long[] seeds) {
      mWeight = weight;
      mAxesMask = axesMask;
      mSeeds = Arrays.copyOf(seeds, seeds.length);
    }
  }

  private final WalkerCreator mCreator;
  private final WalkerCreator mSeeder;
  private final int mNonParallelSteps;
  private final ArrayList<SeedWalk> mSeeds = new ArrayList<>();

  /**
   * Construct a walker on the specified lattice.  This works by stepping out to a
   * given distance and then completing those walks in parallel.  The
   * <code>nonParallelSteps</code> parameter controls the number of seed paths
   * calculated. Walks out to this distance will be expanded single-thread and
   * then queued for parallel extension.  So this parameter should be large
   * enough that the number of seeds exceeds available cores, but not so large
   * that the number of such walks is too high or too slow.  In practice, a
   * value of about 8 seems to work well (typically several thousand walks).
   * @param nonParallelSteps number of steps to seed parallel walker with
   * @param seeder an object capable of generate the walker used to make seed paths
   * @param creator an object capable of creating new walkers
   */
  public ParallelWalker(final int nonParallelSteps, final WalkerCreator seeder, final WalkerCreator creator) {
    mNonParallelSteps = nonParallelSteps;
    mCreator = creator;
    mSeeder = seeder;
  }

  /**
   * Construct a walker on the specified lattice.  This works by stepping out to a
   * given distance and then completing those walks in parallel.
   * @param nonParallelSteps number of steps to seed parallel walker with
   * @param creator an object capable of creating new walkers
   */
  public ParallelWalker(final int nonParallelSteps, final WalkerCreator creator) {
    this(nonParallelSteps, creator, creator);
  }

  /**
   * Clear any existing seeds. Necessary if called with different initial points.
   */
  public void clear() {
    mSeeds.clear();
  }

  /**
   * Return the number of walks of specified length.
   * @param steps length of walk
   * @param axesMask axes already considered
   * @param initialPoints any initial points shared by all walks
   * @return number of walks
   */
  public long count(final int steps, final int weight, final int axesMask, final long... initialPoints) {
    // Non-parallel for small cases or for explicit single-threaded
    if (steps <= mNonParallelSteps || THREADS == 1) {
      return mCreator.create().count(steps, weight, axesMask, initialPoints);
    }
    // Build initial set of paths
    if (mSeeds.isEmpty()) {
      final Walker walker = mSeeder.create();
      walker.setAccumulator((walk, weight1, axesMask1) -> mSeeds.add(new SeedWalk(weight1, axesMask1, walk)));
      walker.count(mNonParallelSteps, weight, axesMask, initialPoints);
      if (VERBOSE) {
        StringUtils.message("Total numbers of seeds: " + mSeeds.size());
      }
    }
    // Expand seed paths in parallel, use our own thread point to control number of threads
    final ForkJoinPool forkJoinPool = new ForkJoinPool(THREADS);
    try {
      return forkJoinPool.submit(() -> mSeeds.parallelStream()
        .mapToLong(state -> mCreator.create()
          .count(steps, state.mWeight, state.mAxesMask, state.mSeeds)).sum())
        .get();
    } catch (final InterruptedException | ExecutionException e) {
      throw new RuntimeException(e);
    }
  }

}
