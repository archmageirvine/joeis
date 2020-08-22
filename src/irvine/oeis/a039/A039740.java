package irvine.oeis.a039;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039740 Lattice animals in the cubic diamond lattice (4 nearest neighbors), <code>even-vertex-connected</code> cubes.
 * @author Sean A. Irvine
 */
public class A039740 implements Sequence {

  private final ParallelHunter mHunter = new ParallelHunter(6, Lattices.DIAMOND, true);
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
