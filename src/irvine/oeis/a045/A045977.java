package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a005.A005179;
import irvine.oeis.a027.A027423;

/**
 * A045977 Smallest number with same number of divisors as n!.
 * @author Sean A. Irvine
 */
public class A045977 extends A027423 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A005179());

  @Override
  public Z next() {
    return mA.a(super.next().intValueExact() - 1);
  }
}
