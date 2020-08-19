package irvine.oeis.a039;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039741.
 * @author Sean A. Irvine
 */
public class A039741 implements Sequence {

  private final ParallelHunter mHunter = new ParallelHunter(4, Lattices.BCC, true);
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
