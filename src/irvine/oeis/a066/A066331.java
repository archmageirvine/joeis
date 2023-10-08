package irvine.oeis.a066;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066331.
 * @author Sean A. Irvine
 */
public class A066331 extends Sequence1 {

  private final ParallelHunter mHunter = new ParallelHunter(7, () -> new Hunter(Lattices.HEXAGONAL, true) {
    @Override
    protected boolean isPointAllowed(final Animal animal, final long point) {
      if (!super.isPointAllowed(animal, point)) {
        return false;
      }
      int cnt = 0;
      for (final long q : Lattices.HEXAGONAL.neighbours(point)) {
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
