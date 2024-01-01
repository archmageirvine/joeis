package irvine.oeis.a067;

import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067675.
 * @author Sean A. Irvine
 */
public class A067675 extends Sequence1 {

  private int mN = 0;
  private final ParallelHunter mHunter = new ParallelHunter(7, () -> new Hunter(Lattices.Z2, true) {
    {
      setKeeper((animal, forbidden) -> {
        if (animal.isConvex(Lattices.Z2)) {
          increment(1);
        }
      });
    }
  });

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
