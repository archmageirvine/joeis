package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034754 Dirichlet convolution of 3^(n-1) with phi(n).
 * @author Sean A. Irvine
 */
public class A034754 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Functions.PHI.z(mN / d).multiply(Z.THREE.pow(d - 1)));
    }
    return sum;
  }
}
