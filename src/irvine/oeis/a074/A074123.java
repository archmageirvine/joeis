package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A074123 Group successively larger composite numbers so that the sum of the n-th group is a multiple of n. Sequence gives group sum divided by n for the n-th group.
 * @author Sean A. Irvine
 */
public class A074123 extends A002808 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    do {
      sum = sum.add(super.next());
    } while (sum.mod(mN) != 0);
    return sum.divide(mN);
  }
}
