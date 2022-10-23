package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034745 Dirichlet convolution of Fibonacci numbers with 3^(n-1).
 * @author Sean A. Irvine
 */
public class A034745 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Z.THREE.pow(d - 1).multiply(Fibonacci.fibonacci(mN / d)));
    }
    return sum;
  }
}
