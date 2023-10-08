package irvine.oeis.a066;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001168 Number of fixed polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A066158 extends Sequence1 {

  private final ParallelHunter mHunter = new ParallelHunter(7, () -> new Hunter(Lattices.Z2, true) {
    @Override
    protected boolean isPointAllowed(final Animal animal, final long point) {
      if (!super.isPointAllowed(animal, point)) {
        return false;
      }
      int cnt = 0;
      for (final long q : Lattices.Z2.neighbours(point)) {
        if (animal.contains(q) && ++cnt > 1) {
          return false;
        }
      }
      return true;
    }
  });
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
