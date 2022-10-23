package irvine.oeis.a028;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028572 Expansion of theta_3(z)*theta_3(2z) + theta_2(z)*theta_2(2z) in powers of q^(1/4).
 * @author Sean A. Irvine
 */
public class A028572 extends Sequence0 {

  private long mN = -1;
  
  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (((mN - 1) & 3) <= 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (d.isOdd()) {
        sum = sum.add(LongUtils.jacobi(-2, d.longValue()));
      }
    }
    return sum.multiply2();
  }
}
