package irvine.oeis.a057;

import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057419 Number of fixed n-celled polyominoes with 1 hole.
 * @author Sean A. Irvine
 */
public class A057419 implements Sequence {

  private final ParallelHunter mHunter = new ParallelHunter(6,
    () -> new Hunter(Lattices.Z2, true),
    () -> new Hunter(Lattices.Z2, true) {
      {
        setKeeper((animal, forbidden) -> {
          if (animal.countHoles(Lattices.Z2) == 1) {
            increment(1);
          }
        });
      }
    }
  );

  private int mN = 6;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
