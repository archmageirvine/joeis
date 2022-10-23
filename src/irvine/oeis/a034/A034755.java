package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034755 Dirichlet convolution of 3^(n-1) with Catalan numbers.
 * @author Sean A. Irvine
 */
public class A034755 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Binomial.catalan(mN / d - 1).multiply(Z.THREE.pow(d - 1)));
    }
    return sum;
  }
}
