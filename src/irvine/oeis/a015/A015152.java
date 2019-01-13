package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015152.
 * @author Sean A. Irvine
 */
public class A015152 extends A015109 {

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
