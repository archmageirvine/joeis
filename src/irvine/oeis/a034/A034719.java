package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034719 Dirichlet convolution of powers of 3 (3,9,27,...) with themselves.
 * @author Sean A. Irvine
 */
public class A034719 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Z.THREE.pow(d + mN / d));
    }
    return sum;
  }
}
