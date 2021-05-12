package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047074 Sum{T(i,n-i): i=0,1,...,[ n/2 ]}, array T as in A047072.
 * @author Sean A. Irvine
 */
public class A047074 extends A047072 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(get(k, mN - k));
    }
    return sum;
  }
}
