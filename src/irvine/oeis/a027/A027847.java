package irvine.oeis.a027;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027847 a(n) = Sum_{d|n} sigma(n/d)*d^3.
 * @author Sean A. Irvine
 */
public class A027847 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      s = s.add(d.pow(3).multiply(Cheetah.factor(mN / d.longValue()).sigma()));
    }
    return s;
  }
}
