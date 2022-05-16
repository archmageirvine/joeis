package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034730 Dirichlet convolution of b_n=1 with c_n=3^(n-1).
 * @author Sean A. Irvine
 */
public class A034730 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(Z.THREE.pow(dd.intValue() - 1));
    }
    return sum;
  }
}
