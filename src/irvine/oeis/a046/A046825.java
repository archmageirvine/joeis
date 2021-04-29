package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046825 Numerator of Sum_{k=0..n} 1/binomial(n,k).
 * @author Sean A. Irvine
 */
public class A046825 implements Sequence {

  private long mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(new Q(Z.ONE, Binomial.binomial(mN, k)));
    }
    return select(sum);
  }
}
