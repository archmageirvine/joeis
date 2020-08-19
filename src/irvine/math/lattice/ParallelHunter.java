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
  private final boolean mForbidden;
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
   * @param forbidden should forbidden handling be enabled (use true unless you know what you are doing)
   */
  public ParallelHunter(final int nonParallelSteps, final Lattice lattice, final boolean forbidden) {
    mNonParallelSteps = nonParallelSteps;
    mLattice = lattice;
    mForbidden = forbidden;
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
      return new Hunter(mLattice, mForbidden).count(steps);
    }
    // Build initial set of paths
    if (mSeeds.isEmpty()) {
      final Hunter hunter = new Hunter(mLattice, mForbidden);
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
        .mapToLong(animal -> new Hunter(mLattice, mForbidden)
          .count(steps, animal)).sum())
        .get();
    } catch (final InterruptedException | ExecutionException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Noddy for testing.
   * @param args ignored
   */
  public static void main(final String[] args) {
    //final Lattice l = new SquareLattice();
    final Lattice l = Lattices.Z5;
    final ParallelHunter h = new ParallelHunter(4, l, true);
    for (int k = 0; k < 14; ++k) {
      System.out.println(k + " " + h.count(k));
    }
  }

}

