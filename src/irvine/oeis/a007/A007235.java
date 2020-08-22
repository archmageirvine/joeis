package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007235 Structure constants for certain representations of S_n.
 * @author Sean A. Irvine
 */
public class A007235 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  private Z b(final int k, final int n) {
    Q sum = Q.ZERO;
    for (int j = 0; j < k; ++j) {
      sum = sum.add(new Q(Z.valueOf(j + 1), Binomial.binomial(k - 1, j).multiply(Binomial.binomial(k, j))));
    }
    sum = sum.multiply(new Q(Z.valueOf(k + 1), Binomial.binomial(n, k)));
    sum = sum.add(Q.ONE.signedAdd((k & 1) == 1, new Q(Z.ONE, Binomial.binomial(n, k))).multiply(new Q(n, n + 1)));
    return sum.multiply(mF.factorial(n)).toZ().multiply2().divide(Z.valueOf(k).square().multiply(n - k).multiply(n - k));
  }

  @Override
  public Z next() {
    return b(++mN, 2 * mN + 2);
  }
}
