package irvine.oeis;

import java.util.HashSet;
import java.util.Set;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Lattice;
import irvine.math.z.Z;

/**
 * Counts the number of animals on a lattice in a naive way.
 * For regular lattices much better performance can be had using <code>ParallelHunter</code>
 * @author Sean A. Irvine
 */
public class NaiveHunterSequence extends AbstractSequence {

  private final static int DEFOFF = 1;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  protected final Lattice mL;
  protected Set<Animal> mCanons = new HashSet<>();

  protected NaiveHunterSequence(final Lattice lattice) {
    this(DEFOFF, lattice);
  }

  protected NaiveHunterSequence(final int offset, final Lattice lattice) {
    super(offset);
    mL = lattice;
  }

  protected void init(final Set<Animal> animals) {
    animals.add(new Animal(mL.origin()));
  }

  protected boolean accept(final Animal animal, final long pt) {
    return !animal.contains(pt);
  }

  @Override
  public Z next() {
    if (mCanons.isEmpty()) {
      init(mCanons);
    } else {
      final HashSet<Animal> newCanons = new HashSet<>();
      final HashSet<Long> tried = new HashSet<>(); // for efficiency only
      for (final Animal a : mCanons) {
        tried.clear();
        for (final long pt : a.points()) {
          for (int k = 0; k < mL.neighbourCount(pt); ++k) {
            final long q = mL.neighbour(pt, k);
            if (accept(a, q) && tried.add(q)) {
              newCanons.add(mL.freeCanonical(new Animal(a, q)));
            }
          }
        }
      }
      mCanons = newCanons;
    }
    if (mVerbose) {
      for (final Animal a : mCanons) {
        System.out.println(a.toString(mL));
      }
    }
    return Z.valueOf(mCanons.size());
  }
}
