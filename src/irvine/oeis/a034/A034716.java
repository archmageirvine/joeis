package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034716 Dirichlet convolution of factorials with themselves.
 * @author Sean A. Irvine
 */
public class A034716 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mF.factorial(d).multiply(mF.factorial(mN / d)));
    }
    return sum;
  }
}
