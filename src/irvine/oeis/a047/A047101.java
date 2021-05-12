package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047101 Sum{T(i,n-i): i=0,1,...,n}, array T as in A047100.
 * @author Sean A. Irvine
 */
public class A047101 extends A047100 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(k, mN - k));
    }
    return sum;
  }
}
