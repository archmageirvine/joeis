package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027848 a(n) = Sum_{ d|n } sigma(n/d)*d^4.
 * @author Sean A. Irvine
 */
public class A027848 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      s = s.add(d.pow(4).multiply(Functions.SIGMA1.z(mN / d.longValue())));
    }
    return s;
  }
}
