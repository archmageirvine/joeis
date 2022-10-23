package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000594;

/**
 * A034777 Dirichlet convolution of [ 1,1,1,... ] with Ramanujan numbers (A000594).
 * @author Sean A. Irvine
 */
public class A034777 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000594());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mA.a(d - 1));
    }
    return sum;
  }
}
