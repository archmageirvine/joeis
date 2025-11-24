package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082024 Number of partitions of n into 3 parts which have common divisors.
 * @author Sean A. Irvine
 */
public class A082024 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Z n = Z.valueOf(mN);
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(Functions.SQUARE_FREE_KERNEL.z(n)).divisors()) {
      if (!d.isOne()) {
        sum = sum.add(Z.NEG_ONE.pow(Functions.OMEGA.l(d)).multiply(n.divide(d).square().add(6).divide(12)));
      }
    }
    return sum.negate();
  }
}
