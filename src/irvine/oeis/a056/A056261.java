package irvine.oeis.a056;

import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056261 Series for radius of gyration for lattice animals on square lattice.
 * @author Sean A. Irvine
 */
public class A056261 implements Sequence {

  private final ParallelHunter mHunter = new ParallelHunter(7, () -> new Hunter(Lattices.Z2, true) {
    {
      setKeeper((animal, forbidden) -> {
        // Compute gyration radius squared
        long r2 = 0;
        final long[] pts = animal.points();
        for (final long pt1 : pts) {
          final long x1 = Lattices.Z2.ordinate(pt1, 0);
          final long y1 = Lattices.Z2.ordinate(pt1, 1);
          for (final long pt2 : pts) {
            if (pt2 == pt1) {
              break;
            }
            final long x2 = Lattices.Z2.ordinate(pt2, 0);
            final long y2 = Lattices.Z2.ordinate(pt2, 1);
            final long dx = x1 - x2;
            final long dy = y1 - y2;
            r2 += dx * dx + dy * dy;
          }
        }
        increment(r2);
      });
    }
  });
  private int mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
