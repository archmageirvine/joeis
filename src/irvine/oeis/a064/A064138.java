package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A064138 Sum of non-unitary divisors of n!.
 * @author Sean A. Irvine
 */
public class A064138 extends A000142 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(super.next());
    return fs.sigma().subtract(fs.unitarySigma());
  }
}
