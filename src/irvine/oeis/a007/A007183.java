package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007183 Maximal splittance of a planar graph with n nodes.
 * @author Sean A. Irvine
 */
public class A007183 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN <= 12) {
      return Binomial.binomial(mN, 2).subtract(mN * mN / 4).divide2();
    } else if (mN <= 14) {
      return Z.valueOf((mN - 6) * 5 / 2 - 1);
    } else if (mN <= 22) {
      return Z.valueOf((mN - 6) * 5 / 2);
    } else {
      return Z.valueOf(3 * mN - 27);
    }
  }
}
