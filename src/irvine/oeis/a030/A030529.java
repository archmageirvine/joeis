package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a055.A055879;
import irvine.oeis.memory.MemorySequence;

/**
 * A030529 Number of polyhexes of class PF2 with a particular symmetry.
 * @author Sean A. Irvine
 */
public class A030529 extends Sequence2 {

  private final MemorySequence mM = MemorySequence.cachedSequence(new PrependSequence(new A055879(), 0));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mM.a(2 * mN + 1).subtract(mM.a(2 * mN)).subtract(mM.a(mN)).divide2();
  }
}
