package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a034.A034854;

/**
 * A001852 Total diameter of labeled trees with n nodes.
 * @author Sean A. Irvine
 */
public class A001852 extends A034854 {

  {
    setOffset(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int k = 2; k < mN; ++k) {
      s = s.add(t(k, mN).multiply(k));
    }
    return s;
  }
}
