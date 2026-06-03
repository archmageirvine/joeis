package irvine.oeis.a085;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085115 Numerator of G(n) = Sum_{k=1..n} (1/(2*2^k)) * Sum_{j=0..k-1} 1/binomial(2^(k-j)+j,j).
 * @author Sean A. Irvine
 */
public class A085115 extends Sequence1 {

  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (long k = 1; k <= mN; ++k) {
      final long kk = k;
      sum = sum.add(Rationals.SINGLETON.sum(0, k - 1, j -> new Q(Z.ONE, Binomial.binomial(Z.ONE.shiftLeft(kk - j).add(j), j)).divide(Z.ONE.shiftLeft(kk + 1))));
    }
    return select(sum);
  }
}

