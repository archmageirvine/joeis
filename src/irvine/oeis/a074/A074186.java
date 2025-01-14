package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074186 a(1) = 1; a(n) is the largest number such that the product of all previous terms is &lt; n^n.
 * @author Sean A. Irvine
 */
public class A074186 extends Sequence1 {

  private long mN = 0;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z min = Z.valueOf(mN).pow(mN);
    final Z res = min.subtract(1).divide(mProd);
    mProd = mProd.multiply(res);
    return res;
  }
}
