package irvine.oeis.a346;

import java.util.Set;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Keeper;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A346958 a(n) is the minimal number of cubes required to make a void of volume n.
 * @author Sean A. Irvine
 */
public class A346958 implements Sequence, Keeper {

  private int mN = 0;
  private int mMin;

  @Override
  public void process(final Animal animal, final Set<Long> forbidden) {
    final int perim = animal.perimeterSize(Lattices.Z3);
    if (perim < mMin) {
      mMin = perim;
    }
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mMin = Integer.MAX_VALUE;
      final Hunter h = new Hunter(Lattices.Z3, true) {
        {
          setKeeper(A346958.this);
        }
      };
      h.count(mN);
    }
    return Z.valueOf(mMin);
  }

}
