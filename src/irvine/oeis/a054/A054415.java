package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054415 Smallest prime factor of n!-1 (for n&gt;2), a(2)=1.
 * @author Sean A. Irvine
 */
public class A054415 implements Sequence {

  private int mN = 1;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return Jaguar.factor(mF.subtract(1)).toZArray()[0];
  }
}
