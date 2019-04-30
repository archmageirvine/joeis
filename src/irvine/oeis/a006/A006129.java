package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006129 <code>a(0), a(1), a(2), .</code>.. satisfy <code>Sum_{k=0..n} a(k)*binomial(n,k) = 2^binomial(n,2)</code>, for <code>n &gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A006129 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, Binomial.binomial(mN, k).shiftLeft(k * (k - 1) / 2));
    }
    return sum;
  }
}
