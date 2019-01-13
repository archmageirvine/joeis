package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.a000.A000369;

/**
 * A016036.
 * @author Sean A. Irvine
 */
public class A016036 extends A000369 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    Z sum = Z.ZERO;
    while (--m >= 0) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
