package irvine.oeis.a067;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a064.A064340;
import irvine.oeis.memory.MemorySequence;

/**
 * A067304 Generalized Catalan triangle A067298 with row reversion.
 * @author Sean A. Irvine
 */
public class A067304 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private final MemorySequence mA = MemorySequence.cachedSequence(new A064340());

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    return Integers.SINGLETON.sum(0, mM, k -> mA.a(k).multiply(mA.a(mN - k)));
  }
}
