package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389829 allocated for David Pasino.
 * @author Sean A. Irvine
 */
public class A389829 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      final Z b = Binomial.binomial(mN, k).multiply(Z.valueOf(k).pow(mN - k)).multiply(Functions.FACTORIAL.z(k));
      for (final Z d : Jaguar.factor(k).divisors()) {
        sum = sum.add(b.divide(Functions.FACTORIAL.z(d)).divide(Functions.FACTORIAL.z(k / d.longValue())));
      }
    }
    return sum;
  }
}
