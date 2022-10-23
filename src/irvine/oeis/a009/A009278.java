package irvine.oeis.a009;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009278 a(n) = lcm(d(n), sigma(n)).
 * @author Sean A. Irvine
 */
public class A009278 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final FactorSequence fs = Jaguar.factor(mN);
    return fs.sigma().lcm(fs.sigma0());
  }
}
