package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007504;

/**
 * A034958 Divide primes into groups with prime(n) elements and add together.
 * @author Sean A. Irvine
 */
public class A034958 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A007504());
  private int mN = 0;

  @Override
  public Z next() {
    return mA.a(mA.a(++mN).intValueExact()).subtract(mA.a(mA.a(mN - 1).intValueExact()));
  }
}
