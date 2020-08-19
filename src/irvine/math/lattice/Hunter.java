package irvine.math.lattice;

import java.util.HashSet;

/**
 * Count the number of animals on a specified lattice.
 * @author Sean A. Irvine
 */
public class Hunter {

  protected final Lattice mLattice;
  protected long mCount = 0;
  protected Keeper mKeeper = animal -> increment(1);
  private final boolean mForbidden;

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
   * Set the function called for each walk.
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

  private boolean isPointAllowed(final long point) {
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

  private void search(final Animal animal, final int remainingSteps) {
    if (remainingSteps == 0) {
      mKeeper.process(animal);
    } else {
      final HashSet<Long> hc = new HashSet<>();
      for (final long p : animal.points()) {
        for (int k = 0; k < mLattice.neighbourCount(p); ++k) {
          final long q = mLattice.neighbour(p, k);
          if (mForbidden) {
            if (!isPointAllowed(q)) {
              continue;
            }
          }
          if (!animal.contains(q) && !animal.mForbidden.contains(q) && hc.add(q)) {
            final Animal a = new Animal(animal, q);

            if (mForbidden) {
              // Set forbidden points (these points should never be considered
              // in future expansion of this animal
              a.mForbidden.addAll(hc);
              a.mForbidden.remove(q); // not strictly necessary but saves space
            }
            search(a, remainingSteps - 1);
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
  public long count(final int steps, final Animal animal) {
    if (steps <= animal.size()) {
      mKeeper.process(animal);
    } else {
      mCount = 0;
      search(animal, steps - animal.size());
    }
    return mCount;
  }

  /**
   * Return the number of animals of specified size.
   * @param steps length of walk
   * @return number of walks
   */
  public long count(final int steps) {
    final Animal animal = new Animal(mLattice.origin());
    if (steps <= 1) {
      mKeeper.process(animal);
      return mCount;
    }
    return count(steps, animal);
  }

  /**
   * Noddy for testing.
   * @param args ignored
   */
  public static void main(final String[] args) {
    final Lattice l = new SquareLattice();
    //final Lattice l = new FccLattice();
    final Hunter h = new Hunter(l, true) {
//      {
//        setKeeper(new Keeper() {
//          final HashSet<Animal> mUnique = new HashSet<>();
//
//          @Override
//          public void process(final Animal animal) {
//            if (mUnique.add(canonicalizer.canon(animal))) {
//              increment(1);
//            } else {
//              System.out.println("Dupe");
//            }
//          }
//        });
//      }
    };
    for (int k = 0; k < 14; ++k) {
      System.out.println(k + " " + h.count(k));
    }
  }
}
