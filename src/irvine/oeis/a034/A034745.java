package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034745 Dirichlet convolution of Fibonacci numbers with 3^(n-1).
 * @author Sean A. Irvine
 */
public class A034745 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Z.THREE.pow(d - 1).multiply(Fibonacci.fibonacci(mN / d)));
    }
    return sum;
  }
}
