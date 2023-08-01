package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a034.A034175;
import irvine.oeis.memory.MemorySequence;

/**
 * A064929 Square of A034175 considered as a permutation of the nonnegative integers (which it is conjectured to be).
 * @author Sean A. Irvine
 */
public class A064929 extends Sequence0 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A034175());
  private int mN = -1;

  @Override
  public Z next() {
    return mA.a(mA.a(++mN).intValueExact());
  }
}

