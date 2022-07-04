package irvine.oeis;

import java.util.HashSet;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Lattice;
import irvine.math.z.Z;

/**
 * Counts the number of animals on a lattice in a naive way.
 * For regular lattices much better performance can be had using <code>ParallelHunter</code>
 * @author Sean A. Irvine
 */
public class NaiveHunterSequence implements Sequence {

  protected final Lattice mL;
  protected HashSet<Animal> mCanons = new HashSet<>();

  protected NaiveHunterSequence(final Lattice lattice) {
    mL = lattice;
  }

  @Override
  public Z next() {
    if (mCanons.isEmpty()) {
      mCanons.add(new Animal(mL.origin()));
    } else {
      final HashSet<Animal> newCanons = new HashSet<>();
      final HashSet<Long> tried = new HashSet<>(); // for efficiency only
      for (final Animal a : mCanons) {
        tried.clear();
        for (final long pt : a.points()) {
          for (int k = 0; k < mL.neighbourCount(pt); ++k) {
            final long q = mL.neighbour(pt, k);
            if (!a.contains(q) && tried.add(q)) {
              final Animal b = new Animal(a, q);
              newCanons.add(mL.freeCanonical(b));
            }
          }
        }
      }
      mCanons = newCanons;
    }
    return Z.valueOf(mCanons.size());
  }
}
