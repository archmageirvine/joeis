package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007769.
 * @author Sean A. Irvine
 */
public class A007769 implements Sequence {

  private int mN = -1;
  private final MemoryFactorial mF = new MemoryFactorial();

  private Z alpha(final int p, final Z q) {
    if (q.isEven()) {
      Z sum = Z.ZERO;
      for (int k = 0; 2 * k <= p; ++k) {
        sum = sum.add(Binomial.binomial(p, 2 * k).multiply(q.pow(k)).multiply(mF.doubleFactorial(2 * k - 1)));
      }
      return sum;
    } else {
      return q.pow(p / 2).multiply(mF.doubleFactorial(p - 1));
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z q : Cheetah.factor(2L * mN).divisors()) {
      sum = sum.add(Euler.phi(q).multiply(alpha(2 * mN / q.intValueExact(), q)));
    }
    return sum.divide(2L * mN);
  }
}
