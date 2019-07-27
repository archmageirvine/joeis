package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A072475.
 * @author Sean A. Irvine
 */
public class A072475 extends A002808 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
