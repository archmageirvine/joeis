package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023023.
 * @author Sean A. Irvine
 */
public class A023023 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.ONE;
    }
    Z prod = Z.valueOf(mN).square();
    for (final Z p : Cheetah.factor(mN).toZArray()) {
      final Z p2 = p.square();
      prod = prod.multiply(p2.subtract(1)).divide(p2);
    }
    return prod.divide(12);
  }
}
