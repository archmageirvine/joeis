package irvine.oeis.a057;

import java.util.HashSet;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Kite;
import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057784 Number of polypons with n cells.
 * @author Sean A. Irvine
 */
public class A057786 implements Sequence {

  protected static final Lattice L = Lattices.KITE;
  private static final int NEIGHBOURS = L.neighbourCount(L.origin()); // constant for all points in this lattice
  protected HashSet<Animal> mCanons = new HashSet<>();

  @Override
  public Z next() {
    if (mCanons.isEmpty()) {
      mCanons.add(new Animal(L.origin()));
    } else {
      final HashSet<Animal> newCanons = new HashSet<>();
      final HashSet<Long> tried = new HashSet<>(); // for efficiency only
      for (final Animal a : mCanons) {
        tried.clear();
        for (final long pt : a.points()) {
          for (int k = 0; k < NEIGHBOURS; ++k) {
            final long q = L.neighbour(pt, k);
            if (!a.contains(q) && tried.add(q)) {
              final Animal b = new Animal(a, q);
              newCanons.add(Kite.freeCanonical(b));
            }
          }
        }
      }
      mCanons = newCanons;
    }
    return Z.valueOf(mCanons.size());
  }
}
