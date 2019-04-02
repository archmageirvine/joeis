package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A005330 Certain subgraphs of a directed graph.
 * @author Sean A. Irvine
 */
public class A005330 extends A005328 {

  private int mN = 1;

  protected Z xi(final int n, final int k) {
    Q sum = Q.ZERO;
    for (int i = 0; i <= n - k; ++i) {
      final Z b = Binomial.binomial(n - 1, i).multiply(get(n - 1 - i));
      for (int j = 0; j <= n - k - i; ++j) {
        sum = sum.signedAdd((j & 1) == 0, new Q(b.multiply(Binomial.binomial(n - 1 - i - j, k - 1)), get(j)));
      }
    }
    return sum.toZ();
  }

  @Override
  public Z next() {
    return xi(++mN, 2);
  }
}
