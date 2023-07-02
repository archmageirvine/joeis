package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064366 Special binomial coefficient: a(n) = C(sigma(n), phi(n)).
 * @author Sean A. Irvine
 */
public class A064366 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return Binomial.binomial(fs.sigma(), fs.phi());
  }
}
