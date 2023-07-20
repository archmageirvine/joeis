package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a000.A000720;

/**
 * A062773 Index of the smallest prime which follows square of n-th prime.
 * @author Sean A. Irvine
 */
public class A062773 extends A062772 {

  private final MemorySequence mPrimePi = MemorySequence.cachedSequence(new A000720());

  @Override
  public Z next() {
    return mPrimePi.a(super.next().intValueExact());
  }
}
