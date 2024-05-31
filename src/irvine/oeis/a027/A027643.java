package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027643 Numerators of poly-Bernoulli numbers B_n^(k) with k=2.
 * @author Sean A. Irvine
 */
public class A027643 extends Sequence0 {

  private long mN = -1;

  protected int power() {
    return 2;
  }

  protected Z select(final Q q) {
    return q.num();
  }

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    Z f = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      if (k > 1) {
        f = f.multiply(k);
      }
      sum = sum.signedAdd((k & 1) == 0, new Q(Functions.STIRLING2.z(mN, k).multiply(f), Z.valueOf(k + 1).pow(power())));
    }
    if ((mN & 1) == 1) {
      sum = sum.negate();
    }
    return select(sum);
  }
}
