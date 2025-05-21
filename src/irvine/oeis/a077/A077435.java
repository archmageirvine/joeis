package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a279.A279433;

/**
 * A077435 Number of right triangles whose vertices are lattice points in {1,2,...,n} X {1,2,...,n}.
 * @author Sean A. Irvine
 */
public class A077435 extends A279433 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long i = 1; i <= mN; ++i) {
      for (long j = 1; j <= i; ++j) {
        sum = sum.add(Z.valueOf(t(i, j)).multiply(mN - j + 1).multiply(mN - i + 1).multiply(i == j ? 1 : 2));
      }
    }
    return sum;
  }
}
