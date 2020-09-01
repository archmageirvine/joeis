package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034755 Dirichlet convolution of 3^(n-1) with Catalan numbers.
 * @author Sean A. Irvine
 */
public class A034755 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Binomial.catalan(mN / d - 1).multiply(Z.THREE.pow(d - 1)));
    }
    return sum;
  }
}
