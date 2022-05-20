package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057020 Numerator of (sum of divisors of n / number of divisors of n).
 * @author Sean A. Irvine
 */
public class A057020 implements Sequence {

  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return select(new Q(fs.sigma(), fs.sigma0()));
  }
}
