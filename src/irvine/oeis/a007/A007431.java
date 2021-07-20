package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007431 a(n) = Sum_{d|n} phi(d)*mu(n/d).
 * @author Sean A. Irvine
 */
public class A007431 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum = sum.add(Euler.phi(d).multiply(Mobius.mobius(mN / d.longValueExact())));
    }
    return sum;
  }
}
