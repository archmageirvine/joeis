package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074129 Group successively larger prime numbers so that the sum of the n-th group is a multiple of n. Sequence gives the first term of each group.
 * @author Sean A. Irvine
 */
public class A074129 extends A000040 {

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
