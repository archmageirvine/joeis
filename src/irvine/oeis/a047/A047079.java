package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047079 T(i,n-2i) for n=0,1,2,...,[ n/2 ], array T as in A047072.
 * @author Sean A. Irvine
 */
public class A047079 extends A047072 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(get(k, mN - 2 * k));
    }
    return sum;
  }
}
