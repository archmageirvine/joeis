package irvine.oeis.a261;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A261834 Number of n-step adjacent expansions on the hexagonal (honeycomb) lattice. Holes allowed.
 * @author Sean A. Irvine
 */
public class A261834 implements Sequence {

  private final ParallelHunter mHunter = new ParallelHunter(4, Lattices.HEXAGONAL, false);
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
