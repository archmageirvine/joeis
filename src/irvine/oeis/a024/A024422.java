package irvine.oeis.a024;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024422 <code>a(n) = [</code> (sum of <code>S(n,m)/C(n-1,m-1) ]</code> for m <code>= 1,2,...,n; S(n,m)</code> are Stirling numbers of second kind.
 * @author Sean A. Irvine
 */
public class A024422 implements Sequence {

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
