package irvine.oeis.a057;

import java.util.HashSet;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.Polybrick;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057973 Number of polybricks: number of ways to arrange n 1 X 2 "bricks" in a wall (see illustrations).
 * @author Sean A. Irvine
 */
public class A057973 extends Sequence1 {

  private static final Lattice L = Lattices.Z2;
  private static final int NEIGHBOURS = L.neighbourCount(L.origin());
  private static final long[] DELTAS = {1, -1};
  private HashSet<Animal> mCanons = new HashSet<>();

  @Override
  public Z next() {
    if (mCanons.isEmpty()) {
      mCanons.add(new Animal(L.origin(), L.toPoint(1, 0))); // 1x2 brick
    } else {
      final HashSet<Animal> newCanons = new HashSet<>();
      final HashSet<Long> tried = new HashSet<>(); // for efficiency only
      for (final Animal a : mCanons) {
        tried.clear();
        for (final long pt : a.points()) {
          tried.add(pt);
          for (int k = 0; k < NEIGHBOURS; ++k) {
            final long q = L.neighbour(pt, k);
            if (tried.add(q) && !a.contains(q)) {
              final long x = L.ordinate(q, 0);
              final long y = L.ordinate(q, 1);
              final long q1 = L.toPoint(x + DELTAS[(int) ((x + y) & 1)], y);
              if (tried.add(q1) && !a.contains(q1)) {
                final Animal b = new Animal(new Animal(a, q), q1);
                newCanons.add(Polybrick.freeCanonical(b));
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
