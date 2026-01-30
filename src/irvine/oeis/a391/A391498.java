package irvine.oeis.a391;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.string.StringUtils;
import jmason.poly.CoordSet2T;

/**
 * A391498 a(n) is the number of five element sets of distinct integer-sided trapezoids whose base angles are 60 degrees that fill an equilateral triangular grid of side n units.
 * @author Sean A. Irvine
 */
public class A391498 extends AbstractSequence {

  // todo WIP - generate trapezoid combinations is running
  // todo orientations and packing still need to be done
  // todo note currently packer must throw an Exception at some point

  // General strategy used here:
  //  1. Compute all possible trapezoids with dimensions in [1..n]
  //  2. Compute all possible orientations of those trapezoids (for later convenience)
  //  3. Iteratively generate combinations of trapezoids from 1 that sum to an area of n^2
  //  4. For each such combination, use backtracking to determined if it can physically pack the grid.

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));

  // todo fix access
  public static final class Trapezoid implements Comparable<Trapezoid> {
    final int mBase;
    final int mHeight;
    private final int mArea;

    /**
     * Construct a trapezoid.
     * @param base base (in grid units)
     * @param height height (in 60 degree grid units)
     */
    public Trapezoid(final int base, final int height) {
      mBase = base;
      mHeight = height;
      mArea = base * base - (base - height) * (base - height);
    }

    public int getArea() {
      return mArea;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Trapezoid)) {
        return false;
      }
      final Trapezoid t = (Trapezoid) obj;
      return mBase == t.mBase && mHeight == t.mHeight;
    }

    @Override
    public int hashCode() {
      return 65537 * mBase + mHeight;
    }

    @Override
    public String toString() {
      return "(" + mBase + "," + mHeight + ")";
    }

    @Override
    public int compareTo(final Trapezoid other) {
      final int c = Integer.compare(mArea, other.mArea);
      if (c != 0) {
        return c;
      }
      return Integer.compare(mBase, other.mBase);
    }

    private CoordSet2T canonicalOrientation() {
      final int a = getArea();
      final CoordSet2T cs = new CoordSet2T(a, true, false, false);
      int k = 0;
      for (int y = 0; y < mHeight; ++y) {
        final int startX = 2 * y;
        for (int x = 0; x < mBase - y; ++x) {
          cs.setTriangle(k++, startX + 2 * x + 1, 2 * -y, 0);
        }
        for (int x = 0; x < mBase - y - 1; ++x) {
          cs.setTriangle(k++, startX + 2 * x + 2, 2 * -y, 0);
        }
      }
      assert k == a;
      return cs;
    }
  }

  private static final class Packer {
    private final int mN;
    private final List<Trapezoid> mTrapezoids;
    private boolean[][] mOccupied;
    private int[][] mEmptyPositions;

    private Packer(final int n, final List<Trapezoid> trapezoids) {
      mN = n;
      mTrapezoids = trapezoids;
    }

    private boolean canPack(final int[] trapezoids) {
      final List<Trapezoid> lst = new ArrayList<>();
      for (final int v : trapezoids) {
        lst.add(mTrapezoids.get(v));
      }
      return false; // todo
//      final TriangleTrapezoidPacker p = new TriangleTrapezoidPacker(mN, lst);
//      return p.canPack();
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mM = 0;
  private List<Trapezoid> mTrapezoids = null;
  private AtomicLong mPrepackCount = null;
  private AtomicLong mCount = null;

  protected A391498(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A391498() {
    this(1);
  }

  protected List<Trapezoid> buildTrapezoids(final int n) {
    final List<Trapezoid> trapezoids = new ArrayList<>();
    for (int height = 1; height <= n; ++height) {
      for (int base = height + 1; base <= n; ++base) { // height + 1 to avoid equilateral triangles
        trapezoids.add(new Trapezoid(base, height));
      }
    }
    Collections.sort(trapezoids);
    return trapezoids;
  }

  protected int getDefect(final int[] set) {
    int min = Integer.MAX_VALUE;
    int max = 0;
    for (final int s : set) {
      final Trapezoid trapezoid = mTrapezoids.get(s);
      final int area = trapezoid.getArea();
      min = Math.min(min, area);
      max = Math.max(max, area);
    }
    return max - min;
  }

  // Used by A387040
  protected boolean isDistinctVolumes(final int[] set) {
    for (int k = 1; k < set.length; ++k) {
      final int v = mTrapezoids.get(set[k]).getArea();
      for (int j = 0; j < k; ++j) {
        if (mTrapezoids.get(set[j]).getArea() == v) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Called with each potential set of trapezoids with correct area sum,
   * not necessarily a valid packing.
   * @param set the partition indexes
   * @return true if processing should continue
   */
  protected boolean accept(final int[] set) {
    return true;
  }

  /**
   * Called with each valid partition of the grid.
   * @param set the partition indexes
   */
  protected void process(final int[] set) {
  }

  private static String describe(final List<Trapezoid> trapezoids, final int[] set) {
    final StringBuilder sb = new StringBuilder();
    for (final int s : set) {
      if (sb.length() > 0) {
        sb.append(", ");
      }
      sb.append(trapezoids.get(s));
    }
    return sb.toString().replace('[', '(').replace(']', ')');
  }

  private void search(final Packer packer, final int[] set, final int remainingArea, final int remainingTrapezoids, final int k) {
    if (remainingTrapezoids == 0) {
      if (remainingArea == 0) {
        mPrepackCount.incrementAndGet();
        if (mVerbose) {
          // todo temp
          StringUtils.message("Potential set: " + describe(mTrapezoids, set));
        }
        if (accept(set) && packer.canPack(set)) {
          if (mVerbose) {
            StringUtils.message(describe(mTrapezoids, set));
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
      final Trapezoid trapezoid = mTrapezoids.get(j);
      final int v = trapezoid.getArea();
      if (v * remainingTrapezoids < remainingArea) {
        break; // Not enough area in remaining available trapezoids
      }
      if (v <= remainingArea) {
        set[set.length - remainingTrapezoids] = j;
        search(packer, set, remainingArea - v, remainingTrapezoids - 1, j);
      }
    }
  }

  protected Z t(final int n, final int m) {
    mPrepackCount = new AtomicLong();
    mCount = new AtomicLong();
    mTrapezoids = buildTrapezoids(n);
    final int n2 = n * n;
    if (mVerbose) {
      StringUtils.message("Computing: grid-size=" + n2 + " trapezoids=" + m + " possible-trapezoids=" + mTrapezoids.size() + " using " + THREADS + " threads");
    }
    final ExecutorService executor = Executors.newFixedThreadPool(THREADS);
    for (int t = 0; t < THREADS; ++t) {
      final int threadId = t;
      executor.submit(() -> {
        final Packer packer = new Packer(n, mTrapezoids);
        for (int top = mTrapezoids.size() - 1 - threadId; top >= 0; top -= THREADS) {
          final int[] set = new int[m];
          set[0] = top;
          search(packer, set, n2 - mTrapezoids.get(top).getArea(), m - 1, top);
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
    final CoordSet2T cs = new Trapezoid(5, 2).canonicalOrientation();
    System.out.println(cs.makeDiagram());
    final A391498 s = new A391498();
    final int n = Integer.parseInt(args[0]);
    for (final Trapezoid t : s.buildTrapezoids(n)) {
      System.out.println(t.toString() + " " + t.mArea);
    }
    System.out.println(s.t(n, Integer.parseInt(args[1])));
  }
}

