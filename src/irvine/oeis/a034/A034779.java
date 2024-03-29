package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A034779 Dirichlet convolution of [ 1,1,1,... ] with A034778.
 * @author Sean A. Irvine
 */
public class A034779 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A034778());
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
