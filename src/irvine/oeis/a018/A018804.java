package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018804 Pillai's arithmetical function: Sum_{k=1..n} gcd(k, <code>n)</code>.
 * @author Sean A. Irvine
 */
public class A018804 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum = sum.add(Euler.phi(d).multiply(mN / d.longValue()));
    }
    return sum;
  }
}
