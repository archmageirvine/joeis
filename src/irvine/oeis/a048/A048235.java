package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048235 a(n)=Sum{T(n,j): j=1,2,...,n}, array T given by A048225.
 * @author Sean A. Irvine
 */
public class A048235 extends A048225 {

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
