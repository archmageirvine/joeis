package irvine.oeis.a057;

import java.util.HashSet;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Hexagonal;
import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A057783.
 * @author Sean A. Irvine
 */
public class A057783 implements Sequence {

  private static final Lattice H = Lattices.HEXAGONAL;
  private static final int NEIGHBOURS = H.neighbourCount(H.origin()); // constant for all points in this lattice
  private HashSet<Animal> mCanons = new HashSet<>();

  @Override
  public Z next() {
    if (mCanons.isEmpty()) {
      mCanons.add(new Animal(H.origin(), H.toPoint(2, 0)));
    } else {
      final HashSet<Animal> newCanons = new HashSet<>();
      final HashSet<Pair<Long, Long>> tried = new HashSet<>(); // for efficiency only
      for (final Animal a : mCanons) {
        tried.clear();
        for (final long pt : a.points()) {
          // Choose two new adjacent points for the dohex
          for (int k = 0; k < NEIGHBOURS; ++k) {
            final long q = H.neighbour(pt, k);
            if (!a.contains(q)) {
              for (int j = 0; j < NEIGHBOURS; ++j) {
                final long r = H.neighbour(q, j);
                if (r != pt && !a.contains(r) && tried.add(new Pair<>(q, r))) {
                  final Animal b = new Animal(new Animal(a, q), r);
                  newCanons.add(Hexagonal.freeCanonical(b));
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
