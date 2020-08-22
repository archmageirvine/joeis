package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a019.A019538;

/**
 * A002869 Largest number in n-th row of triangle A019538.
 * @author Sean A. Irvine
 */
public class A002869 extends A019538 {

  private long mN = -1;

  @Override
  public Z next() {
    Z m = Z.ONE;
    ++mN;
    for (int k = 1; k <= mN; ++k) {
      m = m.max(super.next());
    }
    return m;
  }
}
