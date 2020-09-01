package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A034779 Dirichlet convolution of [ 1,1,1,... ] with A034778.
 * @author Sean A. Irvine
 */
public class A034779 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A034778());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mA.a(d - 1));
    }
    return sum;
  }
}
