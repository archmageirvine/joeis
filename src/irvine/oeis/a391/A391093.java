package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.a386.A386681;

/**
 * A391093 a(n) is the number of closed binary operations on a set of n labeled elements with a closed center.
 * @author Sean A. Irvine
 */
public class A391093 extends A386681 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}
