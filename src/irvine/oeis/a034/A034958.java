package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007504;

/**
 * A034958 Divide primes into groups with prime(n) elements and add together.
 * @author Sean A. Irvine
 */
public class A034958 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A007504());
  private int mN = 0;

  @Override
  public Z next() {
    return mA.a(mA.a(++mN).intValueExact()).subtract(mA.a(mA.a(mN - 1).intValueExact()));
  }
}
