package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074128 Group successively larger prime numbers so that the sum of the n-th group is a multiple of n. Sequence gives the sum for each group.
 * @author Sean A. Irvine
 */
public class A074128 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    do {
      sum = sum.add(super.next());
    } while (sum.mod(mN) != 0);
    return sum;
  }
}
