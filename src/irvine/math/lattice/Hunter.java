package irvine.math.lattice;

import java.util.HashSet;
import java.util.Set;

/**
 * Count the number of animals on a specified lattice.
 * @author Sean A. Irvine
 */
public class Hunter {

  protected final Lattice mLattice;
  protected long mCount = 0;
  protected Keeper mKeeper = (animal, forbidden) -> increment(1);
  protected final boolean mForbidden;

  /**
   * Construct a hunter on the specified lattice.
   * @param lattice underlying lattice
   * @param forbidden should forbidden points implementation be used (normally set this to true)
   */
  public Hunter(final Lattice lattice, final boolean forbidden) {
    mLattice = lattice;
    mForbidden = forbidden;
  }

  /**
   * Construct a hunter on the specified lattice.
   * @param lattice underlying lattice
   */
  public Hunter(final Lattice lattice) {
    this(lattice, false);
  }

  /**
   * Set the function called for each animal.
   * @param keeper the keeper
   */
  public void setKeeper(final Keeper keeper) {
    mKeeper = keeper;
  }

  /**
   * Increment the count.
   * @param count count
   */
  public void increment(final long count) {
    mCount += count;
  }

  protected boolean isPointAllowed(final Animal animal, final long point) {
    // Check that the point is above right of the origin (and equivalent
    // generalization for higher dimension lattices).
    for (int k = 0; k < mLattice.dimension(); ++k) {
      final long v = mLattice.ordinate(point, k);
      if (v > 0) {
        return true;
      }
      if (v < 0) {
        return false;
      }
    }
    return false; // point was the origin
  }

  protected void search(final Animal animal, final int remainingSteps, final Set<Long> forbidden) {
    if (remainingSteps == 0) {
      mKeeper.process(animal, forbidden);
    } else {
      final HashSet<Long> hc = new HashSet<>();
      for (final long p : animal.points()) {
        for (int k = 0; k < mLattice.neighbourCount(p); ++k) {
          final long q = mLattice.neighbour(p, k);
          if (mForbidden && !isPointAllowed(animal, q)) {
            continue;
          }
          if (!animal.contains(q) && !forbidden.contains(q) && hc.add(q)) {
            final Animal a = new Animal(animal, q);
            if (mForbidden) {
              // Set forbidden points never to be considered in future expansion of this animal
              forbidden.addAll(hc);
              search(a, remainingSteps - 1, forbidden);
              forbidden.removeAll(hc);
            } else {
              search(a, remainingSteps - 1, forbidden);
            }
          }
        }
      }
    }
  }

  /**
   * Return the number of animals of specified size.
   * @param steps length of walk
   * @return number of walks
   */
  public long count(final int steps, final Animal animal, final Set<Long> forbidden) {
    mCount = 0;
    if (steps <= animal.size()) {
      mKeeper.process(animal, forbidden);
    } else {
      search(animal, steps - animal.size(), forbidden);
    }
    return mCount;
  }

  /**
   * Return the number of animals of specified size.
   * @param steps length of walk
   * @return number of walks
   */
  public long count(final int steps) {
    return count(steps, new Animal(mLattice.origin()), new HashSet<>());
  }

  /**
   * Noddy for testing.
   * @param args ignored
   */
  public static void main(final String[] args) {
    //final Lattice l = new SquareLattice();
    final Lattice l = Lattices.PYROCHLORE;
    final Hunter h = new Hunter(l, true);
    for (int k = 0; k < 14; ++k) {
      System.out.println(k + " " + h.count(k));
    }
  }
}
