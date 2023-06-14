package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A064141 Sum of non-unitary divisors of central binomial coefficient C(n, floor(n/2)).
 * @author Sean A. Irvine
 */
public class A064141 extends A001405 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(super.next());
    return fs.sigma().subtract(fs.unitarySigma());
  }
}
