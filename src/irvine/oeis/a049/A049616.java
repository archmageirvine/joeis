package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049616 a(n)=Sum{T(i,n-i): i=0,1,...,n}, array T as in A049615.
 * @author Sean A. Irvine
 */
public class A049616 extends A049615 {

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
