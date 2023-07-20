package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A054241 Number of partitions of bit-interleaved numbers; partitions of n in base sqrt(2).
 * @author Sean A. Irvine
 */
public class A054241 extends A054239 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A054225());

  @Override
  public Z next() {
    return mA.a(super.next().intValueExact());
  }
}

