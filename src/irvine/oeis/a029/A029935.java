package irvine.oeis.a029;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029935 <code>a(n) =</code> Sum <code>phi(d)*phi(n/d);</code> d divides <code>n</code>.
 * @author Sean A. Irvine
 */
public class A029935 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      sum = sum.add(Euler.phi(d).multiply(Euler.phi(mN.divide(d))));
    }
    return sum;
  }
}
