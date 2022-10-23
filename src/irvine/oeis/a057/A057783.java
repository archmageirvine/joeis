package irvine.oeis.a057;

import java.util.HashSet;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057783 Building block is 2 hexagons side-by-side; sequence gives number of pieces (polydohexes) that can be formed from n such pairs of hexagons.
 * @author Sean A. Irvine
 */
public class A057783 extends Sequence1 {

  private static final Lattice L = Lattices.HEXAGONAL;
  private static final int NEIGHBOURS = L.neighbourCount(L.origin()); // constant for all points in this lattice
  private HashSet<Animal> mCanons = new HashSet<>();

  @Override
  public Z next() {
    if (mCanons.isEmpty()) {
      mCanons.add(new Animal(L.origin(), L.toPoint(2, 0))); // two adjacent hexes
    } else {
      final HashSet<Animal> newCanons = new HashSet<>();
      final HashSet<Long> tried = new HashSet<>(); // for efficiency only
      for (final Animal a : mCanons) {
        tried.clear();
        for (final long pt : a.points()) {
          // Choose two new adjacent points for the dohex. Check that these points
          // are not already present in the animal and have not already been
          // considered.  Form the free canonical form of the result and add it
          // the set of new results.
          tried.add(pt);
          for (int k = 0; k < NEIGHBOURS; ++k) {
            final long q = L.neighbour(pt, k);
            if (!a.contains(q)) {
              for (int j = 0; j < NEIGHBOURS; ++j) {
                final long r = L.neighbour(q, j);
                if (!tried.contains(r) && !a.contains(r)) {
                  final Animal b = new Animal(new Animal(a, q), r);
                  newCanons.add(L.freeCanonical(b));
                }
              }
            }
          }
        }
      }
      mCanons = newCanons;
    }
    return Z.valueOf(mCanons.size());
  }
}
