package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057642 (Product k^k) * (Sum 1/k^k) where both the sum and product are over those positive integers k that divide n.
 * @author Sean A. Irvine
 */
public class A057642 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    Q sum = Q.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      final Z dd = d.pow(d);
      prod = prod.multiply(dd);
      sum = sum.add(new Q(Z.ONE, dd));
    }
    return sum.multiply(prod).toZ();
  }
}
