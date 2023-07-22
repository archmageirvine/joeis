package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A064665 Regard A064413 as giving a permutation of the positive integers; sequence gives first infinite cycle, beginning at its smallest term, 7.
 * @author Sean A. Irvine
 */
public class A064665 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A064413());
  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.SEVEN : mA.a(mT.intValueExact() - 1);
    return mT;
  }
}
