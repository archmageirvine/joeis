package irvine.oeis.a030;

import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030444 Number of fixed n-celled polyknights.
 * @author Sean A. Irvine
 */
public class A030444 implements Sequence {

  private int mN = 0;
  private final ParallelHunter mHunter = new ParallelHunter(6, () -> new Hunter(Lattices.KNIGHT, true));

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
