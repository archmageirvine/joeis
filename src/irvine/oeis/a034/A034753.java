package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034753 Dirichlet convolution of 3^(n-1) with sigma(n).
 * @author Sean A. Irvine
 */
public class A034753 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Functions.SIGMA.z(mN / d).multiply(Z.THREE.pow(d - 1)));
    }
    return sum;
  }
}
