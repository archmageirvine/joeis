package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A064668 Regard A064413 as giving a permutation of the positive integers; sequence gives second infinite cycle, reading backwards beginning at its smallest term, 73.
 * @author Sean A. Irvine
 */
public class A064668 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A064664());
  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.valueOf(73) : mA.a(mT.intValueExact() - 1);
    return mT;
  }
}
