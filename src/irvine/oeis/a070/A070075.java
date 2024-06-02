package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070075 Stirling transform of A021009.
 * @author Sean A. Irvine
 */
public class A070075 extends Sequence0 {

  private int mN = -1;

  private Q laguerre(final int n, final int x) {
    Q sum = Q.ZERO;
    Z xk = Z.ONE;
    for (int k = 0; k <= n; ++k, xk = xk.multiply(x)) {
      sum = sum.signedAdd((k & 1) == 0, new Q(xk.multiply(Binomial.binomial(n, k)), Functions.FACTORIAL.z(k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Rationals.SINGLETON.sum(0, mN, k -> laguerre(k, -1).multiply(Functions.STIRLING2.z(mN, k)).multiply(Functions.FACTORIAL.z(k))).toZ();
  }
}
