package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026680 Sum{T(n-k,k)}, 0&lt;=k&lt;=[ n/2 ], T given by A026670.
 * @author Sean A. Irvine
 */
public class A026680 extends A026670 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(get(mN - k, k));
    }
    return sum;
  }
}
