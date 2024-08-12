package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025191 a(n) = Sum_{k=0..n} T(n,k), where T is the array defined in A025177.
 * @author Sean A. Irvine
 */
public class A025191 extends A025177 {

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
