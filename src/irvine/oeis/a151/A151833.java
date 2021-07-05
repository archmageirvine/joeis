package irvine.oeis.a151;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A151833 Number of fixed 7-dimensional polycubes with n cells.
 * @author Sean A. Irvine
 */
public class A151833 implements Sequence {

  private final ParallelHunter mHunter = new ParallelHunter(4, Lattices.hypercubic(7), true);
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
