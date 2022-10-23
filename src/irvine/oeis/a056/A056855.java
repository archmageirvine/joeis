package irvine.oeis.a056;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056855 a(n) = (Product k) * (Sum 1/k), where both the product and the sum are over those positive integers k, where k &lt;= n and gcd(k,n) = 1.
 * @author Sean A. Irvine
 */
public class A056855 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    Z prod = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      if (LongUtils.gcd(k, mN) == 1) {
        sum = sum.add(new Q(1, k));
        prod = prod.multiply(k);
      }
    }
    return sum.multiply(prod).toZ();
  }
}

