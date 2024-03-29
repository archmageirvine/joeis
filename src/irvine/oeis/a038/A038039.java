package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038039 a(n) = Sum_{d|n} (2^d*3^(n/d)).
 * @author Sean A. Irvine
 */
public class A038039 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Z.THREE.pow(mN / d).shiftLeft(d));
    }
    return sum;
  }
}
