package irvine.oeis.a006;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Keeper;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006758 Number of one-sided polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A006758 implements Sequence {

  private final Hunter mHunter = new Hunter(Lattices.Z2, true) {
    {
      setKeeper(animal -> {
        if (Canons.Z2_ONE_SIDED.isCanonical(animal)) {
          increment(1);
        }
      });
    }
  };

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN) - 1);
  }
}
