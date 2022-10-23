package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057155 Denominator of Sum_{k&lt;=n} P(k)/p(k), where p(k) (resp. P(k)) is smallest (resp. largest) prime divisor of k.
 * @author Sean A. Irvine
 */
public class A057155 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private long mN = 0;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    mSum = mSum.add(new Q(fs.largestPrimeFactor(), fs.leastPrimeFactor()));
    return select(mSum);
  }
}

