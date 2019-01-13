package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a034.A034855;

/**
 * A001854.
 * @author Sean A. Irvine
 */
public class A001854 extends A034855 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      s = s.add(r(mN, k).multiply(k));
    }
    return s;
  }
}
