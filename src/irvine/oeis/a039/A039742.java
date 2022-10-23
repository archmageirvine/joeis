package irvine.oeis.a039;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039742 Lattice animals in the f.c.c. lattice (12 nearest neighbors), connected rhombic dodecahedra, edge-connected cubes.
 * @author Sean A. Irvine
 */
public class A039742 extends Sequence1 {

  private final ParallelHunter mHunter = new ParallelHunter(4, Lattices.FCC, true);
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
