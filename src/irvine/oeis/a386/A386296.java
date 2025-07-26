package irvine.oeis.a386;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Triple;
import irvine.util.string.StringUtils;

/**
 * A386296 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A386296 extends AbstractSequence {

  // General strategy used here:
  //  1. Compute all possible cuboids with dimensions in [1..n]
  //  2. Compute all possible orientations of those cuboids (for later convenience)
  //  3. Iteratively generate combinations of cuboids from 1 that sum to a volume of n^3
  //  4. For each such combination, use backtracking to determined if it can physically pack the cube.
  //
  // For k < 4 faster approaches exist (see A381847).

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));

  private static final class Cuboid implements Comparable<Cuboid> {
    private final int[] mTriple;
    private final int mVolume;

    private Cuboid(final int... triple) {
      mTriple = Arrays.copyOf(triple, triple.length);
      Arrays.sort(mTriple);
      mVolume = Functions.PRODUCT.i(triple);
    }

    public int getVolume() {
      return mVolume;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Cuboid)) {
        return false;
      }
      return Arrays.equals(mTriple, ((Cuboid) obj).mTriple);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mTriple);
    }

    @Override
    public String toString() {
      return Arrays.toString(mTriple);
    }

    @Override
    public int compareTo(final Cuboid other) {
      final int c = Integer.compare(mVolume, other.mVolume);
      if (c != 0) {
        return c;
      }
      return Arrays.compare(mTriple, other.mTriple);
    }
  }

  private static final class Packer {
    private final int mN;
    private final List<List<int[]>> mOrientations;
    private boolean[][][] mOccupied;
    private int[][] mEmptyPositions;

    private Packer(final int n, final List<Cuboid> cuboids) {
      mN = n;
      mOrientations = buildOrientations(cuboids);
    }

    private List<List<int[]>> buildOrientations(final List<Cuboid> cuboids) {
      final ArrayList<List<int[]>> lst = new ArrayList<>();
      for (final Cuboid c : cuboids) {
        final HashSet<Triple<Integer>> h = new HashSet<>();
        final int x = c.mTriple[0];
        final int y = c.mTriple[1];
        final int z = c.mTriple[2];
        h.add(new Triple<>(x, y, z));
        h.add(new Triple<>(x, z, y));
        h.add(new Triple<>(y, x, z));
        h.add(new Triple<>(y, z, x));
        h.add(new Triple<>(z, x, y));
        h.add(new Triple<>(z, y, x));
        final ArrayList<int[]> cl = new ArrayList<>();
        for (final Triple<Integer> t : h) {
          cl.add(new int[] {t.left(), t.mid(), t.right()});
        }
        lst.add(cl);
      }
      return lst;
    }

    private int[] findFirstEmpty(final int depth) {
      final int x0 = mEmptyPositions[depth][0], y0 = mEmptyPositions[depth][1], z0 = mEmptyPositions[depth][2];
      for (int z = z0; z < mN; z++) {
        for (int y = (z == z0 ? y0 : 0); y < mN; y++) {
          for (int x = (z == z0 && y == y0 ? x0 : 0); x < mN; x++) {
            if (!mOccupied[x][y][z]) {
              mEmptyPositions[depth + 1][0] = x;
              mEmptyPositions[depth + 1][1] = y;
              mEmptyPositions[depth + 1][2] = z;
              return new int[] {x, y, z};
            }
          }
        }
      }
      return null;
    }

    private boolean fits(final int x, final int y, final int z, final int dx, final int dy, final int dz) {
      return x + dx <= mN && y + dy <= mN && z + dz <= mN;
    }

    private boolean canPlace(final int x0, final int y0, final int z0, final int dx, final int dy, final int dz) {
      if (mOccupied[x0 + dx - 1][y0 + dy - 1][z0 + dz - 1]) {
        return false;
      }
      for (int x = x0; x < x0 + dx; ++x) {
        for (int y = y0; y < y0 + dy; ++y) {
          for (int z = z0; z < z0 + dz; ++z) {
            if (mOccupied[x][y][z]) {
              return false;
            }
          }
        }
      }
      return true;
    }

    private void place(final int x0, final int y0, final int z0, final int dx, final int dy, final int dz, final boolean value) {
      for (int x = x0; x < x0 + dx; ++x) {
        for (int y = y0; y < y0 + dy; ++y) {
          for (int z = z0; z < z0 + dz; ++z) {
            mOccupied[x][y][z] = value;
          }
        }
      }
    }

    private boolean isCornerPlacement(int x, int y, int z, int dx, int dy, int dz) {
      return (x == 0 || x + dx == mN) && (y == 0 || y + dy == mN) && (z == 0 || z + dz == mN);
    }

    private boolean backtrack(final int[] cuboids, final long usedCuboids, final int firstCuboid, final int depth) {

      final int[] cell = findFirstEmpty(depth);
      if (cell == null) {
        return true; // all cells filled
      }

      final int x0 = cell[0];
      final int y0 = cell[1];
      final int z0 = cell[2];

      for (int i = 0; i < cuboids.length; ++i) {
        if ((usedCuboids & (1L << i)) == 0) {
          for (final int[] orient : mOrientations.get(cuboids[i])) {
            final int dx = orient[0];
            final int dy = orient[1];
            final int dz = orient[2];
            if (fits(x0, y0, z0, dx, dy, dz)) {
              if (i < firstCuboid && isCornerPlacement(x0, y0, z0, dx, dy, dz)) {
                // This cuboid was previously tried in a corner and no solution was found,
                // so there is no point in trying it in such a placement now.
                continue;
              }
              if (canPlace(x0, y0, z0, dx, dy, dz)) {
                place(x0, y0, z0, dx, dy, dz, true);
                if (backtrack(cuboids, usedCuboids | (1L << i), depth == 0 ? i : firstCuboid, depth + 1)) {
                  return true;
                }
                place(x0, y0, z0, dx, dy, dz, false);
              }
            }
            if (usedCuboids == 0) {
              break; // If placing the first cuboid, by symmetry, we need only consider one orientation
            }
          }
        }
      }
      return false; // no valid placement found
    }

    private boolean canPack(final int[] cuboids) {
      mOccupied = new boolean[mN][mN][mN];
      mEmptyPositions = new int[cuboids.length + 1][3];
      return backtrack(cuboids, 0, 0, 0);
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mM = 0;
  private List<Cuboid> mCuboids = null;
  private AtomicLong mPrepackCount = null;
  private AtomicLong mCount = null;

  protected A386296(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A386296() {
    this(1);
  }

  private List<Cuboid> buildCuboids(final int n) {
    final List<Cuboid> cuboids = new ArrayList<>();
    for (int x = 1; x <= n; ++x) {
      for (int y = x; y <= n; ++y) {
        for (int z = y; z <= n; ++z) {
          cuboids.add(new Cuboid(x, y, z));
        }
      }
    }
    Collections.sort(cuboids);
    return cuboids;
  }

  protected int getDefect(final int[] set) {
    int min = Integer.MAX_VALUE;
    int max = 0;
    for (final int s : set) {
      final Cuboid cuboid = mCuboids.get(s);
      final int vol = cuboid.getVolume();
      min = Math.min(min, vol);
      max = Math.max(max, vol);
    }
    return max - min;
  }

  /**
   * Called with each potential set of cuboids with correct volume sum,
   * not necessarily a valid packing.
   * @param set the partition indexes
   * @return true if processing should continue
   */
  protected boolean accept(final int[] set) {
    return true;
  }

  /**
   * Called with each valid partition of the cube.
   * @param set the partition indexes
   */
  protected void process(final int[] set) {
  }

  private static String describe(final List<Cuboid> cuboids, final int[] set) {
    final StringBuilder sb = new StringBuilder();
    for (final int s : set) {
      if (sb.length() > 0) {
        sb.append(", ");
      }
      sb.append(cuboids.get(s));
    }
    return sb.toString().replace('[', '(').replace(']', ')');
  }

  private void search(final Packer packer, final int[] set, final int remainingArea, final int remainingCuboids, final int k) {
    if (remainingCuboids == 0) {
      if (remainingArea == 0) {
        mPrepackCount.incrementAndGet();
        if (accept(set) && packer.canPack(set)) {
          if (mVerbose) {
            StringUtils.message(describe(mCuboids, set));
          }
          process(set); // Let subclasses do their own thing with this set
          mCount.incrementAndGet();
        }
      }
      return;
    }
    if (remainingArea == 0) {
      return;
    }
    int j = k;
    while (--j >= 0) {
      final int v = mCuboids.get(j).getVolume();
      if (v * remainingCuboids < remainingArea) {
        break; // Not enough volume in remaining available cuboids
      }
      if (v <= remainingArea) {
        set[set.length - remainingCuboids] = j;
        search(packer, set, remainingArea - v, remainingCuboids - 1, j);
      }
    }
  }

  protected Z t(final int n, final int m) {
    mPrepackCount = new AtomicLong();
    mCount = new AtomicLong();
    mCuboids = buildCuboids(n);
    if (mVerbose) {
      StringUtils.message("Computing: cube-size=" + n + " cuboids=" + m + " possible-cuboids=" + mCuboids.size() + " using " + THREADS + " threads");
    }
    final ExecutorService executor = Executors.newFixedThreadPool(THREADS);
    final int n3 = Z.valueOf(n).pow(3).intValueExact();
    for (int t = 0; t < THREADS; t++) {
      final int threadId = t;
      executor.submit(() -> {
        final Packer packer = new Packer(n, mCuboids);
        for (int top = mCuboids.size() - 1 - threadId; top >= 0; top -= THREADS) {
          final int[] set = new int[m];
          set[0] = top;
          search(packer, set, n3 - mCuboids.get(top).getVolume(), m - 1, top);
        }
      });
    }
    executor.shutdown();
    try {
      if (!executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS)) {
        throw new RuntimeException("Timeout");
      }
    } catch (final InterruptedException e) {
      Thread.currentThread().interrupt();  // Restore interrupt status
      throw new RuntimeException(e);
    }
    if (mVerbose) {
      StringUtils.message("n=" + n + " m=" + m + " pre-packing count=" + mPrepackCount);
    }
    return Z.valueOf(mCount.get());
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM);
  }

  /**
   * Run a particular case directly.
   * @param args n k
   */
  public static void main(final String[] args) {
    final A386296 s = new A386296();
    System.out.println(s.t(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
  }
}

