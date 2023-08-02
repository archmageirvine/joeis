package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006129 a(0), a(1), a(2), ... satisfy Sum_{k=0..n} a(k)*binomial(n,k) = 2^binomial(n,2), for n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A006129 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, Binomial.binomial(mN, k).shiftLeft((long) k * (k - 1) / 2));
    }
    return sum;
  }
}
