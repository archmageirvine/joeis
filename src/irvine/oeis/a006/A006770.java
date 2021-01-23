package irvine.oeis.a006;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006770 Number of fixed n-celled polyominoes which need only touch at corners.
 * @author Sean A. Irvine
 */
public class A006770 implements Sequence {

  private final ParallelHunter mHunter = new ParallelHunter(4, Lattices.Z2Q, true);
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
