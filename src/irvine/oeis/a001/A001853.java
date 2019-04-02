package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a034.A034781;

/**
 * A001853 Total height of trees with n nodes.
 * @author Sean A. Irvine
 */
public class A001853 extends A034781 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      s = s.add(t(mN, k).multiply(k));
    }
    return s;
  }
}
