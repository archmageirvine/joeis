package irvine.math.lattice;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import irvine.util.string.StringUtils;

/**
 * Count the number of animals (and similar concepts) on a specified lattice.
 * @author Sean A. Irvine
 */
public class ParallelHunter {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));

  private final int mNonParallelSteps;
  private final Lattice mLattice;
  private final ArrayList<Animal> mSeeds = new ArrayList<>();

  /**
   * Construct a hunter on the specified lattice.  This works by building animals out to a
   * given distance and then completing those animals in parallel.  The
   * <code>nonParallelSteps</code> parameter controls the number of seed animals
   * calculated. Animals out to this size will be expanded single-thread and
   * then queued for parallel extension.  So this parameter should be large
   * enough that the number of seeds exceeds available cores, but not so large
   * that the number of such walks is too high or too slow.  In practice, a
   * value of about 6 seems to work well (typically several thousand animals).
   * @param nonParallelSteps number of steps to seed parallel walker with
   * @param lattice the lattice on which to generate animals
   */
  public ParallelHunter(final int nonParallelSteps, final Lattice lattice) {
    mNonParallelSteps = nonParallelSteps;
    mLattice = lattice;
  }

  /**
   * Clear any existing seeds. Necessary if called with different initial points.
   */
  public void clear() {
    mSeeds.clear();
  }

  /**
   * Return the number of animals of specified size.
   * @param steps size of animals
   * @return number of animals
   */
  public long count(final int steps) {
    // Non-parallel for small cases or for explicit single-threaded
    if (steps <= mNonParallelSteps || THREADS == 1) {
      return new Hunter(mLattice).count(steps);
    }
    // Build initial set of paths
    if (mSeeds.isEmpty()) {
      final Hunter hunter = new Hunter(mLattice);
      hunter.setKeeper(mSeeds::add);
      hunter.count(mNonParallelSteps);
      if (VERBOSE) {
        StringUtils.message("Total numbers of seeds: " + mSeeds.size());
      }
    }
    // Expand seed paths in parallel, use our own thread point to control number of threads
    final ForkJoinPool forkJoinPool = new ForkJoinPool(THREADS);
    try {
      return forkJoinPool.submit(() -> mSeeds.parallelStream()
        .mapToLong(animal -> new Hunter(mLattice)
          .count(steps, animal)).sum())
        .get();
    } catch (final InterruptedException | ExecutionException e) {
      throw new RuntimeException(e);
    }
  }
}
