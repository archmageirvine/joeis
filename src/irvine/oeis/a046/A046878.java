package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046878 Numerator of (1/n)*Sum_{k=0..n-1} 1/binomial(n-1,k) for n&gt;0 else 0.
 * @author Sean A. Irvine
 */
public class A046878 implements Sequence {

  private long mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return select(Q.ZERO);
    }
    Q sum = Q.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(new Q(Z.ONE, Binomial.binomial(mN - 1, k)));
    }
    return select(sum.divide(mN));
  }
}
