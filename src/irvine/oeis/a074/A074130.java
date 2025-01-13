package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074130 Group successively larger prime numbers so that the sum of the n-th group is a multiple of n. Sequence gives the number of prime in each group.
 * @author Sean A. Irvine
 */
public class A074130 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    long cnt = 0;
    do {
      sum = sum.add(super.next());
      ++cnt;
    } while (sum.mod(mN) != 0);
    return Z.valueOf(cnt);
  }
}
