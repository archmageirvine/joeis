package irvine.oeis.a038;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038039 a(n) = Sum_{d|n} (2^d*3^(n/d)).
 * @author Sean A. Irvine
 */
public class A038039 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Z.THREE.pow(mN / d).shiftLeft(d));
    }
    return sum;
  }
}
