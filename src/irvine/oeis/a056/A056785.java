package irvine.oeis.a056;

import java.util.HashSet;
import java.util.Set;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056785 Number of polydominoes.
 * @author Sean A. Irvine
 */
public class A056785 implements Sequence {

  // Note: I was unable to get this to work using the "forbidden" mechanism

  protected final HashSet<Animal> mCanons = new HashSet<>();

  private final Hunter mHunter = new Hunter(Lattices.Z2, false) {
    {
      setKeeper((animal, forbidden) -> {
        mCanons.add(Lattices.Z2.freeCanonical(Canons.translate(Lattices.Z2, animal)));
      });
    }

    @Override
    protected void search(final Animal animal, final int remainingSteps, final Set<Long> forbidden) {
      if (remainingSteps <= 0) {
        mKeeper.process(animal, forbidden);
      } else {
        for (final long p : animal.points()) {
          for (int k = 0; k < mLattice.neighbourCount(p); ++k) {
            final long q = mLattice.neighbour(p, k);
            if (!animal.contains(q)) {
              final Animal a = new Animal(animal, q);
              for (int j = 0; j < mLattice.neighbourCount(q); ++j) {
                final long r = mLattice.neighbour(q, j);
                if (r == p) {
                  continue;
                }
                if (!animal.contains(r)) {
                  final Animal b = new Animal(a, r);
                  search(b, remainingSteps - 2, forbidden);
                }
              }
            }
          }
        }
      }
    }

    @Override
    public long count(final int steps) {
      return count(steps, new Animal(new Animal(mLattice.origin()), mLattice.toPoint(1, 0)), new HashSet<>());
    }
  };

  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    mCanons.clear();
    mHunter.count(mN);
//    for (final Animal a : mCanons) {
//      System.out.println(a.toString(Lattices.Z2));
//    }
    return Z.valueOf(mCanons.size());
  }
}
