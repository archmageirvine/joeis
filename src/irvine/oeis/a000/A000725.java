package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000725 Invertible Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A000725 extends A000654 {

  private final A000653 mDomain = new A000653();

  @Override
  public Z next() {
    final CycleIndex domain = mDomain.f(++mN);
    final CycleIndex range = f(mN);
    return domain.invertible(range);
  }
}
