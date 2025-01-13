package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A074121 Group successively larger composite numbers so that the sum of the n-th group is a multiple of n. Sequence gives the first term in each group.
 * @author Sean A. Irvine
 */
public class A074121 extends A002808 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z res = super.next();
    Z sum = res;
    while (sum.mod(mN) != 0) {
      sum = sum.add(super.next());
    }
    return res;
  }
}
