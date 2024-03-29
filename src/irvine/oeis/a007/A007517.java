package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007517 a(n) = phi(n) * (sigma(n) - n).
 * @author Sean A. Irvine
 */
public class A007517 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.phi().multiply(fs.sigma().subtract(mN));
  }
}
