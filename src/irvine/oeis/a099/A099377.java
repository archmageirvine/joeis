package irvine.oeis.a099;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A099377 Numerators of the harmonic means of the divisors of the positive integers.
 * @author Sean A. Irvine
 */
public class A099377 extends Sequence1 {

  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return select(new Q(fs.sigma0().multiply(mN), fs.sigma()));
  }
}
