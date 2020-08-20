package irvine.oeis.a006;

import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006726 Number of n-celled polygons with perimeter <code>2n</code> on square lattice.
 * @author Sean A. Irvine
 */
public class A006726 implements Sequence {

  private final ParallelHunter mHunter = new ParallelHunter(6,
    () -> new Hunter(Lattices.Z2, true),
    () -> new Hunter(Lattices.Z2, true) {
      {
        setKeeper((animal, forbidden) -> {
          if (animal.edgePerimeterSize(Lattices.Z2) == 2 * animal.size() && !animal.isHoly(Lattices.Z2)) {
            increment(1);
          }
        });
      }
    }
  );

  private int mN = 3;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
