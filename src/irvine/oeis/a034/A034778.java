package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000594;
import irvine.oeis.memory.MemorySequence;

/**
 * A034778 Dirichlet convolution of Ramanujan numbers (A000594) with themselves.
 * @author Sean A. Irvine
 */
public class A034778 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000594());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mA.a(d - 1).multiply(mA.a(mN / d - 1)));
    }
    return sum;
  }
}
