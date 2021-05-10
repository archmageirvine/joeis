package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047041 Sum{T(i,n-i): i=0,1,...,n}, array T as in A047040; Sum{T(i,n-i): i=0,1,...,n}, array T given by A047050.
 * @author Sean A. Irvine
 */
public class A047041 extends A047040 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = 0; m < mN; ++m) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
