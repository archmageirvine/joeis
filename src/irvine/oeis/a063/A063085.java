package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063085 a(n) = usigma(n) - (phi(n) + d(n)), where usigma(n) is the sum of the unitary divisors of n and d(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A063085 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.unitarySigma().subtract(fs.phi()).subtract(fs.sigma0());
  }
}
