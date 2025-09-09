package irvine.oeis.a385;

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
import irvine.util.Pair;
import irvine.util.string.StringUtils;

/**
 * A385240 Array read by descending antidiagonals: T(n,k) is the number of k element sets of noncongruent integer sided rectangles that fill an n X n square.
 * @author Sean A. Irvine
 */
public class A385240 extends AbstractSequence {

  // Cf. A386296

  // General strategy used here:
  //  1. Compute all possible rectangles with dimensions in [1..n]
  //  2. Compute all possible orientations of those rectangles (for later convenience)
  //  3. Iteratively generate combinations of rectangles from 1 that sum to a volume of n^3
  //  4. For each such combination, use backtracking to determined if it can physically pack the cube.
  //
  // For k < 4 faster approaches exist (see A381847).

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));

  protected static final class Rectangle implements Comparable<Rectangle> {
    private final int[] mPair;
    private final int mArea;

    /**
     * Construct a rectangle.
     * @param pair two dimensions
     */
    public Rectangle(final int... pair) {
      mPair = Arrays.copyOf(pair, pair.length);
      Arrays.sort(mPair);
      mArea = Functions.PRODUCT.i(pair);
    }

    public int getArea() {
      return mArea;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Rectangle)) {
        return false;
      }
      return Arrays.equals(mPair, ((Rectangle) obj).mPair);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mPair);
    }

    @Override
    public String toString() {
      return Arrays.toString(mPair);
    }

    @Override
    public int compareTo(final Rectangle other) {
      final int c = Integer.compare(mArea, other.mArea);
      if (c != 0) {
        return c;
      }
      return Arrays.compare(mPair, other.mPair);
    }
  }

  private static final class Packer {
    private final int mN;
    private final List<List<int[]>> mOrientations;
    private boolean[][] mOccupied;
    private int[][] mEmptyPositions;

    private Packer(final int n, final List<Rectangle> rectangles) {
      mN = n;
      mOrientations = buildOrientations(rectangles);
    }

    private List<List<int[]>> buildOrientations(final List<Rectangle> rectangles) {
      final ArrayList<List<int[]>> lst = new ArrayList<>();
      for (final Rectangle c : rectangles) {
        final HashSet<Pair<Integer, Integer>> h = new HashSet<>();
        final int x = c.mPair[0];
        final int y = c.mPair[1];
        h.add(new Pair<>(x, y));
        h.add(new Pair<>(y, x));
        final ArrayList<int[]> cl = new ArrayList<>();
        for (final Pair<Integer, Integer> t : h) {
          cl.add(new int[] {t.left(), t.right()});
        }
        lst.add(cl);
      }
      return lst;
    }

    private int[] findFirstEmpty(final int depth) {
      final int x0 = mEmptyPositions[depth][0], y0 = mEmptyPositions[depth][1], z0 = mEmptyPositions[depth][2];
      for (int z = z0; z < mN; z++) {
        for (int y = z == z0 ? y0 : 0; y < mN; y++) {
          for (int x = z == z0 && y == y0 ? x0 : 0; x < mN; x++) {
            if (!mOccupied[x][y]) {
              mEmptyPositions[depth + 1][0] = x;
              mEmptyPositions[depth + 1][1] = y;
              return new int[] {x, y, z};
            }
          }
        }
      }
      return null;
    }

    private boolean fits(final int x, final int y, final int dx, final int dy) {
      return x + dx <= mN && y + dy <= mN;
    }

    private boolean canPlace(final int x0, final int y0, final int dx, final int dy) {
      if (mOccupied[x0 + dx - 1][y0 + dy - 1]) {
        return false;
      }
      for (int x = x0; x < x0 + dx; ++x) {
        for (int y = y0; y < y0 + dy; ++y) {
          if (mOccupied[x][y]) {
            return false;
          }
        }
      }
      return true;
    }

    private void place(final int x0, final int y0, final int dx, final int dy, final boolean value) {
      for (int x = x0; x < x0 + dx; ++x) {
        for (int y = y0; y < y0 + dy; ++y) {
          mOccupied[x][y] = value;
        }
      }
    }

    private boolean isCornerPlacement(final int x, final int y, final int dx, final int dy) {
      return (x == 0 || x + dx == mN) && (y == 0 || y + dy == mN);
    }

    private boolean backtrack(final int[] rectangles, final long usedCuboids, final int firstCuboid, final int depth) {

      final int[] cell = findFirstEmpty(depth);
      if (cell == null) {
        return true; // all cells filled
      }

      final int x0 = cell[0];
      final int y0 = cell[1];

      for (int i = 0; i < rectangles.length; ++i) {
        if ((usedCuboids & (1L << i)) == 0) {
          for (final int[] orient : mOrientations.get(rectangles[i])) {
            final int dx = orient[0];
            final int dy = orient[1];
            if (fits(x0, y0, dx, dy)) {
              if (i < firstCuboid && isCornerPlacement(x0, y0, dx, dy)) {
                // This rectangle was previously tried in a corner and no solution was found,
                // so there is no point in trying it in such a placement now.
                continue;
              }
              if (canPlace(x0, y0, dx, dy)) {
                place(x0, y0, dx, dy, true);
                if (backtrack(rectangles, usedCuboids | (1L << i), depth == 0 ? i : firstCuboid, depth + 1)) {
                  return true;
                }
                place(x0, y0, dx, dy, false);
              }
            }
            if (usedCuboids == 0) {
              break; // If placing the first rectangle, by symmetry, we need only consider one orientation
            }
          }
        }
      }
      return false; // no valid placement found
    }

    private boolean canPack(final int[] rectangles) {
      mOccupied = new boolean[mN][mN];
      mEmptyPositions = new int[rectangles.length + 1][3];
      return backtrack(rectangles, 0, 0, 0);
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mM = 0;
  private List<Rectangle> mRectangles = null;
  private AtomicLong mPrepackCount = null;
  private AtomicLong mCount = null;

  protected A385240(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A385240() {
    this(1);
  }

  protected List<Rectangle> buildRectangles(final int n) {
    final List<Rectangle> rectangles = new ArrayList<>();
    for (int x = 1; x <= n; ++x) {
      for (int y = x; y <= n; ++y) {
        rectangles.add(new Rectangle(x, y));
      }
    }
    Collections.sort(rectangles);
    return rectangles;
  }

//  protected int getDefect(final int[] set) {
//    int min = Integer.MAX_VALUE;
//    int max = 0;
//    for (final int s : set) {
//      final Rectangle rectangle = mRectangles.get(s);
//      final int vol = rectangle.getArea();
//      min = Math.min(min, vol);
//      max = Math.max(max, vol);
//    }
//    return max - min;
//  }
//
//  // Used by A387040
//  protected boolean isDistinctVolumes(final int[] set) {
//    for (int k = 1; k < set.length; ++k) {
//      final int v = mRectangles.get(set[k]).getArea();
//      for (int j = 0; j < k; ++j) {
//        if (mRectangles.get(set[j]).getArea() == v) {
//          return false;
//        }
//      }
//    }
//    return true;
//  }

  /**
   * Called with each potential set of rectangles with correct volume sum,
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

  private static String describe(final List<Rectangle> rectangles, final int[] set) {
    final StringBuilder sb = new StringBuilder();
    for (final int s : set) {
      if (sb.length() > 0) {
        sb.append(", ");
      }
      sb.append(rectangles.get(s));
    }
    return sb.toString().replace('[', '(').replace(']', ')');
  }

  private void search(final int n, final int min, final Packer packer, final int[] set, final int remainingArea, final int remainingCuboids, final int k) {
    if (remainingCuboids == 0) {
      if (remainingArea == 0) {
        mPrepackCount.incrementAndGet();
        if (accept(set) && packer.canPack(set)) {
          if (mVerbose) {
            StringUtils.message(describe(mRectangles, set));
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
      final Rectangle rectangle = mRectangles.get(j);
      if (rectangle.mPair[0] + min > n) {
        continue; // Incompatible pair
      }
      final int v = rectangle.getArea();
      if (v * remainingCuboids < remainingArea) {
        break; // Not enough volume in remaining available rectangles
      }
      if (v <= remainingArea) {
        set[set.length - remainingCuboids] = j;
        search(n, min, packer, set, remainingArea - v, remainingCuboids - 1, j);
      }
    }
  }

  protected Z t(final int n, final int m) {
    mPrepackCount = new AtomicLong();
    mCount = new AtomicLong();
    mRectangles = buildRectangles(n);
    if (mVerbose) {
      StringUtils.message("Computing: square-size=" + n + " rectangles=" + m + " possible-rectangles=" + mRectangles.size() + " using " + THREADS + " threads");
    }
    final ExecutorService executor = Executors.newFixedThreadPool(THREADS);
    final int n2 = Z.valueOf(n).square().intValueExact();
    for (int t = 0; t < THREADS; ++t) {
      final int threadId = t;
      executor.submit(() -> {
        final Packer packer = new Packer(n, mRectangles);
        for (int top = mRectangles.size() - 1 - threadId; top >= 0; top -= THREADS) {
          final int[] set = new int[m];
          set[0] = top;
          search(n, mRectangles.get(top).mPair[0], packer, set, n2 - mRectangles.get(top).getArea(), m - 1, top);
        }
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
    final A385240 s = new A385240();
    System.out.println(s.t(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
  }
}

