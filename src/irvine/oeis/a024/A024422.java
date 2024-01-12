package irvine.oeis.a024;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024422 a(n) = floor(Sum_{m=1..n} Stirling2(n,m) / binomial(n-1,m-1)).
 * @author Sean A. Irvine
 */
public class A024422 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(new Q(Stirling.secondKind(mN, k), Binomial.binomial(mN - 1, k - 1)));
    }
    return sum.toZ();
  }
}
