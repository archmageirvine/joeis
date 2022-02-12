package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054586 Sum_{d|2n+1} phi(d)*mu(d).
 * @author Sean A. Irvine
 */
public class A054586 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    Z prod = Z.ONE;
    for (final Z p : Cheetah.factor(mN).toZArray()) {
      prod = prod.multiply(Z.TWO.subtract(p));
    }
    return prod;
  }
}
