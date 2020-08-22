package irvine.oeis.a029;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029821 Average theta series of odd unimodular lattices of dimension 20 (multiplied by 31).
 * @author Sean A. Irvine
 */
public class A029821 implements Sequence {

  // After Michael Somos

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.valueOf(31);
    }
    Z res = Cheetah.factor(mN).sigma(9);
    if ((mN & 3) == 0) {
      res = res.subtract(Cheetah.factor(mN / 4).sigma(9).multiply(1024));
    }
    return res.multiply(8);
  }
}
