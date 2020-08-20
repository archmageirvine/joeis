package irvine.oeis.a030;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030233 Number of <code>n-celled one-sided</code> polyplets.
 * @author Sean A. Irvine
 */
public class A030233 implements Sequence {

  private final ParallelHunter mHunter = new ParallelHunter(7,
    () -> new Hunter(Lattices.Z2Q, true),
    () -> new Hunter(Lattices.Z2Q, true) {
      {
        setKeeper(animal -> {
          if (Canons.Z2_ONE_SIDED.isCanonical(animal)) {
            increment(1);
          }
        });
      }
    });

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
