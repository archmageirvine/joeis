package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025191 <code>a(n) = Sum{T(n,k)}, k = 0,1,...,n</code>, where T is the array defined in <code>A025177</code>.
 * @author Sean A. Irvine
 */
public class A025191 extends A025177 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
