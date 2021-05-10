package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047011 Sum{T(i,n-i): i=0,1,...,n}, array T given by A047010.
 * @author Sean A. Irvine
 */
public class A047011 extends A047010 {

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
