package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027067 a(n) = Sum_{k=n..2*n} T(n,k), T given by A027052.
 * @author Sean A. Irvine
 */
public class A027067 extends A027052 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 2 * mN; k >= mN; --k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
