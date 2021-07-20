package irvine.oeis.a000;

import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000656 Invertible Boolean functions of n variables with S(n) acting on the domain and GL(n,2) acting on the range.
 * @author Sean A. Irvine
 */
public class A000656 extends A000654 {

  private final A000653 mDomain = new A000653();

  @Override
  public Z next() {
    final CycleIndex domain = mDomain.f(++mN);
    final CycleIndex range = GeneralLinearCycleIndex.cycleIndex(mN);
    return domain.invertible(range);
  }
}
