package irvine.oeis.a027;

import irvine.math.q.Q;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027643 Numerators of poly-Bernoulli numbers <code>B_n^(k)</code> with <code>k=2</code>.
 * @author Sean A. Irvine
 */
public class A027643 implements Sequence {

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
      sum = sum.signedAdd((k & 1) == 0, new Q(Stirling.secondKind(mN, k).multiply(f), Z.valueOf(k + 1).pow(power())));
    }
    if ((mN & 1) == 1) {
      sum = sum.negate();
    }
    return select(sum);
  }
}
