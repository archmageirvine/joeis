package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029817 Average theta series of odd unimodular lattices of dimension 16 (multiplied by 17).
 * @author Sean A. Irvine
 */
public class A029817 extends Sequence0 {

  // After Michael Somos

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.valueOf(17);
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      sum = sum.add(d.pow(7));
      if (d.mod(4) == 2) {
        sum = sum.subtract(d.divide2().pow(7).multiply2());
      }
    }
    return sum.multiply(32);
  }
}
