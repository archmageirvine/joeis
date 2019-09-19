package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026164 <code>a(n) = Sum{T(n,k)}, k = 0,1,...,n</code>, where T is the array in <code>A026148</code>.
 * @author Sean A. Irvine
 */
public class A026164 extends A026148 {

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
