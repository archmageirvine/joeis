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
public class ParallelWalker extends Walker {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));

  private static class Seed {

    long[] mSeeds;
    int mWeight;
    int mAxesMask;

    private Seed(final int weight, final int axesMask, final long[] seeds) {
      mWeight = weight;
      mAxesMask = axesMask;
      mSeeds = Arrays.copyOf(seeds, seeds.length);
    }
  }

  private final WalkerCreator mCreator;
  private final int mNonParallelSteps;
  private final ArrayList<Seed> mSeeds = new ArrayList<>();

  /**
   * Construct a walker on the specified lattice.  This works by stepping out to a
   * given distance and then completing those walks in parallel.
   * @param creator an object capable of creating new walkers
   * @param lattice underlying lattice
   * @param nonParallelSteps number of steps to seed parallel walker with
   */
  public ParallelWalker(final WalkerCreator creator, final Lattice lattice, final int nonParallelSteps) {
    super(lattice);
    mCreator = creator;
    mNonParallelSteps = nonParallelSteps;
  }

  @Override
  protected void count(final int weight, final int axesMask) {
    mSeeds.add(new Seed(weight, axesMask, mWalk));
  }

  /**
   * Return the number of walks of specified length.
   * @param steps length of walk
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
      super.count(mNonParallelSteps, weight, axesMask, initialPoints);
      if (VERBOSE) {
        StringUtils.message("Total numbers of seeds: " + mSeeds.size());
      }
    }
    // Expand seed paths in parallel, use our own thread point to control number of threads
    ForkJoinPool forkJoinPool = new ForkJoinPool(THREADS);
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
