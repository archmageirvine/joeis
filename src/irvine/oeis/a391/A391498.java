package irvine.oeis.a391;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.string.StringUtils;

/**
 * A391498 a(n) is the number of five element sets of distinct integer-sided trapezoids whose base angles are 60 degrees that fill an equilateral triangular grid of side n units.
 * @author Sean A. Irvine
 */
public class A391498 extends AbstractSequence {

  // General strategy used here:
  //  1. Compute all possible trapezoids with dimensions in [1..n]
  //  2. Compute all possible orientations of those trapezoids (for later convenience)
  //  3. Iteratively generate combinations of trapezoids from 1 that sum to an area of n^2
  //  4. For each such combination, use backtracking to determined if it can physically pack the grid.

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));

  private static final class Triangle {
    private final int mX;
    private final int mY;
    private final int mZ;  // z = 0 (up), 1 (down)

    private Triangle(final int x, final int y, final int z) {
      mX = x;
      mY = y;
      mZ = z;
    }

    @Override
    public String toString() {
      return (mZ == 0 ? "\u25B2" : "\u25BC") + "(" + mX + "," + mY + ")";
    }
  }

  private static List<Triangle> canonical(final int b, final int h) {
    final List<Triangle> cells = new ArrayList<>();
    for (int y = 0; y < h; ++y) {
      for (int x = 0; x < b - y; ++x) {
        cells.add(new Triangle(x, y, 0));
      }
      for (int x = 0; x < b - y - 1; ++x) {
        cells.add(new Triangle(x, y, 1));
      }
    }
    return cells;
  }

  /* Normalize a list of triangles so that min y = 0 and (0,0) is in the list. z remains unchanged. */
  private static List<Triangle> normalize(final List<Triangle> triangles) {
    int minX = Integer.MAX_VALUE;
    int minY = Integer.MAX_VALUE;

    for (final Triangle t : triangles) {
      if (t.mY <= minY) {
        if (t.mY < minY) {
          minY = t.mY;
          minX = t.mX;
        } else {
          minX = Math.min(minX, t.mX);
        }
      }
    }

    final List<Triangle> out = new ArrayList<>();
    for (final Triangle t : triangles) {
      out.add(new Triangle(t.mX - minX, t.mY - minY, t.mZ));
    }
    return out;
  }

  /**
   * Return all orientations for a given trapezoid.
   * @param b base
   * @param h height
   * @return orientations
   */
  private static List<List<Triangle>> orientations(final int b, final int h) {
    final List<List<Triangle>> orientations = new ArrayList<>();
    final List<Triangle> shape = canonical(b, h); // canonical shape
    orientations.add(shape);
    List<Triangle> rotated = shape;
    for (int r = 0; r < 5; ++r) {
      rotated = rotate60(rotated);
      orientations.add(rotated);
    }
    return orientations;
  }

  /* Rotate a single triangle 60 degrees anticlockwise (your coordinate system). */
  private static Triangle rotate60(final Triangle t) {
    final int x = t.mX;
    final int y = t.mY;
    final int z = t.mZ;
    final int nx = -y - 1;
    final int ny = x + y + z;
    final int nz = 1 - z;
    return new Triangle(nx, ny, nz);
  }

  private static List<Triangle> rotate60(final List<Triangle> triangles) {
    final List<Triangle> rot = new ArrayList<>();
    for (final Triangle t : triangles) {
      rot.add(rotate60(t));
    }
    return normalize(rot);
  }

  private static final class Trapezoid implements Comparable<Trapezoid> {
    final int mBase;
    final int mHeight;
    private final int mArea;

    /**
     * Construct a trapezoid.
     * @param base base (in grid units)
     * @param height height (in 60 degree grid units)
     */
    private Trapezoid(final int base, final int height) {
      mBase = base;
      mHeight = height;
      mArea = base * base - (base - height) * (base - height);
    }

    private int getArea() {
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
  }

  private static final class Packer {
    private final int mN;
    private final List<List<List<Triangle>>> mOrientations = new ArrayList<>();
    private final Set<Long> mBoard;

    private static Set<Long> buildBoard(final int n) {
      final Set<Long> board = new HashSet<>();
      for (int y = 0; y < n; ++y) {
        for (int x = 0; x < n - y; ++x) {
          board.add(key(x, y, 0));
        }
        for (int x = 0; x < n - y - 1; ++x) {
          board.add(key(x, y, 1));
        }
      }
      return board;
    }

    private Packer(final int n, final List<Trapezoid> trapezoids) {
      mN = n;
      // Precompute all orientations of the trapezoids
      for (final Trapezoid trap : trapezoids) {
        mOrientations.add(orientations(trap.mBase, trap.mHeight));
      }
      mBoard = buildBoard(n);
    }

    // Pack coordinates
    private static long key(final int x, final int y, final int z) {
      return (((long) x) << 32) ^ (((long) y) << 1) ^ z;
    }

    private List<Set<Long>> allPlacements(final List<Triangle> shape, final Set<Long> board) {
      // Get bounding box
      int minX = Integer.MAX_VALUE;
      int minY = Integer.MAX_VALUE;
      int maxX = Integer.MIN_VALUE;
      int maxY = Integer.MIN_VALUE;
      for (final Triangle t : shape) {
        minX = Math.min(minX, t.mX);
        minY = Math.min(minY, t.mY);
        maxX = Math.max(maxX, t.mX);
        maxY = Math.max(maxY, t.mY);
      }

      final List<Set<Long>> placements = new ArrayList<>();
      // Reasonable translation limits -- todo tighten these, can they be smaller than mN?
      for (int dx = -minX; dx <= mN; ++dx) {
        for (int dy = -minY; dy <= mN; ++dy) {
          final Set<Long> placed = new HashSet<>();
          boolean ok = true;
          for (final Triangle t : shape) {
            final int x = t.mX + dx;
            final int y = t.mY + dy;
            final long k = key(x, y, t.mZ);
            if (!board.contains(k)) {
              ok = false;
              break;
            }
            placed.add(k);
          }
          if (ok) {
            placements.add(placed);
          }
        }
      }
      return placements;
    }

    private static boolean search(final List<List<Set<Long>>> placements, final int i, final Set<Long> remaining) {
      if (i == placements.size()) {
        return remaining.isEmpty();
      }
      for (final Set<Long> p : placements.get(i)) {
        if (remaining.containsAll(p)) {
          // try
          remaining.removeAll(p);
          if (search(placements, i + 1, remaining)) {
            return true;
          }
          // undo
          remaining.addAll(p);
        }
      }
      return false;
    }

    private boolean canPack(final int[] trapezoids) {
      final List<List<Set<Long>>> placements = new ArrayList<>();

      for (final int v : trapezoids) {
        final List<List<Triangle>> orientations = mOrientations.get(v);
        final List<Set<Long>> all = new ArrayList<>();
        for (final List<Triangle> o : orientations) {
          all.addAll(allPlacements(o, mBoard));
        }

        if (all.isEmpty()) {
          return false; // impossible immediately
        }
        placements.add(all);
      }

      // heuristic: biggest first
      placements.sort((a, b) -> Integer.compare(b.get(0).size(), a.get(0).size()));

      return search(placements, 0, new HashSet<>(mBoard));
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
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
    return t(++mN, 5);
  }

  /**
   * Run a particular case directly.
   * @param args n k
   */
  public static void main(final String[] args) {
    final A391498 s = new A391498();
    final int n = Integer.parseInt(args[0]);
//    for (final Trapezoid t : s.buildTrapezoids(n)) {
//      System.out.println(t.toString() + " " + t.mArea);
//    }
    System.out.println(s.t(n, Integer.parseInt(args[1])));
  }
}

