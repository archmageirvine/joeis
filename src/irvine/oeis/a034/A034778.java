package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000594;

/**
 * A034778 Dirichlet convolution of Ramanujan numbers (A000594) with themselves.
 * @author Sean A. Irvine
 */
public class A034778 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000594());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mA.a(d - 1).multiply(mA.a(mN / d - 1)));
    }
    return sum;
  }
}
