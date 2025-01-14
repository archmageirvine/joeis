package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074180 a(1) = 1, a(n) = smallest multiple of n divisible by the product of all previous terms.
 * @author Sean A. Irvine
 */
public class A074180 extends Sequence1 {

  private long mN = 0;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z res = mProd.lcm(mN);
    mProd = mProd.multiply(res);
    return res;
  }
}
