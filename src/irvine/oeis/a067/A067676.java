package irvine.oeis.a067;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001168.
 * @author Sean A. Irvine
 */
public class A067676 extends Sequence1 {

  private static boolean isDirectedP(final Animal animal, final long point) {
    long minX = Lattices.Z2.ordinate(point, 0);
    long minY = Lattices.Z2.ordinate(point, 1);
    for (final long p : animal.points()) {
      minX = Math.min(minX, Lattices.Z2.ordinate(p, 0));
      minY = Math.min(minY, Lattices.Z2.ordinate(p, 1));
    }
    final long pt = Lattices.Z2.toPoint(minX, minY);
    return pt == point || animal.contains(pt);
  }

  private final ParallelHunter mHunter = new ParallelHunter(7, () -> new Hunter(Lattices.Z2, true) {
    {
      setKeeper((animal, forbidden) -> {
        if (animal.isConvex(Lattices.Z2)) {
          increment(1);
        }
      });
    }

    @Override
    protected boolean isPointAllowed(final Animal animal, final long point) {
      return super.isPointAllowed(animal, point) && isDirectedP(animal, point) && animal.isConvex(Lattices.Z2);
    }
  });
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
