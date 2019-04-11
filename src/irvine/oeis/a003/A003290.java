package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003290 Number of n-step self-avoiding walks on hexagonal lattice from <code>(0,0)</code> to <code>(0,2)</code>.
 * @author Sean A. Irvine
 */
public class A003290 implements Sequence {

  // Walks in hexagonal lattice between origin and a selected target

  /*
  // To avoid churn, this implementation replaces an early object-oriented search with
  // more direct arrays for keeping track of nodes in the paths so far.
  // It stores all paths, so that later levels can avoid recomputing them, however,
  // this turns out to be much slower than a more targeted search from the start.
  // The following arrays are co-indexed and store nodes in the path.
  // Further symmetry considerations mean we can sometimes reduced the paths to be
  // explored at the expense of keeping a multiplicity.
  protected static final long NULL = -1;
  private final LongDynamicByteArray mX = new LongDynamicByteArray();
  private final LongDynamicByteArray mY = new LongDynamicByteArray();
  private final LongDynamicByteArray mMultiplicity = new LongDynamicByteArray();
  private final LongDynamicLongArray mParent = new LongDynamicLongArray();
  protected long mStartOfCurrentWalks = 0;
  protected long mNextFreeNode = 0;

  private boolean contains(final long w, final int x, final int y) {
    // Recursive form
    //return (mX.get(w) == x && mY.get(w) == y) || (mParent.get(w) != NULL && contains(mParent.get(w), x, y));
    // Iterative form
    long n = w;
    do {
      if (mX.get(n) == x && mY.get(n) == y) {
        return true;
      }
      n = mParent.get(n);
    } while (n != NULL);
    return false;
  }

  protected void add(final long parent, final int x, final int y, final int m) {
    mX.set(mNextFreeNode, (byte) x);
    mY.set(mNextFreeNode, (byte) y);
    mMultiplicity.set(mNextFreeNode, (byte) m);
    mParent.set(mNextFreeNode, parent);
    ++mNextFreeNode;
  }

  protected void init() {
    // Set up initial search space for this target, dealing with symmetry multiplicities
    add(NULL, 0, 0, 1); // Root node
    mStartOfCurrentWalks = mNextFreeNode;
    add(0, 2, 0, 1);
    add(0, -2, 0, 1);
    add(0, 1, 1, 2);
    add(0, -1, 1, 2);
  }

  {
    init();
  }

  protected int targetX() {
    return 4;
  }

  protected int targetY() {
    return 0;
  }

  //@Override
  public Z nextAlt() {
    final int tx = targetX();
    final int ty = targetY();
    final long prevStart = mStartOfCurrentWalks;
    mStartOfCurrentWalks = mNextFreeNode;
    for (long w = prevStart; w < mStartOfCurrentWalks; ++w) {
      final int x = mX.get(w);
      final int y = mY.get(w);
      final int m = mMultiplicity.get(w);
      if (x == tx && y == ty) {
        continue; // Don't explore further once we hit the target
      }
      if (!contains(w, x + 2, y)) {
        add(w, x + 2, y, m);
      }
      if (!contains(w, x - 2, y)) {
        add(w, x - 2, y, m);
      }
      if (!contains(w, x + 1, y + 1)) {
        add(w, x + 1, y + 1, m);
      }
      if (!contains(w, x + 1, y - 1)) {
        add(w, x + 1, y - 1, m);
      }
      if (!contains(w, x - 1, y + 1)) {
        add(w, x - 1, y + 1, m);
      }
      if (!contains(w, x - 1, y - 1)) {
        add(w, x - 1, y - 1, m);
      }
    }
    long r = 0;
    for (long w = mStartOfCurrentWalks; w < mNextFreeNode; ++w) {
      final int x = mX.get(w);
      final int y = mY.get(w);
      final int m = mMultiplicity.get(w);
      if (x == tx && y == ty) {
        r += m;
      }
    }
    return Z.valueOf(r);
  }
  */

  // The following implementation uses minimal memory.  Just a grid to keep tracks of points
  // included in the current path.  It re-searches for each new distance "n" rather than
  // expanding for previous existing paths.  8-bits are used for each coordinate, this
  // allows +/- 127 in each dimension, more than adequate for what can be exhaustively
  // enumerated.
  private final boolean[] mUsed = new boolean[65536];
  private long mCount = 0;
  protected int mN = first() - 1;

  protected int first() {
    return 2;
  }

  protected int coord(final int x, final int y) {
    return ((y & 0xFF) << 8) + (x & 0xFF);
  }

  protected void use(final int x, final int y) {
    mUsed[coord(x, y)] = true;
  }

  protected void clear(final int x, final int y) {
    mUsed[coord(x, y)] = false;
  }

  private void search(final int x, final int y, final int tx, final int ty, final int stepsRemaining) {
    if (stepsRemaining <= 0) {
      if (stepsRemaining == 0 && x == tx && y == ty) {
        ++mCount;
      }
    } else if (tx != x || ty != y) {
      // Check that it is possible to reach the target within the remaining numbers of moves
      final int dx = Math.abs(tx - x) >>> 1;
      final int dy = Math.abs(ty - y);
      final int d = Math.max(dx, dy);
      if (d <= stepsRemaining) {
        final int coord = coord(x, y);
        if (!mUsed[coord]) {
          mUsed[coord] = true;
          search(x + 2, y, tx, ty, stepsRemaining - 1);
          search(x - 2, y, tx, ty, stepsRemaining - 1);
          search(x + 1, y + 1, tx, ty, stepsRemaining - 1);
          search(x + 1, y - 1, tx, ty, stepsRemaining - 1);
          search(x - 1, y + 1, tx, ty, stepsRemaining - 1);
          search(x - 1, y - 1, tx, ty, stepsRemaining - 1);
          mUsed[coord] = false;
        }
      }
    }
  }

  protected long search(final int x, final int y, final int tx, final int ty, final int stepsRemaining, final int m) {
    mCount = 0;
    if (stepsRemaining >= 0) {
      search(x, y, tx, ty, stepsRemaining);
    }
    return mCount * m;
  }

  protected long search() {
    final int tx = 4;
    final int ty = 0;
    // return search(0, 0, tx, ty, mN, 1); // Basic search
    // Expanding first few links to exploit symmetries
    use(0, 0);
    long total = search(1, 1, tx, ty, mN - 1, 2);
    total += search(-1, 1, tx, ty, mN - 1, 2);
    use(-2, 0);
    total += search(-4, 0, tx, ty, mN - 2, 1);
    total += search(-1, 1, tx, ty, mN - 2, 2);
    total += search(-3, 1, tx, ty, mN - 2, 2);
    clear(-2, 0);
    use(2, 0);
    total += search(4, 0, tx, ty, mN - 2, 1);
    total += search(1, 1, tx, ty, mN - 2, 2);
    total += search(3, 1, tx, ty, mN - 2, 2);
    clear(2, 0);
    clear(0, 0);
    return total;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(search());
  }

}
