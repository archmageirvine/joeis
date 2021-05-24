package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a049.A049604;

/**
 * A047876 a(n) = Sum{T(i,n-i): i=0,1,...,n}, array T as in A049604.
 * @author Sean A. Irvine
 */
public class A047876 extends A049604 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
