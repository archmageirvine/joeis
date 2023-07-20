package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a055.A055879;

/**
 * A030520 Number of polyhexes of class PF2 with C_{2n} symmetry.
 * @author Sean A. Irvine
 */
public class A030520 extends Sequence2 {

  private final MemorySequence mM = MemorySequence.cachedSequence(new PrependSequence(new A055879(), 0));
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    final Z t = mM.a(mN + 1).subtract(mM.a(mN)).multiply(3).add(mM.a(mN / 2));
    return mM.a(mN + 3).subtract(mM.a(mN + 2)).subtract(t.divide2());
  }
}
