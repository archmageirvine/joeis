package irvine.math.lattice;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.util.string.StringUtils;

/**
 * Count the number of self-avoiding walks (and similar concepts) on a specified lattice.
 * @author Sean A. Irvine
 */
public class ParallelWalker extends Walker {

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

  private final int mNonParallelSteps;
  private final ArrayList<Seed> mSeeds = new ArrayList<>();

  /**
   * Construct a walker on the specified lattice.
   * @param lattice underlying lattice
   */
  public ParallelWalker(final Lattice lattice, final int nonParallelSteps) {
    super(lattice);
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
    // Non-parallel for small cases
    if (steps <= mNonParallelSteps) {
      return new Walker(mLattice).count(steps, weight, axesMask, initialPoints);
    }
    // Build initial set of paths
    if (mSeeds.isEmpty()) {
      super.count(mNonParallelSteps, weight, axesMask, initialPoints);
      StringUtils.message("Total numbers of seeds: " + mSeeds.size());
    }
    // Expand seed paths in parallel
    return mSeeds.parallelStream().mapToLong(state -> new Walker(mLattice).count(steps, state.mWeight, state.mAxesMask, state.mSeeds)).sum();
    //return mSeeds.stream().mapToLong(seed -> new Walker(mLattice).count(steps, seed.mWeight, seed.mAxesMask, seed.mSeeds)).sum();
  }

  /**
   * Noddy.
   * @param args ignored
   */
  public static void main(final String[] args) {
    final SquareLattice sl = new SquareLattice();
    final ParallelWalker walker = new ParallelWalker(sl, 8);
    for (int k = 0; k < 21; ++k) {
      System.out.println(walker.count(k, 4, 1, sl.origin(), sl.toPoint(1, 0)));
    }
  }
}
