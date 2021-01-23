package irvine.oeis.a030;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030446 Number of n-celled polyknights (polyominoes connected by knight's moves).
 * @author Sean A. Irvine
 */
public class A030446 implements Sequence {

  private int mN = 0;
  private final ParallelHunter mHunter = new ParallelHunter(6, () -> new Hunter(Lattices.KNIGHT, true) {
    {
      setKeeper((animal, forbidden) -> {
        if (Canons.Z2_FREE.isCanonical(animal)) {
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
