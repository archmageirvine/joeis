package irvine.oeis.a046;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046736 Number of ways to place non-intersecting diagonals in convex n-gon so as to create no triangles.
 * @author Sean A. Irvine
 */
public class A046736 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN + k - 2, k).multiply(Binomial.binomial(mN - k - 3, k - 1)));
    }
    return sum.divide(mN - 1);
  }
}
