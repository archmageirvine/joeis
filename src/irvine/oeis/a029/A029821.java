package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029821 Average theta series of odd unimodular lattices of dimension 20 (multiplied by 31).
 * @author Sean A. Irvine
 */
public class A029821 extends Sequence0 {

  // After Michael Somos

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.valueOf(31);
    }
    Z res = Jaguar.factor(mN).sigma(9);
    if ((mN & 3) == 0) {
      res = res.subtract(Jaguar.factor(mN / 4).sigma(9).multiply(1024));
    }
    return res.multiply(8);
  }
}
